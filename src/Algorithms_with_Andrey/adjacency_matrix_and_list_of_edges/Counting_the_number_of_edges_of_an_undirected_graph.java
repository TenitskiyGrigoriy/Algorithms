package Algorithms_with_Andrey.adjacency_matrix_and_list_of_edges;

import java.util.Scanner;

/**
 * A simple undirected graph is defined by an adjacency matrix. Find the number of edges in the graph.
 *
 * Input data
 * The input of the program is the number n ( 1≤n≤100 ) – the number of vertices in the graph,
 * and then n lines of n numbers each equal to 0 or 1 – its adjacency matrix.
 *
 * Output
 * Print a single number, the number of edges in the given graph.
 */
public class Counting_the_number_of_edges_of_an_undirected_graph {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        int counter = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (matrix[i][j] == 1 && matrix[j][i] == 1) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
