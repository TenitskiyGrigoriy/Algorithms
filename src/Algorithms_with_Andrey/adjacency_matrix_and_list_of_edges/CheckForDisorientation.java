package Algorithms_with_Andrey.adjacency_matrix_and_list_of_edges;

import java.util.Scanner;

/**
 * Given a square n×n matrix of 0s and 1s, determine if the given matrix can be the adjacency matrix of a simple undirected graph.
 *
 * Input data
 * The input of the program is the number n (1≤n≤100) - the size of the matrix,
 * and then n lines of n numbers, each of which is equal to 0 or 1 - the matrix itself.
 *
 * Output
 * Print "YES" if the reduced matrix can be an adjacency matrix of a simple undirected graph, and "NO" otherwise.
 */
public class CheckForDisorientation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        boolean isAdjacencyMatrix = true;
        for (int i = 0; i < n; i++) {
            if (matrix[i][i] != 0) {
                isAdjacencyMatrix = false;
                break;
            }
            for (int j = i + 1; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    isAdjacencyMatrix = false;
                    break;
                }
            }
            if (!isAdjacencyMatrix) {
                break;
            }
        }

        if (isAdjacencyMatrix) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
