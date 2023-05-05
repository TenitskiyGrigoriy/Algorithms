package Algorithms_with_Andrey.adjacency_matrix_and_list_of_edges;

import java.util.Scanner;

/**
 * An undirected graph is defined by an adjacency matrix. Find the degrees of all the vertices of the graph.
 *
 * Input data
 * First, enter the number n ( 1≤n≤100 ) – the number of vertices in the graph,
 * and then n lines of n numbers, each of which is equal to 0 or 1 – its adjacency matrix.
 *
 * Output
 * Print n numbers, the degrees of the graph's vertices.
 */
public class VertexDegrees {
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
            int counter = 0;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    counter++;
                }
            }
            System.out.println(counter);
        }
    }
}
