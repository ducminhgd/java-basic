package dev.ducminhgd.string;

import java.util.Scanner;

public class Check {

    /**
     * Write a program that takes a string as input and checks if the string is a palindrome. A palindrome is a word, phrase, number, or other sequence of characters that reads the same backward as forward.
     * <p>
     * From PoE
     *
     * @param s
     * @return
     */
    public static boolean isPalindrome(String s) {
        int length = s.length();
        if (length == 1) {
            return true;
        }
        for (int i = 0; i <= length / 2; i++) {
            if (s.charAt(i) != s.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input a number: ");
        String str = s.nextLine();

        if (isPalindrome(str)) {
            System.out.print(str + " is palindrome");
        } else {
            System.out.print(str + " is NOT palindrome");
        }
    }
}
