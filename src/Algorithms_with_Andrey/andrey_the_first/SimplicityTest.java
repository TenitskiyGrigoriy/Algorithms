package Algorithms_with_Andrey.andrey_the_first;

import java.util.Scanner;

/**
 * Check if a number is prime.
 *
 * Input data
 * Enter one natural number n not exceeding 2000000000 and not equal to 1.
 *
 * Output
 * It is necessary to output the string prime if the number is prime,
 * or composite if the number is composite.
 */
public class SimplicityTest {
    public static void main(String[] args) {
        boolean isPrime = true;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 2; i * i <= n ; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("prime");
        } else {
            System.out.println("composite");
        }
    }
}
