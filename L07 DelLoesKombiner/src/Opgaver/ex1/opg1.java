package Opgaver.ex1;

import java.util.ArrayList;
import java.util.List;

public class opg1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(8, 3, 5, 9, 12, 18, 12, 28, 23));
        System.out.println(sum(list));
    }
    /** Write a recursive method that totals all the elements in a List<Integer> */

    /**
     * Returnerer maksimum i s[l..h]
     * Krav: l <= h
     */
    public static int sum(ArrayList<Integer> list) {
            return sum(list, 0, list.size() - 1);
        }

    private static int sum(ArrayList<Integer> list, int l, int h) {
        if (l == h) {
            return list.get(l);
        } else {
            int m = (l + h) / 2;
            int sum1 = sum(list, l, m);
            int sum2 = sum(list, m + 1, h);
            return sum1 + sum2;
            }
        }
    }

