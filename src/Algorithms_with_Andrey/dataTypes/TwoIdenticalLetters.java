package Algorithms_with_Andrey.dataTypes;

import java.util.Scanner;

/**
 * A string is given. It is known that it contains exactly two identical letters. Find these letters. It is guaranteed that only one type of letters are repeated.
 *
 * Input data
 * 1 line is supplied to the input.
 *
 * Output data
 * It is necessary to print the letter that occurs twice in the string.
 */

public class TwoIdenticalLetters {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        String s1 = intScanner.nextLine();
        char theDesiredLetter = ' ';

        for (int i = 0; i < s1.length(); i++) {
            theDesiredLetter = s1.charAt(i);
            for (int j = i + 1; j < s1.length(); j++) {
                if (theDesiredLetter == s1.charAt(j)) {
                    System.out.println(theDesiredLetter);
                    break;
                }
            }
        }
    }
}
