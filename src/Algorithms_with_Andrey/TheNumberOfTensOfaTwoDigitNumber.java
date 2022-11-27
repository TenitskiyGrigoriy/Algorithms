package Algorithms_with_Andrey;

import java.util.Scanner;

public class TheNumberOfTensOfaTwoDigitNumber {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int startValue = intScanner.nextInt();

        int endValue = startValue / 10;

        System.out.println(endValue);
    }
}
