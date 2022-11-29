package Algorithms_with_Andrey.conditional_operator;

import java.util.Scanner;

/**
 * The product costs a rub. b cop. They paid c rubles. d kopecks for it . How much change is required to get?
 *
 * Input data
 * 4 numbers are entered: a, b, c and d.
 *
 * Output data
 * It is necessary to output 2 numbers: e and f, the number of rubles and kopecks, respectively.
 */

public class Change {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int a = intScanner.nextInt();
        int b = intScanner.nextInt();
        int c = intScanner.nextInt();
        int d = intScanner.nextInt();

        int e = 0;
        int f = 0;


        if (d >= b && c >= a) {
            f = d - b;
            e = c - a;
        } else if (b > d){
            c = c - 1;
            e = c - a;
            f = d + 100 - b;
        }
        System.out.println(e);
        System.out.println(f);

    }
}
