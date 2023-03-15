package Algorithms_with_Andrey.dynamic_programming;

import java.util.Scanner;

/**
 * In a rectangular NxM table, at the beginning, the player is in the upper left cell.
 * In one move, he is allowed to move to the next cell either to the right or down (it is forbidden to move to the left and up).
 * Count how many ways the player has to get to the bottom right cell.
 *
 * Input data
 * Two numbers N and M are entered - the sizes of the table (1<=N<=10, 1<=M<=10).
 *
 * Output the desired number of ways.
 */

public class TableTraversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        long[][] table = new long[n][m];
        for (int i = 0; i < n; i++) {
            table[i][0] = 1;
        }
        for (int j = 0; j < m; j++) {
            table[0][j] = 1;
        }

        for (int k = 1; k < n; k++) {
            for (int l = 1; l < m; l++) {
                table[k][l] = table[k - 1][l] + table[k][l - 1];
            }
        }

        System.out.println(table[n - 1][m - 1]);
    }
}
