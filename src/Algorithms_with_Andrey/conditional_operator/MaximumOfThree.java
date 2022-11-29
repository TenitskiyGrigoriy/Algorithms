package Algorithms_with_Andrey.conditional_operator;

import java.util.Scanner;

/**
 * Input data
 * Three integers are given, each written in a separate line.
 *
 * Output data
 * Print the largest of these numbers (the program should output exactly one integer).
 */

public class MaximumOfThree {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int valueA = intScanner.nextInt();
        int valueB = intScanner.nextInt();
        int valueC = intScanner.nextInt();

//        if (valueA >= valueB && valueA >= valueC) {
//            System.out.println(valueA);
//        } else if (valueB >= valueA && valueB >= valueC) {
//            System.out.println(valueB);
//        } else {
//            System.out.println(valueC);
//        }

        System.out.println(Math.max(valueA, Math.max(valueB, valueC)));
    }
}
