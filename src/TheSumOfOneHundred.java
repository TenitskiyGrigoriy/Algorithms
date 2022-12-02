import java.util.Scanner;

/**
 * Calculate the sum of the given 100 natural numbers.
 *
 * Input data
 * 100 numbers are entered, the sum of which must be calculated.
 *
 * Output data
 * The program should output a single number - the amount received.
 */

public class TheSumOfOneHundred {
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
