package Algorithms_with_Andrey;

import java.util.Scanner;

public class ExchangeOfValues {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int valueA = intScanner.nextInt();
        int valueB = intScanner.nextInt();

        int valueC = valueA;
        valueA = valueB;
        valueB = valueC;

        System.out.println(valueA + " " + valueB);
    }
}
