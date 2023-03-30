package Algorithms_with_Andrey.quadratic_sorts;

import java.util.Scanner;

/**
 * It is required to insert this element into the given array at the given place, shifting the remaining elements to the right.
 *
 * Input data
 * The first line contains one natural number not exceeding 1000 - the size of the array.
 * The second line contains N numbers - array elements (integer numbers not exceeding 1000 in modulo).
 * The third line contains the number to be inserted and the number of the place where it is to be inserted.
 *
 * Output the resulting array.
 */
public class Inserting_A_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] array = new int[n + 1];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }

        int value = in.nextInt();
        int index = in.nextInt();
        for (int i = n; i > index - 1; i--) {
            array[i] = array[i - 1];
        }
        array[index - 1] = value;
        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}
