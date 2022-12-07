package Algorithms_with_Andrey.tasks_for_the_while_loop;

import java.util.Scanner;

/**
 * On the first day, the athlete ran x kilometers, and then every day he increased the mileage by 10% from the previous value.
 * Using this number y, determine the number of the day for which the athlete's mileage will be at least y kilometers.
 *
 * Input data
 * The program receives real numbers x and y as input
 *
 * Output data
 * The program should output one natural number - the number of the day for which the athlete's mileage will be at least y kilometers.
 */

public class MorningJog {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        double x = intScanner.nextDouble();
        double y = intScanner.nextDouble();
        int count = 1;

        while (x < y) {
            x = x * 1.1;
            count++;
        }

        System.out.println(count);
    }
}
