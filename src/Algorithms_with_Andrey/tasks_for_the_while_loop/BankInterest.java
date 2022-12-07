package Algorithms_with_Andrey.tasks_for_the_while_loop;

import java.util.Scanner;

/**
 * The deposit in the bank is x rubles. Every year it increases by p percent, after which the fractional part of the kopecks is discarded.
 * Every year the deposit amount becomes larger. Determine how many years later the contribution will be at least y rubles.
 *
 * Input data
 * The program receives three natural numbers as input: x, p, y.
 *
 * Output data
 * The program should output a single integer.
 */

public class BankInterest {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        double x = intScanner.nextDouble();
        double k = intScanner.nextDouble();
        double y = intScanner.nextDouble();
        int z;
        int count = 0;
        k = k / 100;

        while (x < y) {
            x = x + x * k;
            x = x * 100;
            z = (int) x;
            x = z / 100d;
            count++;
        }

        System.out.println(count);
    }
}
