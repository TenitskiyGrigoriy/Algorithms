package Algorithms_with_Andrey.andrey_the_first;

import java.util.Scanner;

/**
 * Arrays and dynamic memory cannot be used in the tasks of this sheet - only variables! The input data (except for one task)
 * must be read until the number 0 appears, which means the end of the sequence.
 * The number 0 itself is not considered an element of the sequence and does not need to be processed.
 *
 * Given a sequence of natural numbers ending with the number 0.
 * Determine what is the largest number of consecutive elements of this sequence that are equal to each other.
 *
 * The numbers following the number 0 do not need to be read.
 * Input data
 * Given a sequence of natural numbers ending with 0.
 *
 * Output the answer to the problem.
 */
public class MaximumNumberOfContiguousEqualElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int value = 1;
        int previousValue = 0;
        int counter = 1;
        int maxCounter = 1;
        while (value != 0) {
            value = in.nextInt();
            if (previousValue == value){
                counter += 1;
                if (counter >= maxCounter) {
                    maxCounter++;
                }
            }
            if (previousValue != value) {
                counter = 0;
            }
            previousValue = value;
        }
        System.out.println(maxCounter);
    }
}
