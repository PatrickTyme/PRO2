package Opgaver.ex7;

public class opg7 {

    /**
     * A domino block is sized 2*1. An n-strip is a board sized 2*n. Make a method that calculates
     * the number of ways an n-strip can be covered with domino blocks.
     * Hint: First you must find the recursive formula for the function
     * f(n) = number of ways an n-strip can be covered with domino blocks
     */

    //Fibonacci metode
    // N-strip skal dækkes enten med 1 lodret for at fylde ud, eller 2 vandrette, ergo f(n) = f(n-1) + f(n-2)

    public static void main(String[] args) {
        System.out.println(domino(4));
    }
    public static int domino(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        }
        return domino(n - 1) + domino(n - 2);
    }

}