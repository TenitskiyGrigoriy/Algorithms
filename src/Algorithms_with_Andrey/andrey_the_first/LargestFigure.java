package Algorithms_with_Andrey.andrey_the_first;

import java.util.Scanner;

/**
 * Given a string containing numbers and English letters (upper and lower).
 * Find and display the number of digits.
 *
 * Input data
 * A string of non-zero length is entered. It is also known that the string length does not exceed 1000 characters.
 *
 * Output
 * Print the number of digits present in the string.
 */
public class LargestFigure {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        System.out.println(lf(str));
    }

    private static int lf(String str) {
        if (str.length() == 0) {
            return 0;
        }
        int myInt = Character.isDigit(str.charAt(str.length()-1)) ? 1 : 0;
        return lf(str.substring(0, str.length() - 1)) + myInt;
    }
}
