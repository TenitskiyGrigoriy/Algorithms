package Algorithms_with_Andrey.andrey_the_first;

import java.util.Scanner;

/**
 * Express the given number n as the sum of two cubes.
 *
 * Input data
 * The program receives one natural number n(n <= 1028) as input.
 *
 * Output
 * The program should output 2 non-negative integers whose sum of cubes is equal to n. If it's impossible, print the line impossible.
 */
public class SumOfTwoCubes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 1; i * i * i <= n; i++) {
            for (int j = 0; j * j * j <= n; j++) {
                if (i * i * i + j * j * j == n) {
                    System.out.println(i + " " + j);
                    return;
                }
            }
        }
        System.out.println("impossible");
    }
}
