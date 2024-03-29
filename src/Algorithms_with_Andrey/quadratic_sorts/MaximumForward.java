package Algorithms_with_Andrey.quadratic_sorts;

import java.util.Scanner;
/**
 * It is required to swap the first element of the array with the maximum.
 *
 * Input data
 * The first line contains one natural number not exceeding 1000 - the size of the array.
 * The second line contains N numbers - array elements (integer numbers not exceeding 1000 in modulo).
 *
 * Output the resulting array. If there are several maximal elements, it is required to change the first of them.
 */
public class MaximumForward {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        int index = 0;
        for (int i = 1; i < n; i++) {
            if (array[i] > array[index]) {
                index = i;
            }
        }
        int temp = array[index];
        array[index] = array[0];
        array[0] = temp;
        for( int number : array) {
            System.out.print(number + " ");
        }
    }
}
