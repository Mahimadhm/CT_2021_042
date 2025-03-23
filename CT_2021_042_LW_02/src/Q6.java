import java.util.GregorianCalendar;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GregorianCalendar  today = new GregorianCalendar();
        System.out.println(today.getTime());
        int currentYear = today.get(GregorianCalendar.YEAR);

        System.out.print("Enter the year you were born: ");
        int birthYear = scanner.nextInt();
        int age = currentYear - birthYear;
        System.out.println("You were born in " + birthYear + " and will be " + age + " this year.");
    }
}
