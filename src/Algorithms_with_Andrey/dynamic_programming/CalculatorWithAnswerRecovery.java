package Algorithms_with_Andrey.dynamic_programming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * There is a calculator that performs three operations:
 *
 * 1. Add one to the number X.
 * 2. Multiply the number X by 2.
 * 3. Multiply the number X by 3.
 * Determine the shortest sequence of operations required to obtain a given number N from the number 1.
 *
 * Input data
 * The program receives as input one number N, not exceeding 106.
 *
 * Output
 * Print a string consisting of the digits "1", "2" or "3", denoting one of the three indicated operations,
 * which obtains the number N from the number 1 in the minimum number of operations.
 * If there are several possible minimal solutions, print any of them.
 */

public class CalculatorWithAnswerRecovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] dp = new int[n + 1];
        // dp[i] - это наименьшее число операция, необходимое для того, чтобы получить из числа 1 число i;

        dp[1] = 0;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + 1;
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }

        List<Integer> answer = new ArrayList<>();
        while (n != 1) {
            if(dp[n-1] == dp[n] - 1) {
                n -= 1;
                answer.add(1);
            } else if(n % 2 == 0 && dp[n / 2] == dp[n] - 1) {
                n /= 2;
                answer.add(2);
            } else if(n % 3 == 0 && dp[n / 3] == dp[n] - 1) {
                n /= 3;
                answer.add(3);
            }
        }

        for (int i = answer.size() - 1; i >= 0; i--) {
            System.out.print(answer.get(i));
        }

    }
}
