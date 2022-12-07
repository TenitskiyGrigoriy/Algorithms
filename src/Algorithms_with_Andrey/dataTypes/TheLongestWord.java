package Algorithms_with_Andrey.dataTypes;

import java.util.Scanner;

/**
 * A string containing spaces is given. Find the longest word in it, output this word and its length. If there are several such words, output the first of them.
 *
 * Input data
 * A single line containing spaces is specified. The words are separated by exactly one space. Spaces at the beginning and end of the line are allowed.
 *
 * Output data
 * It is necessary to output the longest word in the string and its length.
 */

public class TheLongestWord {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        String s1 = intScanner.nextLine();
        int counterOfTheLetters = 0;
        int temporaryVariable = 0;
        String theLongestWord = "";

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != ' ') {
                temporaryVariable++;
            }
            if (counterOfTheLetters < temporaryVariable) {
                counterOfTheLetters = temporaryVariable;
                theLongestWord = s1.substring(i - counterOfTheLetters + 1, i + 1);
            }
            if (s1.charAt(i) == ' ') {
                temporaryVariable = 0;
            }

        }

        System.out.println(theLongestWord);
        System.out.println(counterOfTheLetters);
    }
}
