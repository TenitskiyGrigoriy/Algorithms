package Algorithms_with_Andrey;

import java.util.Scanner;

/**
 * Input data
 * Two integers are given, each written in a separate line.
 *
 * Output data
 * The program should output the number 1 if the first number is greater than the second,
 * the number 2 if the second is greater than the first, or the number 0 if they are equal.
 */

public class WhichOfTheNumbersIsBigger {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int valueA = intScanner.nextInt();
        int valueB = intScanner.nextInt();

        if (valueA > valueB) {
            System.out.println(1);
        } else if (valueA < valueB) {
            System.out.println(2);
        } else {
            System.out.println(0);
        }
    }
}
