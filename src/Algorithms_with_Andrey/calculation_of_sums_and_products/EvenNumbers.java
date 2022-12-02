package Algorithms_with_Andrey.calculation_of_sums_and_products;

import java.util.Scanner;

/**
 * Input data
 * Integers a and b are entered. It is guaranteed that a does not exceed b
 *
 * Output data
 * Print (separated by a space) all even numbers from a to b (inclusive).
 */

public class EvenNumbers {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int a = intScanner.nextInt();
        int b = intScanner.nextInt();

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
