import java.util.Scanner;

/**
 * Given natural numbers n and m, find their greatest common divisor.
 *
 * Input data
 * The program receives 2 natural numbers m and n as input. The numbers m and n do not exceed 109.
 *
 * Output
 * The program should output the greatest common divisor of the two given numbers.
 */

public class EuclidAlgorithm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        System.out.println(gcd(n, m));
    }
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
