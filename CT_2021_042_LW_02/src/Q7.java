import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter your height in centimeters: ");
        double height = scanner.nextDouble();

        double heightM = height / 100.0;
        double bmi = weight / Math.pow(heightM ,2);

        System.out.println("Your Body Mass Index (BMI) is: " + bmi);

        if (bmi >= 20 && bmi <= 25) {
            System.out.println("You are underweight.");
        } else if (bmi >= 25) {
            System.out.println("You are overweight.");
        }
    }
}
