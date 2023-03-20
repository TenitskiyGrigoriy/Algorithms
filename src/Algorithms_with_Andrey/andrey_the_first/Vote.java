package Algorithms_with_Andrey.andrey_the_first;

import java.util.Scanner;

/**
 * Input data
 * 3 numbers are entered - x, y and z (x, y and z are 0 or 1, 0 is false, 1 is true).
 *
 * Output
 * It is necessary to display the value of the function from x, y and z.
 */

public class Vote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        System.out.println(Election(a,b,c));
    }

    private static int Election(int x, int y, int z) {
        if (x + y + z > 1) {
            return 1;
        } else {
            return 0;
        }
    }
}
