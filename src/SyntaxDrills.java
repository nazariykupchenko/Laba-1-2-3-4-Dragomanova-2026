public class SyntaxDrills {

    public static void main(String[] args) {

        //1. Identifier Validation

        int age = 20;
        int _count = 5;
        int $price = 100;
        // int 2ndPlace = 2;   //a name cannot start with a digit
        // int my-var = 3;     //'-' is the minus operator, not allowed in names
        // int class = 4;      //'class' is a reserved keyword


        //2. Case Sensitivity

        int score = 1;
        int Score = 2;
        int SCORE = 3;

        System.out.println("score " + score);
        System.out.println("Score " + Score);
        System.out.println("SCORE " + SCORE);


        // 3. The Constant

        final int MaxScore = 100;
//        MaxScore = 10;


        // 4. Floating Point Suffixes

//        float test = 10.5;  //The default data type for decimal numbers is double.


        //5. String vs Char

        char c = 'A';
        String s = "A";

       // c=s;  //char is a primitive holding ONE character (single quotes);
                // String is an object holding a sequence of characters (double quotes).


        //6. Integer Truncation

        int a = 10;
        int b = 3;
        double result = a / b;

        System.out.println("a / b stored in double = " + result);
        // Prints 3.0, not 3.33: both operands are int, so Java does INTEGER division
        // first (10 / 3 = 3, the fraction is dropped). Only after that is the int 3
        // widened to the double 3.0. The decimals were already lost.


        //7. Implicit Widening

        byte small = 100;
        long big = small;   // byte (8-bit) fits into long (64-bit): no cast needed
        System.out.println("byte -> long: " + big);

        // 8. Explicit Narrowing

        double d = 9.99;
        int truncated = (int) d;   // the cast cuts off the fraction, it does NOT round
        System.out.println("(int) 9.99 = " + truncated);

        // 9. The Modulus Logic

        int number = 157;
        int remainder = number % 2;

        if (remainder == 0) {
            System.out.println("157 is even");
        }
        else {
            System.out.println("157 is odd");
        }

        // 10. Escape Formatting

        System.out.println("1\t2\t3\n4\t5\t6\n7\t8\t9");


        // 11. Array Bounds

        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        //arr[3] = 40; // ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3


        // 12. Array Shortcut

        int[] favorites = {7, 13, 15, 21, 17};
        System.out.println("First: " + favorites[0]);
        System.out.println("Last: " + favorites[favorites.length - 1]);


    }



}
