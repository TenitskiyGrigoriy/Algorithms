package Algorithms_with_Andrey.andrey_the_first;

import java.util.Scanner;

/**
 * Determine whether using only the operations “add 3” and “add 5” you can get the number N from the number 1
 * (N is a natural number, does not exceed 200. Of course, the number 1 itself can be obtained simply without applying any operations.
 *
 * Input data
 * The number N is entered.
 *
 * Output
 * Print the word YES if the number N can be obtained from the number 1, or NO - otherwise.
 */
public class GetNumber_N_From_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (recursion(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

    public static boolean recursion(int n) {
        if (n == 1) {
            return true;
        } else if (n <= 0) {
            return false;
        }
        return recursion(n - 5) || recursion(n - 3);
    }
}

