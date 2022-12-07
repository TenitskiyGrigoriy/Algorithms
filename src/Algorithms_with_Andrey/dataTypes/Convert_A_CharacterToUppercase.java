package Algorithms_with_Andrey.dataTypes;

import java.util.Scanner;

/**
 * Write the function unsigned char ToUpper(unsigned char c), which translates this character to uppercase.
 * Input data
 * A single c character is specified.
 *
 * Output data
 * If the character is a lowercase letter of the Latin alphabet (that is, a letter from a to z), output a similar uppercase letter instead,
 * otherwise output the same character (this operation is called "uppercase translation").
 */

public class Convert_A_CharacterToUppercase {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        char c = intScanner.next().charAt(0);

        System.out.println(toUpper(c));

    }

    private static char toUpper(char c) {
        return Character.toUpperCase(c);
    }
}
