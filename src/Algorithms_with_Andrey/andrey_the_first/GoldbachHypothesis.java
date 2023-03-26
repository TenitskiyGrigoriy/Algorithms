package Algorithms_with_Andrey.andrey_the_first;

import java.util.Scanner;

/**
 * Goldbach's conjecture (not yet proven) states that any even number (except 2) can be represented as the sum of two primes.
 *
 * Input data
 * The program receives as input one natural even number n (3<n<2*10^5).
 *
 * Output
 * The program should output two numbers separated by a space. Numbers must be prime and add up to n.
 */
public class GoldbachHypothesis {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 2; i < n - 1; i++) {
            if(isPrime(i) && isPrime(n - i)) {
                System.out.println(i + " " + (n - i));
                break;
            }
        }
    }

    public static boolean isPrime(int a) {
        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
        }
}
