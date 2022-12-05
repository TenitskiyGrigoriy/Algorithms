package Algorithms_with_Andrey.dataTypes;

import java.util.Scanner;

/**
 * Write the function boolean IsDigit(char c) (Java), which determines whether a given character is a digit or not.
 *
 * Naturally, the program must read the data, call this function and give a response.
 *
 * Input data
 * A single c character is specified.
 *
 * Output data
 * It is necessary to output the string yes if the character is a digit, and the string no otherwise.
 */

public class CheckIfTheSymbol_Is_A_Digit {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        char c = intScanner.next().charAt(0);

        if (isDigit(c)){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
    private static boolean isDigit(char c) {
        return (c >= '0' && c <= '9');
    }
}
