package Algorithms_with_Andrey.dataTypes;

import java.util.Scanner;

/**
 * Use this line to determine whether it is a palindrome (that is, whether it is possible to read it the other way around, like, for example, the word "stomp").
 *
 * Input data
 * The input is 1 line without spaces.
 *
 * Output data
 * It is necessary to output yes if the string is a palindrome, and no otherwise.
 */

public class IsTheWord_A_Palindrome {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        String s1 = intScanner.nextLine();
        boolean theWordIs_a_Palindrome = true;

        for (int i = 0; i < s1.length() / 2; i++) {
            if (s1.charAt(i) != s1.charAt(s1.length() - i - 1)) {
                theWordIs_a_Palindrome = false;
                break;
            }
        }

        if (theWordIs_a_Palindrome) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
