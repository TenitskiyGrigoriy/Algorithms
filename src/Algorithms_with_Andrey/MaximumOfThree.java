package Algorithms_with_Andrey;

import java.util.Map;
import java.util.Scanner;

public class MaximumOfThree {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int valueA = intScanner.nextInt();
        int valueB = intScanner.nextInt();
        int valueC = intScanner.nextInt();

//        if (valueA >= valueB && valueA >= valueC) {
//            System.out.println(valueA);
//        } else if (valueB >= valueA && valueB >= valueC) {
//            System.out.println(valueB);
//        } else {
//            System.out.println(valueC);
//        }

        System.out.println(Math.max(valueA, Math.max(valueB, valueC)));
    }
}
