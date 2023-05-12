package Algorithms_with_Andrey.adjacency_matrix_and_list_of_edges;

import java.util.Scanner;

/**
 * Given a directed graph, the edges of which are assigned some non-negative weights (lengths).
 * It is necessary to find two vertices, the shortest path between which has the greatest length.
 *
 * Input data
 * The first line contains the number of vertices N ≤50.
 * Next comes the adjacency matrix of the graph, that is, N rows, each of which contains N numbers.
 * The j-th number in the i-th row of the adjacency matrix specifies the length of the edge leading from the i-th vertex to the j-th one.
 * Lengths can take any value from 0 to 1000000. It is guaranteed that there are zeros on the main diagonal of the matrix.
 *
 * Output
 * Print a single number, the length of the required path.
 */
public class TheLongestWay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] graph = new int[n][n];

        // чтение матрицы смежности
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                graph[i][j] = scanner.nextInt();
            }
        }

        // применение алгоритма Флойда-Уоршелла
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (graph[i][k] != Integer.MAX_VALUE && graph[k][j] != Integer.MAX_VALUE) {
                        graph[i][j] = Math.min(graph[i][j], graph[i][k] + graph[k][j]);
                    }
                }
            }
        }

        // поиск наибольшей длины кратчайшего пути
        int maxDistance = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (graph[i][j] != Integer.MAX_VALUE && graph[i][j] > maxDistance) {
                    maxDistance = graph[i][j];
                }
            }
        }

        System.out.println(maxDistance);
    }
}
