package Q6;

import javax.swing.*;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        JFrame frame =new JFrame("Q06");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter width of the frame :");
        int width = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter height of the frame :");
        int height = Integer.parseInt(scanner.nextLine());

        frame.setSize(width,height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
