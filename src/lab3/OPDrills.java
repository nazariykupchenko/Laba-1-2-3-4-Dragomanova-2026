package lab3;

public class OPDrills {



    public static void main() {

        // 1. The Empty Blueprint
        VoidContainer voidContainer = new VoidContainer();
        System.out.println("VoidContainer created: " + (voidContainer != null));


        //3. The Case of the String
        Book book = new Book();
        System.out.println("book.title = " + book.title); //null


        // 4. Local vs. Field
        LocalVsField localVsField = new LocalVsField();
        localVsField.localVsField();


        //5. The Static Shared Secret
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        c1.count++;
        c2.count++;
        c3.count++;
        System.out.println("c1.count = " + c1.count);
        // Prints 3. A static variable belongs to the CLASS, not to each object. All three objects share one single 'count'.


        // Task 8. Default Primitives
        Defaults def = new Defaults();
        System.out.println("int: " + def.number);
        System.out.println("boolean: " + def.flag);
        System.out.println("double: " + def.amount);


    }


}


// 1. The Empty Blueprint
class VoidContainer {}


// 2. Naming Violations
//class public{}  //public is a reserved keyword

// 3. The Case of the String
class Book {
    String title;
}

// 4. Local vs. Field
class LocalVsField {
    int x = 10;

    void localVsField() {
        int x = 20;
        System.out.println("x " + x);
    }
}

//5. The Static Shared Secret
class Counter{
    static int count;

}

// 6. Final Lockdown
class FinalLockdown {
    final double PI = 3.14;

    void tryToChangePi() {
//         PI = 3.14159;
// Compiler error: cannot assign a value to final variable PI
    }
}

// Task 8. Default Primitives
class Defaults {
    int number;
    boolean flag;
    double amount;
}
