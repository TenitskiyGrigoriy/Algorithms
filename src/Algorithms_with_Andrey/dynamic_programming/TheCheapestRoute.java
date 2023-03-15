package Algorithms_with_Andrey.dynamic_programming;

import java.util.Scanner;

/**
 * In each cell of the rectangular table N×M some number is written. Initially, the player is in the upper left cell.
 * In one move, he is allowed to move to the next cell either to the right or down (it is forbidden to move to the left and up).
 * When passing through a cell, the player is taken as many kilograms of food as the number is written
 * in this cell (food is also taken for the first and last cells of his path).
 *
 * It is required to find the minimum weight of food in kilograms, giving which the player can get into the lower right corner.
 *
 * Input data
 * Two numbers N and M are entered — the sizes of the table (1≤N≤20, 1≤M≤20).
 * Then there are N lines with M numbers each — the size of the fines in kilograms for passing through the corresponding cells
 * (numbers from 0 to 100).
 *
 * Output
 * Print the minimum weight of food in kilograms, giving which you can get into the lower right corner.
 */

public class TheCheapestRoute {
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
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + a[i][j];
            }
        }
        System.out.println(dp[n - 1][m - 1]);
    }
}
