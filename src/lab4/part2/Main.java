package lab4.part2;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Anna", "Bohdan", "Iryna", "Taras", "Olena"};
        Student last = null;

        for (int i = 0; i < names.length; i++) {
            last = new Student(names[i]);
            System.out.println("Created " + last.name + " with id " + last.id);
        }

        System.out.println();
        System.out.println("Last student's id: " + last.id);
        System.out.println("Student.studentCount: " + Student.studentCount);
    }
}
