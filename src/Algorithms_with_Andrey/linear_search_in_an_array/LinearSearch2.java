package Algorithms_with_Andrey.linear_search_in_an_array;

import java.util.Scanner;

/**
 * Write a program that determines if a given number x occurs in a given array.
 *
 * Input data
 * The first line contains one natural number N, not exceeding 1000 - the size of the array.
 *
 * The second line contains N numbers – array elements (integer numbers not exceeding 1000 in absolute value).
 *
 * The third line contains one integer x, modulo not exceeding 1000.
 *
 * Output
 * Print YES if the number x occurs in the given array, and NO otherwise.
 */
public class LinearSearch2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] array = new int[n];
        boolean contains = false;
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        int k = in.nextInt();
        for (int i = 0; i < array.length; i++) {
            if(array[i] == k) {
                contains = true;
                break;
            }
        }

        if (contains) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
