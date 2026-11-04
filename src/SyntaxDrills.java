public class SyntaxDrills {

    public static void main(String[] args) {

        //1.Identifier Validation

        int age = 20;
        int _count = 5;
        int $price = 100;
        // int 2ndPlace = 2;   //a name cannot start with a digit
        // int my-var = 3;     //'-' is the minus operator, not allowed in names
        // int class = 4;      //'class' is a reserved keyword


        //2.Case Sensitivity

        int score = 1;
        int Score = 2;
        int SCORE = 3;

        System.out.println("score " + score);
        System.out.println("Score " + Score);
        System.out.println("SCORE " + SCORE);

    }



}
