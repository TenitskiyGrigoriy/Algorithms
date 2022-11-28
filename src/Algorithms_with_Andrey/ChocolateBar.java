package Algorithms_with_Andrey;

import java.util.Scanner;

/**
 * It is required to determine whether it is possible to break off k lobules from a chocolate bar with a size of n × m lobules,
 * if it is allowed to make one break in a straight line between the lobules (that is, to break the chocolate bar into two rectangles).
 *
 * Input data
 * 3 numbers are entered: n, m and k; k is not equal to n × m. It is guaranteed that the number of slices in a chocolate bar does not exceed 30,000.
 *
 * Output data
 * The program should output the word YES, if it is possible to break off the specified number of slices, otherwise output the word NO.
 */

public class ChocolateBar {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int n = intScanner.nextInt();
        int m = intScanner.nextInt();
        int k = intScanner.nextInt();

        if ((k % n == 0 || k % m == 0) && k < n * m) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
