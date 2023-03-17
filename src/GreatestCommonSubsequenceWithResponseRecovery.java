import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Given two sequences, you need to find and print their greatest common subsequence.
 *
 * Input data
 * The first line of the input contains the number N, the length of the first sequence (1 ≤ N ≤ 1000).
 * The second line contains the members of the first sequence (separated by a space) - integers not exceeding 10000 modulo.
 *
 * The third line contains the number M, the length of the second sequence (1 ≤ M ≤ 1000).
 * The fourth line contains the members of the second sequence (separated by a space) - integers not exceeding 10000 modulo.
 *
 * Output
 * It is required to print the largest common subsequence of these sequences, separated by a space.
 */

public class GreatestCommonSubsequenceWithResponseRecovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arrayN = new int[n];
        for (int i = 0; i < n; i++) {
            arrayN[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] arrayM = new int[m];
        for (int j = 0; j < m; j++) {
            arrayM[j] = scanner.nextInt();
        }

        int[][] dp = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (arrayN[i - 1] == arrayM[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        List<Integer> answer = new ArrayList<>();
        int i = n;
        int j = m;
        while (i != 0 || j != 0){
            if (i > 0 && j > 0 && (arrayN[i - 1] == arrayM[j - 1])) {
                answer.add(arrayN[i - 1]);
                i -= 1;
                j -= 1;
            } else if (i > 0 && (dp[i - 1][j] == dp[i][j])) {
                i -= 1;
            } else if (j > 0 &&(dp[i][j - 1] == dp[i][j])) {
                j -= 1;
            }
        }
        for (int K = answer.size() - 1; K >= 0; K--) {
            System.out.print(answer.get(K) + " ");
        }
    }
}
