package Algorithms_with_Andrey;

import java.util.Scanner;

public class NumberOfTens {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int startValue = intScanner.nextInt();

        int middleValue = startValue / 10;
        int endValue = middleValue % 10;

        System.out.println(endValue);
    }
}
