package Algorithms_with_Andrey.quadratic_sorts;

import java.util.Scanner;

/**
 * Demonstrate how insertion sort works in ascending order.
 * To do this, output the state of the given array after each insertion on separate lines.
 * If the array is ordered initially, then nothing should be output.
 *
 * Input data
 * The first line contains a number (1 ≤ N ≤ 100) – the number of elements in the array.
 * The second line contains the array itself: a sequence of natural numbers not exceeding 109.
 *
 * Output
 * Print lines (by the number of insertions) of N numbers each into the output file.
 */
public class LibraryMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        boolean isSorted;
        for (int i = 1; i < n; i++) {
            isSorted = false;
            int additionalVariable = array[i];
            int index = i - 1;
            while (index >= 0 && array[index] > additionalVariable){
                array[index+1] = array[index];
                index--;
                isSorted = true;
            }
            array[index+1] = additionalVariable;
            if (isSorted) {
                for (int l : array) {
                    System.out.print(l + " ");
                }
                System.out.println();
            }
        }
    }
}
