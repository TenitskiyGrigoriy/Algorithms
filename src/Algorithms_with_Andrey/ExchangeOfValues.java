package Algorithms_with_Andrey;

import java.util.Scanner;

/**
 * Write a program that reads the values of two integer variables a and b,
 * then swaps their values (that is, the variable a should contain what was previously stored in b,
 * and the variable b contains what was previously stored in a). Then output the values of the variables.
 *
 * Input data
 * Integers a and b are entered.
 *
 * Output data
 * Print the answer to the problem.
 */

public class ExchangeOfValues {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int valueA = intScanner.nextInt();
        int valueB = intScanner.nextInt();

        int valueC = valueA;
        valueA = valueB;
        valueB = valueC;

        System.out.println(valueA + " " + valueB);
    }
}
