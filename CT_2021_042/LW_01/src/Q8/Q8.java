package Q8;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string containing a single exclamation mark (!):");
        String text = scanner.nextLine();
        int index = text.indexOf('!');

        if (index == -1 || text.indexOf('!', index + 1) != -1) {
            System.out.println("Error: The input must contain exactly one exclamation mark.");
            return;
        }
        String before = text.substring(0, index).trim();
        String after = text.substring(index + 1).trim();
        System.out.println(before);
        System.out.println(after);
    }
}
