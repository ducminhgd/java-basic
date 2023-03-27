package dev.ducminhgd.numeric;

public class Sum {
    public static int SumToN(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result = result + i;
        }
        return result;
    }

    public static int SumOddToN(int n) {
        int result = 0;
        for (int i = 1; i <= n; i += 2) {
            result = result + i;
        }
        return result;
    }

    public static int SumEvenToN(int n) {
        int result = 0;
        for (int i = 2; i <= n; i += 2) {
            result = result + i;
        }
        return result;
    }
}
