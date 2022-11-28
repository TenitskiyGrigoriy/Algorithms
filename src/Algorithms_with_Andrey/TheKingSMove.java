package Algorithms_with_Andrey;

import java.util.Scanner;

/**
 * The chessboard field is defined by a pair of numbers (a, b), each from 1 to 8, the first number specifies the column number,
 * the second – the row number. Two cells are specified. Determine whether the chess king can get from the first square to the second in one move.
 *
 * Input data
 * Given 4 integers from 1 to 8 each, the first two set the initial cell, the second two set the final cell.
 * The start and end cells do not match. The numbers are written in separate lines.
 *
 * Output data
 * The program should output YES if it is possible to get to the second square from the first square by the king's move, or NO otherwise.
 */

public class TheKingSMove {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int valueA = intScanner.nextInt();
        int valueB = intScanner.nextInt();
        int valueC = intScanner.nextInt();
        int valueD = intScanner.nextInt();

        if (Math.abs(valueC - valueA) <= 1 && Math.abs(valueD - valueB) <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
