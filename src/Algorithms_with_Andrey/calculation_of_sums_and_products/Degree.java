package Algorithms_with_Andrey.calculation_of_sums_and_products;

import java.util.Scanner;

/**
 * Write a program that calculates 2 N.
 *
 * Input data
 * A non-negative integer N is entered, which does not exceed 30.
 *
 * Output data
 * Print the number 2 N.
 */

public class Degree {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int degree = intScanner.nextInt();
        if (degree == 0) {
            System.out.println(1);
            return;
        }
        int sumN = 1;

        for (int i = 0; i < degree; i++) {
            sumN = sumN * 2;
        }

        System.out.println(sumN);
    }
}
