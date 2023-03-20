package Algorithms_with_Andrey.andrey_the_first;

import java.util.Scanner;

/**
 * On the first day, the athlete ran x kilometers, and then every day he increased the distance by 70% from the previous value.
 * Given the number y, determine the number of the day on which the athlete's run will be at least y kilometers.
 *
 * Input data
 * The program receives two real numbers x and y as input. The numbers are positive, real, do not exceed 1000,
 * are given with an accuracy of up to six decimal places.
 *
 * Output
 * The program should output a single integer.
 */

public class MorningRun1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double x = in.nextDouble();
        double y = in.nextDouble();
        double eps = 0.0000001;
        int count = 1;

        while (eps < Math.abs(x - y) && y > x) {
            x = x + (x * 70 / 100);
            count++;
        }
        System.out.println(count);
    }
}
