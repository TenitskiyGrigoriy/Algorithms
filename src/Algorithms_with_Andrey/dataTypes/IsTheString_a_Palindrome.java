package Algorithms_with_Andrey.dataTypes;

import java.util.Scanner;

/**
 * You are given a string consisting of lowercase Latin letters and spaces.
 * Check if it is a palindrome, excluding spaces (for example, "argentina beckons a black man").
 *
 * Input data
 * The input is 1 string of length no more than 100, containing spaces. An arbitrary number of spaces can go in a row.
 *
 * Output
 * Print yes if the given string is a palindrome, and no otherwise.
 */

public class IsTheString_a_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String newStr = str1.replaceAll(" ", "");
        StringBuilder palindrome = new StringBuilder(newStr);
        palindrome.reverse();
        String str2 = palindrome.toString();
        if(newStr.equals(str2)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
