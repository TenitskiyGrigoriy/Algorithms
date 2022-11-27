package Algorithms_with_Andrey;

import java.util.Scanner;

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
