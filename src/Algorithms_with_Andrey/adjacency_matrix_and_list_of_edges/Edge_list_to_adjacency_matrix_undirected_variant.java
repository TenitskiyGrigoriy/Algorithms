package Algorithms_with_Andrey.adjacency_matrix_and_list_of_edges;

import java.util.Arrays;
import java.util.Scanner;

/**
 * A simple undirected graph is given a list of edges, output its representation as an adjacency matrix.
 *
 * Input data
 * The input of the program is the numbers n ( 1≤n≤100 ) – the number of vertices in the graph and m ( 1≤m≤n(n−1)/2 ) – the number of edges.
 * Then m pairs of numbers follow - the edges of the graph.
 *
 * Output the adjacency matrix of the given graph.
 */
public class Edge_list_to_adjacency_matrix_undirected_variant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[][] matrix = new int[n][n];
        int m = in.nextInt();
        for (int k = 0; k < m; k++) {
            int i = in.nextInt();
            int j = in.nextInt();
            matrix[i - 1][j - 1] = 1;
            matrix[j - 1][i - 1] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
