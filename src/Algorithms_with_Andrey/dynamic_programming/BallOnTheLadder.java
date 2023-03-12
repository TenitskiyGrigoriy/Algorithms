package Algorithms_with_Andrey.dynamic_programming;

import java.util.Scanner;

/**
 * At the top of a ladder containing N steps, there is a ball that starts jumping down them to the base.
 * The ball can jump to the next step, to the step after one or after 2.
 * (That is, if the ball lies on the 8th step, then it can move to the 5th, 6th or 7th.)
 * Determine the number of possible " routes" of the ball from the top to the ground.
 *
 * Input data
 * A single number 0 < N < 31 is entered.
 *
 * Output
 * Print a single number — the number of routes.
 */

public class BallOnTheLadder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int[] array = new int[value + 2];
        array[0] = 1;
        array[1] = 1;
        array[2] = 2;
        for (int i = 3; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2] + array[i - 3];
        }
        System.out.println(array[value]);
    }
}
