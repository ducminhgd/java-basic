package dev.ducminhgd;

import dev.ducminhgd.calc.Sum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input n: ");

        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("SumToN: " + Sum.SumToN(n));
        System.out.println("SumOddToN: " + Sum.SumOddToN(n));
        System.out.println("SumEvenToN: " + Sum.SumEvenToN(n));
    }
}