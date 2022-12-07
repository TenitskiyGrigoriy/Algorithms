package Algorithms_with_Andrey.dataTypes;

import java.util.Scanner;

/**
 * Two lines are given. Determine if the first line is a substring of the second line.
 *
 * Input data
 * The input is 2 lines of length no more than 10000, consisting only of small letters of the Latin alphabet.
 *
 * Output data
 * It is necessary to output the word yes if the first line is a substring of the second line, or the word no otherwise.
 */

public class SubstringSearch {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        String s1 = intScanner.nextLine();
        String s2 = intScanner.nextLine();
        boolean theStringContains_a_Substring = false;
        int count = s1.length();

        for (int i = 0; i < s2.length(); i++) {
            if (s2.length() >= i + count && s2.substring(i, i + count).equals(s1)) {
                theStringContains_a_Substring = true;
                break;
            }
        }

        if (theStringContains_a_Substring) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
