package Algorithms_with_Andrey.andrey_the_first;

import java.util.Scanner;

/**
 * Input data
 * Enter four numbers.
 *
 * Output
 * It is necessary to display the smallest of the 4 given numbers.
 */

public class Minimum_4_Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();


        System.out.println(min(a,b,c,d));
    }

    private static int min(int a, int b, int c, int d) {
        return Math.min(Math.min(Math.min(a, b), c),d);
    }
}
