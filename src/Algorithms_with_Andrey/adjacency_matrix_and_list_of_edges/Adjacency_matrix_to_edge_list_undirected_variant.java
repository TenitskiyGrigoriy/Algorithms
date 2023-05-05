package Algorithms_with_Andrey.adjacency_matrix_and_list_of_edges;

import java.util.Scanner;

/**
 * A simple undirected graph is given an adjacency matrix, output its representation as a list of edges.
 *
 * Input data
 * The input consists of a number n ( 1≤n≤100 ), the number of vertices in the graph,
 * and then n lines of n numbers, each equal to 0 or 1, its adjacency matrix.
 *
 * Output
 * Print a list of edges in the given graph (in any order).
 */
public class Adjacency_matrix_to_edge_list_undirected_variant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (matrix[i][j] == 1 && matrix[j][i] == 1) {
                    System.out.println((i + 1) + " " + (j + 1));
                }
            }
        }
    }
}
