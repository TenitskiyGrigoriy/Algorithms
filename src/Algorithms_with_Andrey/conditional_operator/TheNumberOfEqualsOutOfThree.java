package Algorithms_with_Andrey.conditional_operator;

import java.util.Scanner;

/**
 * Input data
 * Three integers are given, written in separate lines. Determine how many of them match.
 *
 * Output data
 * The program should output one of the numbers: 3 (if all match), 2 (if two match) or 0 (if all the numbers are different).
 */

public class TheNumberOfEqualsOutOfThree {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int a = intScanner.nextInt();
        int b = intScanner.nextInt();
        int c = intScanner.nextInt();

        if (a == b && a == c) {
            System.out.println("3");
        } else if (a == b || b == c || a == c) {
            System.out.println("2");
        } else {
            System.out.println("0");
        }
    }
}
