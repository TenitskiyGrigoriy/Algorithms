package Algorithms_with_Andrey.dynamic_programming;

import java.util.Scanner;

/**
 * F1 = F2 = 1, Fn = Fn-1 + Fn-2, for n > 2
 * Input data
 * The single line of the input contains a natural number n (1≤n≤45).
 * Output one number Fn
 */

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int[] array = new int[value + 1];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        System.out.println(array[value]);
    }
}
