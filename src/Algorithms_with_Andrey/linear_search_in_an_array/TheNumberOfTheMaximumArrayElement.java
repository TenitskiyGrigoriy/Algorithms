package Algorithms_with_Andrey.linear_search_in_an_array;

import java.util.Scanner;

/**
 * Write a program that finds the number of the maximum element in an array.
 *
 * Input data
 * The first line contains one natural number N, not exceeding 1000 - the size of the array.
 *
 * The second line contains N numbers – array elements (integer numbers not exceeding 1000 in modulo).
 *
 * Output
 * Print one number - the number of the maximum element in the array. If the array has several maximum elements, print the number of any of them.
 */
public class TheNumberOfTheMaximumArrayElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        int maxValue = Integer.MIN_VALUE;
        int desiredValue = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > maxValue) {
                maxValue = array[i];
                desiredValue = i;
            }
        }
        System.out.println(desiredValue + 1);
    }
}
