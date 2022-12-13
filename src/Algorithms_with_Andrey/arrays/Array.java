package Algorithms_with_Andrey.arrays;

import java.util.Scanner;

/**
 * An array consisting of integers is given. Numbering of elements starts from 0. Write a program that outputs array elements whose numbers are even (0, 2, 4...).
 *
 * Input data
 * First, the number N is given — the number of elements in the array (1≤N≤100). Next, N numbers are written separated by a space — the elements of the array. The array consists of integers.
 *
 * Output data
 * It is necessary to output all the elements of the array with even numbers.
 */

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < arraySize; i += 2) {
            System.out.print(array[i] + " ");
        }
    }
}
