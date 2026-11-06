package lab4.part2;

public class BankAccount {

    private double balance;
    final String accountNumber;

    BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Deposit rejected: amount cannot be negative (" + amount + ")");
            return;                    // early return (guard clause)
        }
        balance += amount;
        System.out.println("Deposited " + amount + " -> balance " + balance);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
            return;
        }
        balance -= amount;
        System.out.println("Withdrew " + amount + " -> balance " + balance);
    }

    double getBalance() {
        return balance;
    }
}
