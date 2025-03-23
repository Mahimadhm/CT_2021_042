import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weight : ");
        double bodyWeight = scanner.nextDouble();

        double calories = bodyWeight * 19;
        System.out.println("Your Weight is " + bodyWeight);
        System.out.println("You need approximately " + calories + " calories per day.");
    }
}
