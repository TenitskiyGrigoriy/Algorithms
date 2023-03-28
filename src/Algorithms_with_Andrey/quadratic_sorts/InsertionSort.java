package Algorithms_with_Andrey.quadratic_sorts;

import java.util.Scanner;

/**
 * It is required to sort the array in non-descending order using the "inserts" method.
 *
 * Input data
 * The first line contains one natural number not exceeding 1000 - the size of the array.
 * The second line contains N numbers - array elements (integer numbers not exceeding 1000 in modulo).
 *
 * Output the resulting array.
 */
public class InsertionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        for (int i = 1; i < array.length; i++) {
            int additionalVariable = array[i];
            int index = i - 1;
            while (index >= 0 && array[index] > additionalVariable){
                array[index+1] = array[index];
                index--;
            }
            array[index+1] = additionalVariable;
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
