package Algorithms_with_Andrey.dynamic_programming;

import java.util.Scanner;

/**
 * The boy walked up to the toll stairs. To step on any step, you need to pay the amount indicated on it.
 * The boy knows how to step over to the next step, or jump over the step.
 * It is required to find out what is the smallest amount the boy needs to get to the top step.
 *
 * Input data
 * The first line of the input file contains one natural number N≤100 — the number of steps.
 * The next line contains N natural numbers not exceeding 100 — the cost of each step (from bottom to top).
 *
 * Output
 * Print one number — the least possible cost of going up the stairs.
 */

public class TheCheapestWay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int[] array = new int[value];
        int[] dynamicArray = new int[value + 1];

        for (int i = 0; i < value; i++) {
            array[i] = scanner.nextInt();
        }
        dynamicArray[0] = 0;
        dynamicArray[1] = array[0];
        for (int j = 2; j <= value; j++) {
            dynamicArray[j] = Math.min(dynamicArray[j - 1], dynamicArray[j - 2]) + array[j - 1];
        }
        System.out.println(dynamicArray[value]);
    }
}
