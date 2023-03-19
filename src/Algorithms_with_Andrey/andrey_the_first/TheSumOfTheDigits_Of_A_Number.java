package Algorithms_with_Andrey.andrey_the_first;

import java.util.Scanner;

/**
 * Input data
 * Given a single number N
 *
 * Output
 * You need to print the sum of the digits of the number N.
 */

public class TheSumOfTheDigits_Of_A_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int sum = 0;

        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
