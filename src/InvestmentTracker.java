/**
 * Calculates the future value of an investment using compound interest.
 *
 * Formula: Total = Principal * (1 + Rate)^Years
 *
 * Principal - the starting amount of money invested.
 * Rate - the yearly interest rate as a decimal (5% = 0.05).
 * Years - how many years the money stays invested.
 * Each year the interest is added to the balance, so the next year's
 * interest is earned on a bigger amount ("interest on interest").
 * That is why the growth factor (1 + Rate) is raised to the power of Years.</p>
 *
 * @author Nazarii Kupchenko
 */

public class InvestmentTracker {

    double principal;
    double interestRate;
    int years;

    public InvestmentTracker(double principal, double interestRate, int years) {
        this.principal = principal;
        this.interestRate = interestRate;
        this.years = years;
    }

    public double calculateTotal() {

        return principal * Math.pow(1 + interestRate, years);
    }

    public static void main(String[] args) {
        InvestmentTracker tracker = new InvestmentTracker(1000.0, 0.05, 10);
        double total = tracker.calculateTotal();

        System.out.printf("Principal:$%.2f%n", tracker.principal);
        System.out.printf("Rate:%.0f%%%n", tracker.interestRate * 100);
        System.out.printf("Years:%d%n", tracker.years);
        System.out.printf("Total:$%.2f%n", total);
    }


}
