package Algorithms_with_Andrey.conditional_operator;

import java.util.Scanner;

/**
 * Input data
 * Given three natural numbers a, b, c, written in separate lines. Determine if there is an unborn triangle with such sides.
 *
 * Output data
 * If the triangle exists, print the line YES, otherwise print the line NO.
 */

public class Does_a_TriangleExist {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int a = intScanner.nextInt();
        int b = intScanner.nextInt();
        int c = intScanner.nextInt();

        if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
