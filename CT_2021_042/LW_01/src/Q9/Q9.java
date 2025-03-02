package Q9;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String string = scanner.nextLine();

        int length = string.length();
        if (length> 0) {
            char firstChar = string.charAt(0);
            char lastChar = string.charAt(length - 1);
            System.out.println(length);
            System.out.println(firstChar);
            System.out.println(lastChar);
        } else {
        }

    }
}
