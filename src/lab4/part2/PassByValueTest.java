package lab4.part2;

public class PassByValueTest {

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("  inside swap: a = " + a + ", b = " + b);
    }

    static void changeName(Student s) {
        s.name = "Changed";
    }

    static void replaceStudent(Student s) {
        s = new Student("New Person");
        System.out.println("  inside replaceStudent: s.name = " + s.name);
    }


    public static void main(String[] args) {
        // 1) swap
        int x = 1, y = 2;
        System.out.println("Before swap: x = " + x + ", y = " + y);
        swap(x, y);
        System.out.println("After swap:  x = " + x + ", y = " + y);

        // 2) changeName
        Student student = new Student("Original");
        System.out.println("Before changeName: " + student.name);
        changeName(student);
        System.out.println("After changeName:  " + student.name);

        // 3) replaceStudent
        System.out.println("Before replaceStudent: " + student.name);
        replaceStudent(student);
        System.out.println("After replaceStudent:  " + student.name);
    }

}

// 1. swap(): Changes only copies of the original int values.
// 2. changeName(): Changes the name of the original Student object.
// 3. replaceStudent(): Creates a new object but does not change the original reference.
