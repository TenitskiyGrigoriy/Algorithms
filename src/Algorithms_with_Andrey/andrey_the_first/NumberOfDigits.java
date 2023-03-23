package Algorithms_with_Andrey.andrey_the_first;

import java.util.Scanner;

/**
 * Given a string containing only decimal digits. Find and display the largest number.
 *
 * Input data
 * A string of non-zero length is entered. It is also known that the string length does not exceed 1000 characters and the string contains only decimal digits.
 *
 * Output
 * Print the maximum digit that occurs in the input string.
 */
public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        System.out.println(lf(str));
    }

    private static int lf(String str) {
        if (str.length() == 0) {
            return 0;
        }
        int myInt = Character.getNumericValue(str.charAt(str.length() - 1));
        return Math.max(lf(str.substring(0, str.length()-1)), myInt);
    }


}
