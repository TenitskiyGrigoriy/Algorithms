package Algorithms_with_Andrey.linear_search_in_an_array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * In connection with the visit of Emperor Palpatine, it was decided to update the composition of the droids in hangar 32.
 * Due to the crisis, it was decided not to buy new droids, but to throw out a couple of old ones. As you know,
 * Palpatine does not tolerate droids with low serial numbers, so all that is required is to find two of them with the smallest serial numbers.
 *
 * Input data
 * The first line of the input file contains an integer N, the number of droids. (2 ≤ N ≤ 1000), second line - N integers, modulo not exceeding 2*109 - numbers of droids
 *
 *
 *
 * Output
 * Print two numbers: the first one is the last largest number of droids (this one should be disposed of first), and the second one is the penultimate one.
 */
public class Revision {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        Arrays.sort(array);
        System.out.println(array[0] + " " + array[1]);
    }
}
