package Q2;

import javax.swing.*;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        JFrame frame = new JFrame ("Q2" );
        frame.setSize(800,600);
        frame.setLocation(500,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Name :");
        String firstname = scanner.nextLine();
        System.out.println("Enter Second Name");
        String Lastname = scanner.nextLine();
        System.out.println(firstname+Lastname);
        scanner.close();


    }
}
