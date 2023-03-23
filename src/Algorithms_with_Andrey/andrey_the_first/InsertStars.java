package Algorithms_with_Andrey.andrey_the_first;

import java.util.Scanner;

/**
 * Given a string containing only English letters (uppercase and lowercase).
 * Add '*' (asterisk) character between letters (you don't need to add '*' character before the first letter and after the last one).
 *
 * Input data
 * A string of non-zero length is entered. It is also known that the string length does not exceed 1000 characters.
 *
 * Output the string that will be obtained after adding the characters '*'.
 */

public class InsertStars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        System.out.println(star(str));
    }

    public static String star(String str) {
        if (str.length() == 1) {
            return str;
        }
        return star(str.substring(0, str.length() - 1)) + "*" + str.charAt(str.length()-1);
    }
}
