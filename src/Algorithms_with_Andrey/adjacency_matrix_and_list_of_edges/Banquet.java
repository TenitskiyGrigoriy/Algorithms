package Algorithms_with_Andrey.adjacency_matrix_and_list_of_edges;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 * N Very Important Persons (VVPs) were invited to the banquet.
 * 2 tables were set up. The tables are large enough so that all banquet attendees can sit at any of them.
 * The problem is that some OVPs don't get along with each other and can't sit at the same table.
 * You have been asked to determine if it is possible to seat all OVPs at two tables.
 *
 * Input data
 * The first line of the input contains two numbers: N and M (1 <= N,M <= 100),
 * where N is the number of OVPs and M is the number of OVP pairs that cannot sit at the same table.
 * The next M lines contain 2 numbers each - OVP pairs that cannot sit at the same table.
 *
 * Output
 * If there is a way to seat the OVP, then print YES on the first line and the numbers of the OVP to be seated at the first table on the second line.
 * Otherwise, print NO in the first and only line.
 */
public class Banquet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        ArrayList<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            int u = in.nextInt() - 1;
            int v = in.nextInt() - 1;
            graph[u].add(v);
            graph[v].add(u);
        }

        boolean[] color = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!color[i]) {
                Stack<Integer> stack = new Stack<>();
                stack.push(i);
                color[i] = false;
                while (!stack.empty()) {
                    int v = stack.pop();
                    for (int u : graph[v]) {
                        if (!color[u]) {
                            stack.push(u);
                            color[u] = !color[v];
                        } else if (color[u] == color[v]) {
                            System.out.println("NO");
                            return;
                        }
                    }
                }
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!color[i]) {
                result.add(i + 1);
            }
        }
        System.out.println("YES");
        for (int i : result) {
            System.out.println(i + " ");
        }
    }
}
