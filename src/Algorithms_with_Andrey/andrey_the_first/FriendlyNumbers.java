package Algorithms_with_Andrey.andrey_the_first;

import java.util.Scanner;

/**
 * Two distinct natural numbers n and m are called friendly if the sum of the divisors of n (including 1 but excluding n itself) is equal to m and vice versa.
 * For example, 220 and 284 are friendly numbers. For the given number k, print all pairs of friendly numbers, each of which does not exceed k.
 *
 * Input data
 * The program receives as input one natural number k, not exceeding 105.
 *
 * Output
 * The program should print all pairs of friendly numbers, each of which does not exceed k. Pairs must be output one per line, separated by spaces.
 * Each pair must be printed only once (permuting the numbers does not give a new pair).
 */
public class FriendlyNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        for (int i = 2; i <= n; i++) {
            int j = sumOfDelimiters(i);
            if (sumOfDelimiters(j) == i && i > j) {
                System.out.println(i + " " + j);
            }
        }
    }

    public static int sumOfDelimiters(int a) {
        if (a == 1) {
            return 0;
        }
        int sum = 1;
        for (int i = 2; i * i < a; i++) {
            if (a % i == 0) {
                sum += i + a / i;
            }
        }
        if ((int) Math.sqrt(a) * (int) Math.sqrt(a) == a) {
            sum += (int) Math.sqrt(a);
        }
        return sum;
    }
}
