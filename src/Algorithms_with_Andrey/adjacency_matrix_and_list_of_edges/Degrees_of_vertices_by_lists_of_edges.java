package Algorithms_with_Andrey.adjacency_matrix_and_list_of_edges;

import java.util.Scanner;

/**
 * An undirected graph is defined by a list of edges. Find the degrees of all the vertices of the graph.
 *
 * Input data
 * First, the numbers n ( 1≤n≤100 ) are entered – the number of vertices in the graph and m ( 1≤m≤n(n−1)/2 ) – the number of edges.
 * Then m pairs of numbers follow - the edges of the graph.
 *
 * Output
 * Print n numbers, the degrees of the graph's vertices.
 */
public class Degrees_of_vertices_by_lists_of_edges {
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
