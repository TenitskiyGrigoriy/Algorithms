package Algorithms_with_Andrey.calculation_of_sums_and_products;

import java.util.Scanner;

/**
 * Input data
 * The number N is entered, followed by N numbers.
 *
 * Output data
 * Calculate and output how many zeros there are among the N numbers in the data.
 */

public class Zeros {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int n = intScanner.nextInt();
        int sumZero = 0;
        for (int i = 0; i < n; i++) {
            int a = intScanner.nextInt();
            if (a == 0) {
                sumZero++;
            }
        }

        System.out.println(sumZero);
    }
}
