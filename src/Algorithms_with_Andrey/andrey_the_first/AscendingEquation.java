package Algorithms_with_Andrey.andrey_the_first;

import java.util.Scanner;

/**
 * Input data
 * 4 numbers are entered: a, b, c and d.
 *
 * Output
 * Find all integer solutions of the equation ax3 + bx2 + cx + d = 0 on the segment [0,1000] and print them in ascending order.
 * If there are no solutions on this segment, then nothing needs to be output.
 */

public class AscendingEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        for (int i = 0; i <= 1000; i++) {
            if(a*i*i*i + b*i*i + c*i + d == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
