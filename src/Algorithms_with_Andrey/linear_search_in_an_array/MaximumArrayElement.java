package Algorithms_with_Andrey.linear_search_in_an_array;

import java.util.Scanner;

/**
 * Write a program that finds the value of the maximum element in an array.
 *
 * Input data
 * The first line contains one natural number N, not exceeding 1000 - the size of the array.
 *
 * The second line contains N numbers – array elements (integer numbers not exceeding 1000 in absolute value).
 *
 * Output one number - the value of the maximum element in the array.
 */
public class MaximumArrayElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] array = new int[n];
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        System.out.println(maxValue);
    }
}
