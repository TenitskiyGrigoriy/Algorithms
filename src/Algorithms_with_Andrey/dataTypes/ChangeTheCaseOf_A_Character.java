package Algorithms_with_Andrey.dataTypes;

import java.util.Scanner;

/**
 * Change the case of the character if it was a Latin letter: make it uppercase if it was a lowercase letter and vice versa.
 * To do this, write a separate function that changes the case of the character.
 *
 * Input data
 * A single C character is specified.
 *
 * Output data
 * It is necessary to output the resulting symbol.
 */

public class ChangeTheCaseOf_A_Character {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        char c = intScanner.next().charAt(0);

        if (c >= 'a' && c <= 'z') {
            System.out.println(toUpper(c));
        } else {
            System.out.println(toLower(c));
        }
    }

    private static char toUpper(char c) {
        return Character.toUpperCase(c);
    }

    private static char toLower(char c) {
        return Character.toLowerCase(c);
    }
}
