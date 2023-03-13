package Algorithms_with_Andrey.dynamic_programming;

import java.util.Scanner;

/**
 * There is a calculator that performs three operations:
 *
 * 1. Add one to the number X.
 * 2. Multiply the number X by 2.
 * 3. Multiply the number X by 3.
 * Determine what is the least number of operations needed to get the given number N from the number 1.
 *
 * Input data
 * The program receives as input one number not exceeding 106.
 *
 * Output
 * It is required to display one number: the least number of required operations.
 */

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n + 1];
        // array[i] - это наименьшее число операция, необходимое для того, чтобы получить из числа 1 число i;

        array[1] = 0;
        for (int i = 2; i <= n; i++) {
            array[i] = array[i - 1] + 1;
            if (i % 2 == 0) {
                array[i] = Math.min(array[i], array[i / 2] + 1);
            }
            if (i % 3 == 0) {
                array[i] = Math.min(array[i], array[i / 3] + 1);
            }
        }

        System.out.println(array[n]);
    }
}
