package Q10;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word :");
        String word = scanner.nextLine();

        scanner.close();
        int length = word.length();
        if (length % 2 == 1) {
            int middleIndex = length / 2;
            char CharM = word.charAt(middleIndex);
            System.out.println("Middle character: " + CharM);
        } else {
            System.out.println("Error: The word has odd number of characters.");
        }
    }
}
