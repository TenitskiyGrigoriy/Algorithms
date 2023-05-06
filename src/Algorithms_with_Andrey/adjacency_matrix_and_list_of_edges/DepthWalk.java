package Algorithms_with_Andrey.adjacency_matrix_and_list_of_edges;

import java.util.Scanner;

/**
 * An undirected unweighted graph is given. For it,
 * you need to find the number of vertices that lie in the same connected component with a given vertex (counting this vertex).
 *
 * Input data
 * The first line of the input contains two numbers: N and S (1 ≤ N ≤ 100; 1 ≤ S ≤ N),
 * where N is the number of graph vertices and S is the given vertex. The next N lines contain N numbers each - the adjacency matrix of the graph,
 * in which 0 means the absence of an edge between the vertices, and 1 means its presence.
 * It is guaranteed that there are always zeros on the main diagonal of the matrix.
 *
 * Output
 * Print one integer, the desired number of vertices.
 */
public class DepthWalk {
    static int n;
    static int s;
    static int[][] matrix;
    static boolean[] isVisited;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        s = in.nextInt();
        matrix = new int[n][n];
        isVisited = new boolean[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        int counter = dfs(s - 1);
        System.out.println(counter);
    }

    public static int dfs(int v) {
        isVisited[v] = true;
        int counter = 1;

        for (int i = 0; i < n; i++) {
            if (matrix[v][i] == 1 && !isVisited[i]) {
                counter += dfs(i);
            }
        }
        return counter;
    }
}
