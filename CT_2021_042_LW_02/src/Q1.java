import java.util.Scanner;

import static java.lang.Math.pow;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A :");
        double A = scanner.nextDouble();
        System.out.print("Enter B number :");
        double B = scanner.nextDouble();
        System.out.print("Enter C number :");
        double C = scanner.nextDouble();

        double result = Math.sqrt(Math.pow(B, 2) + (4 * A * C));
        System.out.println("The result of (B^2 + 4AC) is: " + result);

        System.out.print("Enter X :");
        double Y = scanner.nextDouble();
        System.out.print("Enter Y number :");
        double X = scanner.nextDouble();
        double result1 = Math.sqrt(X+4*(Math.cbrt(Y)));
        System.out.println("The result of (X+4Y^3) is: " + result1);


        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is: " + area);

        scanner.close();
    }
}
