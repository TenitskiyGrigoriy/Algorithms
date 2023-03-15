package Algorithms_with_Andrey.dynamic_programming;

import java.util.Scanner;

/**
 * There is a turtle in the upper left corner of an N×M rectangular table.
 * Each cell of the table contains a certain number. The turtle can move to the right or down,
 * with the turtle's path ending in the lower right corner of the table.
 *
 * Let's calculate the sum of the numbers written in the cells through which the turtle crawled (including the initial and final cell).
 * Find the largest possible value of this sum.
 *
 * Input data format
 *
 * The first line of the input contains two natural numbers N and M not exceeding 100 — the size of the table. Next comes N lines,
 * each of which contains M numbers separated by spaces — a description of the table.
 * All numbers in the cells of the table are integers and can take values from 0 to 100.
 *
 * Output format
 *
 * The program should output a single number: the maximum possible cost of the turtle's route.
 */

public class MinimumRouteCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        int[][] dp = new int[n][m];
        dp[0][0] = a[0][0];
        for (int k = 1; k < n; k++) {
            dp[k][0] = dp[k - 1][0] + a[k][0];
        }
        for (int l = 1; l < m; l++) {
            dp[0][l] = dp[0][l - 1] + a[0][l];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + a[i][j];
            }
        }
        System.out.println(dp[n - 1][m - 1]);
    }
}
