import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount : ");
        double P = scanner.nextDouble();
        System.out.print("Enter the annual interest rate in percentage: ");
        double R = scanner.nextDouble();
        System.out.print("Enter the number of years : ");
        int N = scanner.nextInt();

        double amount = P * Math.pow(1 + (R / 100), N);
        double money = amount - P;
        System.out.println("Amount after " + N + " years: " + "Rs " + amount);
        System.out.println("Money earned after " + N + " years: " + "Rs "+ money);
    }
}
