package Algorithms_with_Andrey;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int value = intScanner.nextInt();

        int startValue = value / 100;
        int middleValue = value / 10 % 10;
        int endValue = value % 10 % 10;
        int sumValue = startValue + middleValue + endValue;

        System.out.println(sumValue);
    }
}
