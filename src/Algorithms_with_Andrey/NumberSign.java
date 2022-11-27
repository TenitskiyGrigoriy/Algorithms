package Algorithms_with_Andrey;

import java.util.Scanner;

public class NumberSign {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int value = intScanner.nextInt();

        if (value > 0) {
            System.out.println(1);
        } else if (value < 0) {
            System.out.println(-1);
        } else {
            System.out.println(0);
        }
    }
}
