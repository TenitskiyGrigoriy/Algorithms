package Algorithms_with_Andrey;

import java.util.Scanner;

/**
 * It is required to determine whether the queen standing on the cell with the specified coordinates
 * (row number and column number) beats the figure standing on another specified cell.
 *
 * Input data
 * Four numbers are entered: the coordinates of the queen and the coordinates of another figure. Coordinates are integers in the range from 1 to 8.
 *
 * Output data
 * It is required to print the word YES if the queen can beat the piece in 1 move, otherwise print the word NO
 */

public class Queen {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int valueA = intScanner.nextInt();
        int valueB = intScanner.nextInt();
        int valueC = intScanner.nextInt();
        int valueD = intScanner.nextInt();

        if (valueA == valueC || valueB == valueD || valueB - valueA == valueD - valueC || valueA + valueB == valueC + valueD) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
