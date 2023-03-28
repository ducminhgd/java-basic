package dev.ducminhgd;

import dev.ducminhgd.numeric.Fibo;
import dev.ducminhgd.numeric.Sum;
import dev.ducminhgd.string.Count;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input n: ");

        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("SumToN: " + Sum.toN(n));
        System.out.println("SumOddToN: " + Sum.oddToN(n));
        System.out.println("SumEvenToN: " + Sum.evenToN(n));

        System.out.println("Fibo.ListToN: " + Fibo.listToN(n));


        System.out.print("Input a string: ");
        String s = scanner.nextLine();
        System.out.println("Count.CountVowels: " + Count.vowels(s));
        System.out.println("Count.CountVowels2: " + Count.vowels2(s));
    }
}