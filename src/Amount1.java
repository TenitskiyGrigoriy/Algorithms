import java.util.Scanner;

/**
 * For this number n, calculate the sum 1+1/22+1/32+ ...+1/n2.
 *
 * Input data
 * One number n is entered, not exceeding 100000.
 *
 * Output data
 * It is necessary to output the value of the sum.
 */

public class Amount1 {
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
