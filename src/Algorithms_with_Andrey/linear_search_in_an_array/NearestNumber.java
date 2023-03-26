package Algorithms_with_Andrey.linear_search_in_an_array;

import java.util.Scanner;

/**
 * Write a program that finds the element in an array that is closest in value to a given number.
 *
 * Input data
 * The first line contains one natural number N, not exceeding 1000 - the size of the array.
 *
 * The second line contains N numbers - array elements (integer numbers not exceeding 1000 in modulo).
 *
 * The third line contains one integer x, modulo not exceeding 1000.
 *
 * Output
 * Print the value of the array element closest to x. If there are several such numbers, print any of them.
 */
public class NearestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] array = new int[n];
        int count = Integer.MAX_VALUE;
        int value = 0;
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        int k = in.nextInt();
        for (int i = 0; i < array.length; i++) {
            int maxNear = Math.abs(array[i] - k);
            if(maxNear < count) {
                count = maxNear;
                value = array[i];
            }
        }
        System.out.println(value);
    }
}
