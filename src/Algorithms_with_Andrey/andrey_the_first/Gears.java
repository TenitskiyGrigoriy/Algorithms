package Algorithms_with_Andrey.andrey_the_first;

import java.util.Scanner;

/**
 * There are two interlocked gears. One gear has N teeth, the other has K.
 * It is required to find the minimum number of turns per tooth to make the gears return to their original state.
 *
 * Input data
 * The only line contains two natural numbers N and K not exceeding 10 million.
 *
 * Output the desired number of teeth. It is guaranteed that it is not more than a billion.
 */
public class Gears {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        System.out.println(lcm(n, k));
    }

    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static long lcm(long a, long b) {
        return a / gcd(a,b) * b;
    }
}
