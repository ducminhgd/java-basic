package dev.ducminhgd.numeric;

import java.util.Scanner;

public class Sum {
    public static int toN(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result = result + i;
        }
        return result;
    }

    public static int oddToN(int n) {
        int result = 0;
        for (int i = 1; i <= n; i += 2) {
            result = result + i;
        }
        return result;
    }

    public static int evenToN(int n) {
        int result = 0;
        for (int i = 2; i <= n; i += 2) {
            result = result + i;
        }
        return result;
    }

    /**
     * Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer. For example, if an integer is 932, the sum of all its digits is 14.
     *
     * From Bing
     * @param num
     * @return
     */
    public static int sumDigits(int num) {
        int sum = 0;
        int lastDigit;
        while (num !=0) {
            lastDigit = num % 10;
            sum += lastDigit;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = Integer.parseInt(s.nextLine());

        System.out.print("SumDigits: " + sumDigits(n));
    }
}
