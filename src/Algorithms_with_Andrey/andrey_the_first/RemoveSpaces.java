package Algorithms_with_Andrey.andrey_the_first;

import java.util.Scanner;

/**
 * Given a string, you need to convert all consecutive spaces to one.
 *
 * Input data
 * The string length does not exceed 1000.
 *
 * Output the changed string.
 */

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(str.replaceAll("[\\s]{2,}", " "));
    }
}
