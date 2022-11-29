package Algorithms_with_Andrey.conditional_operator;

import java.util.Scanner;

/**
 * Входные данные
 * Даны два целых числа, каждое число записано в отдельной строке.
 *
 * Выходные данные
 * Выведите наибольшее из данных чисел.
 */

public class MaximumOfTwoNumbers {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int valueA = intScanner.nextInt();
        int valueB = intScanner.nextInt();

        System.out.println(Math.max(valueA, valueB));
    }
}
