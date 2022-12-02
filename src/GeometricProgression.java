import java.util.Scanner;

/**
 * For a given real number a and a natural n, calculate the sum of 1+a+a2+...+an without using the geometric progression sum formula.
 * The running time of the program should be proportional to n.
 *
 * Input data
 * 2 numbers are entered - a and n.
 *
 * Output data
 * It is necessary to output the value of the sum.
 */

public class GeometricProgression {
    public static void main(String[] args) {

        Scanner longScanner = new Scanner(System.in);
        long a = longScanner.nextLong();
        long n = longScanner.nextLong();
        long sumA = 1;
        long value = 1;

        for (int i = 0; i < n; i++) {
//            sumA = (long) (sumA + Math.pow(a, i  + 1));
            value = value * a;
            sumA = sumA + value;
        }

        System.out.println(sumA);
    }
}
