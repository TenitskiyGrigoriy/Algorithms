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

        Scanner intScanner = new Scanner(System.in);
        int a = intScanner.nextInt();
        int n = intScanner.nextInt();
        int sumA = 1;
        int value = 1;

        for (int i = 0; i < n; i++) {
            sumA = (int) (sumA + Math.pow(a, value));
            value++;
        }

        System.out.println(sumA);
    }
}
