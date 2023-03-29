package Algorithms_with_Andrey.linear_search_in_an_array;

import java.util.Scanner;

/**
 * Given a matrix K containing n rows and m columns. The saddle point of this matrix is the element that is both the minimum in its row and the maximum in its column.
 *
 * Find the number of saddle points of the given matrix.
 *
 * Input data
 * The first line contains integers n and m (1 ≤ n, m ≤ 750). This is followed by n lines of m numbers each.
 * The j-th number of the i-th row is equal to kij. All kij do not exceed 1000 in absolute value.
 *
 * Output the answer to the problem.
 */
public class Matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int counter = 0;

        int n = in.nextInt();
        int m = in.nextInt();
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = in.nextInt();
            }
        }
        int[] minInLine = new int[n];
        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < m; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
            minInLine[i] = min;
        }
        int[] maxInColumn = new int[m];
        for (int j = 0; j < m; j++) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
            maxInColumn[j] = max;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (array[i][j] == minInLine[i] && array[i][j] == maxInColumn[j]) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
