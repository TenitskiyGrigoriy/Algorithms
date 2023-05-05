package Algorithms_with_Andrey.adjacency_matrix_and_list_of_edges;

import java.util.Scanner;

/**
 * A directed graph is given by an adjacency matrix, output its representation as a list of edges.
 *
 * Input data
 * The input of the program is the number n(1≤n≤100) – the number of vertices of the graph,
 * and then n lines of n numbers, each of which is equal to 0 or 1 – its adjacency matrix.
 *
 * Output
 * Print a list of edges in the given graph.
 */
public class From_Adjacency_Matrix_to_Edge_List_Oriented_Variant {
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
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    System.out.println((i + 1) + " " + (j + 1));
                }
            }
        }
    }
}
