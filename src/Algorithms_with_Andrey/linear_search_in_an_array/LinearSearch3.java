package Algorithms_with_Andrey.linear_search_in_an_array;

import java.util.Scanner;

/**
 * Write a program that prints the numbers of array elements that are equal to a given number.
 *
 * Input data
 * The first line contains one natural number N, not exceeding 1000 - the size of the array.
 *
 * The second line contains N numbers – array elements (integer numbers not exceeding 1000 in absolute value).
 *
 * The third line contains one integer x, modulo not exceeding 1000.
 *
 * Output
 * Print the numbers of elements equal to the given one in ascending order. If there are no such elements, nothing should be output.
 */
public class LinearSearch3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        int k = in.nextInt();
        for (int i = 0; i < array.length; i++) {
            if(array[i] == k) {
                System.out.println(i + 1 + " ");
            }
        }

    }
}
