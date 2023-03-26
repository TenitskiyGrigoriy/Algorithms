package Algorithms_with_Andrey.linear_search_in_an_array;

import java.util.Scanner;

/**
 * Write a program that determines how many times a given number x occurs in a given array.
 *
 * Input data
 * The first line contains one natural number N, not exceeding 1000 - the size of the array.
 *
 * The second line contains N numbers – array elements (integer numbers not exceeding 1000 in absolute value).
 *
 * The third line contains one integer x , modulo not exceeding 1000.
 *
 * Output a single number - how many times x occurs in the given array.
 */
public class LinearSearch1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] array = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        int k = in.nextInt();
        for (int i = 0; i < array.length; i++) {
            if(array[i] == k) {
                count++;
            }
        }

        System.out.println(count);
    }
}
