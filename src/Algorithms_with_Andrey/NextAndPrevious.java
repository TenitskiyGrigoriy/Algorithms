package Algorithms_with_Andrey;

import java.util.Scanner;

/**
 * Write a program that reads an integer and outputs a text similar to the one given in the example.
 * Spaces, punctuation marks, uppercase and lowercase letters are important!
 *
 * Input data
 * An integer is entered, modulo no more than 10000.
 *
 * Output data
 * Print first the phrase "The next number for the number", then the entered number,
 * then the word " is" surrounded by spaces, then the formula for the number following the entered number, and finally the dot sign without a space.
 * Similarly in the next line for the previous number.
 */

public class NextAndPrevious {
    public static void main(String[] args) {
        Scanner intScanner = new Scanner(System.in);
        int value = intScanner.nextInt();
        System.out.println("The next number for the number " + value + " is " + (value + 1) + ".");
        System.out.println("The previous number for the number " + value + " is " + (value - 1) + ".");
    }
}
