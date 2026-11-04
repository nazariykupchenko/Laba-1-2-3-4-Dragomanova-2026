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
