package Algorithms_with_Andrey;

import java.util.Scanner;

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
