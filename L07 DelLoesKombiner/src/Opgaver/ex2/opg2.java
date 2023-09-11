package Opgaver.ex2;

import java.util.ArrayList;
import java.util.List;

public class opg2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(9, 1, 2, 0, 93, 0, 83, 1, 90, 0, 82, 0));
        System.out.println(sum(list));
    }

    public static int sum(ArrayList<Integer> list) {
        return valueNull(list, 0, list.size() - 1);
    }

    private static int valueNull(ArrayList<Integer> list, int l, int h) {
        if (l == h) {
            if (list.get(l) == 0) {
                return 1;
            } else {
                return 0;
            }
        } else {
            int m = (l + h) / 2;
            int value1 = valueNull(list, l, m);
            int value2 = valueNull(list, m + 1, h);
            return value1 + value2;
            }
        }
    }
