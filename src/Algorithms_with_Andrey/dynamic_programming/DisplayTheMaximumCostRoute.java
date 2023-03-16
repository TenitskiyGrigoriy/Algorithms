package Algorithms_with_Andrey.dynamic_programming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DisplayTheMaximumCostRoute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        int[][] dp = new int[n][m];
        dp[0][0] = a[0][0];
        for (int k = 1; k < n; k++) {
            dp[k][0] = dp[k - 1][0] + a[k][0];
        }
        for (int l = 1; l < m; l++) {
            dp[0][l] = dp[0][l - 1] + a[0][l];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + a[i][j];
            }
        }

        List<String> answer = new ArrayList<>();
        int i = n - 1;
        int j = m - 1;
        while (i != 0 || j != 0) {
            if (i > 0 && dp[i - 1][j] + a[i][j] == dp[i][j]) {
                answer.add("D");
                i -= 1;
            } else if(j > 0 && dp[i][j - 1] + a[i][j] == dp[i][j]){
                answer.add("R");
                j -= 1;
            }
        }
        System.out.println(dp[n - 1][m - 1]);
        for (int K = answer.size() - 1; K >= 0; K--) {
            System.out.print(answer.get(K) + " ");
        }
    }
}
