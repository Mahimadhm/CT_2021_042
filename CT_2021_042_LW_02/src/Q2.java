import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length in centimeters: ");
        double CM = scanner.nextDouble();
        double inches = CM / 2.54;
        double Feet = inches/12;
        double rest_feet = inches%12;
        System.out.println(CM + "cm convert to  " + Feet + " feet and " + rest_feet +" inches");
    }
}
