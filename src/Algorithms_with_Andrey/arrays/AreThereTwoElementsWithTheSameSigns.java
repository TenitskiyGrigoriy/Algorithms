package Algorithms_with_Andrey.arrays;

import java.util.Scanner;

/**
 * An array consisting of integers is given. Write a program that determines whether there is a pair of adjacent elements with the same signs in the array.
 *
 * Input data
 * First, the number N is given — the number of elements in the array (1≤N≤10000). Next, N numbers are written separated by a space — the elements of the array.
 * The array consists of integers not equal to 0.
 *
 * Output data
 * It is necessary to print the word YES if there is a pair of adjacent elements with the same characters. Otherwise, the word NO should be output.
 */

public class AreThereTwoElementsWithTheSameSigns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        boolean isTrue = false;

        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < arraySize - 1; i++) {
            if(array[i] > 0 && array[i + 1] > 0 || array[i] < 0 && array[i + 1] < 0) {
                isTrue = true;
                break;
            }
        }

        if (isTrue) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
