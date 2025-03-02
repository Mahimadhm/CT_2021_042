package Q3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Eneter First Name :");
        String firstname = scanner.next();

        System.out.println("Enetr Middle Name :");
        String Middelname = scanner.next();

        System.out.println("Enter Last Name :");
        String Lastname = scanner.next();

        String initial = Middelname.substring(0,1);
        System.out.println(firstname+" "+initial+". "+Lastname);

        scanner.close();
    }
}
