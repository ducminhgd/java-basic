package dev.ducminhgd.numeric;


import java.util.ArrayList;
import java.util.List;

public class Fibo {

    public static List<Integer> listToN(int n) {
        List<Integer> result = new ArrayList<Integer>();
        int prev = 0, next = 1, temp = 0;
        while (next <= n) {
            result.add(next);
            temp = prev;
            prev = next;
            next = next + temp;
        }
        return result;
    }
}
