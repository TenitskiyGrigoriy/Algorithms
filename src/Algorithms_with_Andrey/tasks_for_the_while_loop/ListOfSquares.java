package Algorithms_with_Andrey.tasks_for_the_while_loop;

import java.util.Scanner;

/**
 * Input data
 * A single integer N is given
 *
 * Output data
 * It is necessary to output all the exact squares of natural numbers that do not exceed a given number N.
 */

public class ListOfSquares {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int n = intScanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i * i <= n) {
                System.out.println(i * i);
            }
        }

    }
}
