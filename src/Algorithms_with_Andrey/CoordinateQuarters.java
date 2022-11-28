package Algorithms_with_Andrey;

import java.util.Scanner;

/**
 * The coordinates of two points on the plane are given, it is required to determine whether they lie in the same coordinate quarter or not (all coordinates are non-zero).
 *
 * Input data
 * 4 numbers are entered: the coordinates of the first point (x1, y1) and the coordinates of the second point (x2, y2).
 *
 * Output data
 * The program should output the word YES if the points are in the same coordinate quarter, otherwise output the word NO.
 */

public class CoordinateQuarters {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int x1 = intScanner.nextInt();
        int y1 = intScanner.nextInt();
        int x2 = intScanner.nextInt();
        int y2 = intScanner.nextInt();

        if (x1 > 0 && x2 > 0 && y1 > 0 && y2 > 0) {
            System.out.println("YES");
        } else if (x1 < 0 && x2 < 0 && y1 < 0 && y2 < 0) {
            System.out.println("YES");
        } else if (x1 > 0 && x2 > 0 && y1 < 0 && y2 < 0) {
            System.out.println("YES");
        } else if (x1 < 0 && x2 < 0 && y1 > 0 && y2 > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
