package Algorithms_with_Andrey.conditional_operator;

import java.util.Scanner;

/**
 * It is required to determine whether this year is a leap year. (Recall that a year is a leap year if its number is a multiple of 4,
 * but not a multiple of 100, and also if it is a multiple of 400.)
 *
 * Input data
 * A singular number is entered - the year number (a positive integer, not exceeding 30,000).
 *
 * Output data
 * It is required to print the word YES if the year is a leap year and NO otherwise.
 */

public class LeapYear {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int value = intScanner.nextInt();

        if (value % 4 == 0 && value % 100 != 0 || value % 400 == 0) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
