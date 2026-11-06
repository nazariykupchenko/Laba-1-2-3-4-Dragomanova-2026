package lab4.part2;

public class Program {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("1", 100.0);
        // account.accountNumber = "2";
        // error: cannot assign a value to final variable accountNumber
    }
}
