package Algorithms_with_Andrey;

import java.util.Scanner;

public class WhichOfTheNumbersIsBigger {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int valueA = intScanner.nextInt();
        int valueB = intScanner.nextInt();

        if (valueA > valueB) {
            System.out.println(1);
        } else if (valueA < valueB) {
            System.out.println(2);
        } else {
            System.out.println(0);
        }
    }
}
