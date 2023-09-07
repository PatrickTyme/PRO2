package Opgaver.ex3;

public class opg3 {
    public static void main(String[] args) {
        System.out.println(prod(2, 4));
    }

    public static int prod(int a, int b) {
        if (a == 0) {
            return 0;
        } else {
            return prod(a - 1, b) + b;
        }
    }

    /** Eks: bliver ovenstående med 4*5 til 3*5 + 5
     3*5 til 2*5 + 5 + 5
        2*5 til 1*5 + 5 + 5 + 5
        1*5 til 0*5 + 5 + 5 + 5 + 5
     fordi 1 * b = b
     */

    public static int prodRus(int a, int b) {
        int result = 0;
        if (a >= 2 && a % 2 == 0) {
            result = prodRus(a / 2, b) + (b + b);
        } else if (a >= 1 && a % 2 != 0) {
            return result = prodRus(a - 1, b) + b;
        }
        return result;
    }
}
/** Eks: bliver ovenstående med 4*5 til 2*10
 * = 2*10 til 1*20
 * = 1*20 til 0*20 + 20
 * = 0*20 + 20 til 0 + 20
 * Den halveres hver gang, og hvis den er ulige, så lægges b til resultatet
 */
