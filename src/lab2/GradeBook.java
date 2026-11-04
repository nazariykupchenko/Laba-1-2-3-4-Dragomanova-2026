package lab2;

public class GradeBook {

    // 1. Class variables (state)

    String studentName;
    int assignmentScore;   // 0-100
    int examScore;         // 0-100
    double finalGrade;

    // 2. Constructor (initialization)

    public GradeBook(String name, int aScore, int eScore) {
        studentName = name;
        assignmentScore = aScore;
        examScore = eScore;
    }

    // 3a. Calculate the weighted grade: assignments 40%, exam 60%.

    public void calculateResult() {
        finalGrade = (double) assignmentScore * 40 / 100 + (double) examScore * 60 / 100;
    }

    // 3b. Print the report using escape characters (\n and \t).

    public void displaySummary() {
        System.out.println("Name:\t\t\t" + studentName
                + "\nRaw Scores:\t\t" + assignmentScore + " | " + examScore
                + "\nFinal Weighted Grade:\t" + finalGrade + "%");
    }

    // 4. Entry point
    public static void main(String[] args) {
        GradeBook alex = new GradeBook("Alex", 77, 85);
        alex.calculateResult();
        alex.displaySummary();
    }




}
