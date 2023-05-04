package Algorithms_with_Andrey.adjacency_matrix_and_list_of_edges;

import java.util.Scanner;

/**
 * Given the adjacency matrix of an undirected graph, determine if it contains loops.
 *
 * Input data
 * The input of the program is the number n ( 1≤n≤100 ) – the number of vertices of the graph,
 * and then n lines of n numbers, each of which is equal to 0 or 1 – its adjacency matrix.
 *
 * Output
 * Print "YES" if the graph contains loops, and "NO" otherwise.
 */
public class Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        boolean isAdjacencyMatrix = false;
        for (int i = 0; i < n; i++) {
            if (matrix[i][i] != 0) {
                isAdjacencyMatrix = true;
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
