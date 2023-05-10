package Algorithms_with_Andrey.adjacency_matrix_and_list_of_edges;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * A directed weighted graph is given. Find the shortest distance from one given vertex to another.
 *
 * Input data
 * The first line contains three numbers: N, S and F (1≤ N≤ 100, 1≤ S, F≤ N), where N is the number of graph vertices,
 * S is the start vertex, and F is the end vertex. In the next N lines, enter N numbers each,
 * not exceeding 100, - the adjacency matrix of the graph, where -1 means the absence of an edge between the vertices,
 * and any non-negative number - the presence of an edge of a given weight. Zeros are written on the main diagonal of the matrix.
 *
 * Output
 * It is required to display the desired distance or -1 if there is no path between the specified vertices.
 */
public class Dijkstra {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int s = in.nextInt() - 1;
        int f = in.nextInt() - 1;

        int[][] graph = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int weight = in.nextInt();
                graph[i][j] = weight >= 0 ? weight : Integer.MAX_VALUE;
            }
        }

        int[] distances = new int[n];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[s] = 0;

        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(i -> distances[i]));
        queue.add(s);

        while (!queue.isEmpty()) {
            int u = queue.poll();
            if (u == f) {
                break;
            }
            for (int v = 0; v < n; v++) {
                if (graph[u][v] != Integer.MAX_VALUE) {
                    int altDistance = distances[u] + graph[u][v];
                    if (altDistance < distances[v]) {
                        distances[v] = altDistance;
                        queue.remove(v);
                        queue.add(v);
                    }
                }
            }
        }

        int shortestDistance = distances[f];
        System.out.println(shortestDistance != Integer.MAX_VALUE ? shortestDistance : -1);
    }
}
