package Algorithms_with_Andrey;

import java.util.Scanner;

public class MaximumOfTwoNumbers {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int valueA = intScanner.nextInt();
        int valueB = intScanner.nextInt();

        System.out.println(Math.max(valueA, valueB));
    }
}
