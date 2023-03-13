package Algorithms_with_Andrey.dynamic_programming;

import java.util.Scanner;

/**
 * It is required to count the number of sequences of length N, consisting of 0 and 1, in which no two ones are adjacent.
 *
 * Input data
 * The input of the program is an integer N (1≤N≤100).
 *
 * Output the number of searched sequences.
 */

public class SequenceOf_0s_And_1s {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        long[] array = new long[value + 2];
        array[0] = 1;
        array[1] = 2;
        for (int i = 2; i <= value; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        System.out.println(array[value]);
    }
}
