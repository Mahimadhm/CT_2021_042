import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner .nextDouble();

        final double PI = 3.14;
        double volume = (4.0 / 3.0) * PI * Math.pow(radius, 3);

        System.out.println("The volume of the sphere is: " + volume);
    }
}
