package Algorithms_with_Andrey.dynamic_programming;

import java.util.Scanner;

/**
 * Determine the number of sequences of zeros and ones of length N (length is the total number of zeros and ones)
 * in which no three ones are adjacent.
 *
 * A natural number N is introduced, not exceeding 40.
 *
 * Output the number of searched sequences. It is guaranteed that the answer does not exceed 2^31 − 1.
 */

public class NoThreeUnits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        long[] array = new long[value + 2];
        array[0] = 1;
        array[1] = 2;
        array[2] = 4;
        for (int i = 3; i <= value; i++) {
            array[i] = array[i - 1] + array[i - 2] + array[i - 3];
        }
        System.out.println(array[value]);
    }
}
