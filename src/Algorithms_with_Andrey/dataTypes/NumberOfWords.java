package Algorithms_with_Andrey.dataTypes;

import java.util.Scanner;

/**
 * A string containing spaces is given. Find how many words there are in it (a word is a sequence of non–blank characters,
 * words are separated by one space, the first and last characters of the string are not spaces).
 *
 * Input data
 * Several lines are submitted for input.
 *
 * Output data
 * It is necessary to print the number of words in the first of the entered lines.
 */

public class NumberOfWords {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        String s1 = intScanner.nextLine();
        int counterOfTheWorlds = 1;

        for (int i = 1; i < s1.length(); i++) {
            if (s1.charAt(i) == ' ') {
                counterOfTheWorlds++;
            }
        }

        System.out.println(counterOfTheWorlds);
    }
}
