package Algorithms_with_Andrey.dynamic_programming;

import java.util.Scanner;

/**
 * Calculate the nth member of the sequence given by the formulas:
 *
 * A2n = An + An-1,
 * A2n+1 = An – An-1,
 * A0 = A1 = 1.
 * Input data
 * One natural number n (1≤n≤1000) is entered.
 *
 * Output one number An
 */

public class SimpleSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int[] array = new int[value + 2];
        array[0] = 1;
        array[1] = 1;
        for (int i = 1; 2 * i + 1 < array.length; i++) {
            array[2 * i] = array[i] + array[i - 1];
            array[2 * i + 1] = array[i] - array[i - 1];
        }
        System.out.println(array[value]);
    }
}
