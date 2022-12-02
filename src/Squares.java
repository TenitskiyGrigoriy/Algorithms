import java.util.Scanner;

/**
 * Input data
 * Integers a and b are entered. It is guaranteed that a does not exceed b.
 *
 * Output data
 * Print all the numbers on the segment from a to b that are full squares. If there are no such numbers, then nothing needs to be output.
 */

public class Squares {
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
