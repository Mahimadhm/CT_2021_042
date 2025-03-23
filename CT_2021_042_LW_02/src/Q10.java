import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount : ");
        double loan = scanner.nextDouble();
        System.out.print("Enter the loan period (years) : ");
        double loanPeriod = scanner.nextDouble();
        System.out.print("Enter the annual interest rate in percentage: ");
        double annualInterestRate = scanner.nextDouble();

        final double MONTHS_IN_YEAR = 12;
        double monthlyInterestRate = (annualInterestRate / 100.0) / MONTHS_IN_YEAR;
        double numberOfPayments = loanPeriod * MONTHS_IN_YEAR;
        double monthlyPayment = (loan * monthlyInterestRate) / (1 - Math.pow(1 / (1 + monthlyInterestRate), numberOfPayments));
        double totalPayment = monthlyPayment * numberOfPayments;

        System.out.println("Monthly payment: Rs " + "Rs " + monthlyPayment);
        System.out.println("Total payment after " + loanPeriod + " years: Rs " + totalPayment);

    }
}