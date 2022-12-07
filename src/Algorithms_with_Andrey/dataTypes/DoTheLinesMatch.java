package Algorithms_with_Andrey.dataTypes;

import java.util.Scanner;

/**
 * Write a bool Compare function(string S1, string S2) that determines whether 2 strings match.
 *
 * Input data
 * 2 lines are set.
 *
 * Output data
 * It is necessary to print the word yes if the lines match, and the word no otherwise.
 */

public class DoTheLinesMatch {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        String s1 = intScanner.next();
        String s2 = intScanner.next();

        if (s1.equals(s2)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
