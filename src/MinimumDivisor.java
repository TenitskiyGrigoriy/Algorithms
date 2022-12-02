import java.util.Scanner;

/**
 * Input data
 * The natural number x is entered.
 *
 * Output data
 * Print the smallest divisor of the number x other than 1
 */

public class MinimumDivisor {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int n = intScanner.nextInt();
        int sumN = 1;
        int value = 1;

        for (int i = 0; i < n; i++) {
            sumN = sumN * value;
            value = value + 1;
        }

        System.out.println(sumN);
    }
}
