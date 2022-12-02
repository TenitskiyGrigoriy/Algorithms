package Algorithms_with_Andrey.calculation_of_sums_and_products;

import java.util.Scanner;

/**
 * Input data
 * 4 numbers are entered: a, b, c and d.
 *
 * Output data
 * Print all the numbers on the segment from a to b that give the remainder of c when divided by d. If there are no such numbers, then nothing needs to be output.
 */

public class Remains {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int a = intScanner.nextInt();
        int b = intScanner.nextInt();
        int c = intScanner.nextInt();
        int d = intScanner.nextInt();

        for (int i = a; i <= b; i++) {
            if (i % d == c) {
                System.out.println(i);
            }
        }

    }
}
