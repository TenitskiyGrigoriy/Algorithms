package Algorithms_with_Andrey.andrey_the_first;

import java.util.Scanner;

/**
 * Count the number of natural divisors of x (including 1 and the number itself; x≤2∗10^9).
 *
 * Input data
 * Enter a natural number x.
 *
 * Output
 * Print a single number - the number of divisors of x.
 */

public class NumberOfDivisors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long x = in.nextLong();
        long counter = 0;
        for (int i = 1; i < Math.sqrt(x); i++) {
            if(x % i == 0) {
                counter += 2;
            }
        }
        if (x % Math.sqrt(x) == 0) {
            counter++;
        }
        System.out.println(counter);
    }
}
