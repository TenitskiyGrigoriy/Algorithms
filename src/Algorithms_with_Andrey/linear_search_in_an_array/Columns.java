package Algorithms_with_Andrey.linear_search_in_an_array;

import java.util.Scanner;

/**
 * Given an N × N table filled with integers. Peter the Great considers a column to be good if it contains the number X.
 * It is required for each column to find out whether it is good.
 *
 * Input data
 * The first line contains the number X, modulo not exceeding 2*109. The second line contains the number N (1 <= N <= 100),
 * The next N lines contain N integers each, not exceeding 2*109 in absolute value – the numbers in the cells of the table.
 *
 * Output
 * For each column print YES if it contains the number X, and NO otherwise. (each answer on a new line)
 */
public class Columns {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int n = in.nextInt();
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = in.nextInt();
            }
        }

        for (int j = 0; j < n; j++) {
            boolean numberInThisColumn = false;
            for (int i = 0; i < n; i++) {
                if (array[i][j] == x) {
                    numberInThisColumn = true;
                    break;
                }

            }
            if (numberInThisColumn) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
