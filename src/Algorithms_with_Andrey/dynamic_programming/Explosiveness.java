package Algorithms_with_Andrey.dynamic_programming;

import java.util.Scanner;

/**
 * During the processing of radioactive materials,
 * two types of waste are generated - especially hazardous (type A) and non-hazardous (type B).
 * They are stored in the same containers. After placing the waste in containers, the latter are stacked vertically.
 * A stack is considered explosive if it contains more than one type A container in a row.
 * A stack is considered safe if it is not explosive. For a given number of containers N,
 * determine the number of possible types of safe stacks.
 *
 * Input data
 * One number 1≤N≤20.
 *
 * Output
 * One number is the number of safe stacking options.
 */

public class Explosiveness {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        long[] array = new long[value + 2];
        array[0] = 1;
        array[1] = 2;
        for (int i = 2; i <= value; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        System.out.println(array[value]);
    }
}
