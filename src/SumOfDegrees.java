import java.util.Scanner;

/**
 * Input data
 * A natural number N is introduced, which does not exceed 30.
 *
 * Output data
 * Calculate 1+2+22+23+...+2 N.
 */

public class SumOfDegrees {
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
