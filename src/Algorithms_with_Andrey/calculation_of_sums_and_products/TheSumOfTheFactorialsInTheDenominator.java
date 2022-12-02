package Algorithms_with_Andrey.calculation_of_sums_and_products;

import java.util.Scanner;

/**
 * For a given natural number N, find the sum of the numbers 1+1/1!+1/2!+1/3!+...+1/ N!. The number of actions should be proportional to N.
 *
 * Input data
 * The singular number N is given
 *
 * Output data
 * It is necessary to output the result of the calculation as a real number with an accuracy of 5 decimal places.
 */

public class TheSumOfTheFactorialsInTheDenominator {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int n = intScanner.nextInt();
        double factorial = 1;
        double sumN = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
            sumN = sumN + (1 / factorial);
        }

        System.out.println(sumN);
    }
}
