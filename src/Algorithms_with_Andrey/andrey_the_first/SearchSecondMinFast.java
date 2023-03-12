package Algorithms_with_Andrey.andrey_the_first;

import java.util.Scanner;

public class SearchSecondMinFast {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int arrayLength = intScanner.nextInt();
        int[] array = new int[arrayLength];
        int theFirstMinimumNumberInOrder = Integer.MAX_VALUE;
        int theSecondMinimumNumberInOrder = Integer.MAX_VALUE;
        int theSecondMinimumNumberByValue = Integer.MAX_VALUE;

        for (int i = 0; i < arrayLength; i++) {
            int arrayValue = intScanner.nextInt();
            array[i] = arrayValue;
        }

        for (int i = 0; i < arrayLength; i++) {
            if (array[i] < theFirstMinimumNumberInOrder) {
                theSecondMinimumNumberInOrder = theFirstMinimumNumberInOrder;
                theFirstMinimumNumberInOrder = array[i];
            } else if (array[i] < theSecondMinimumNumberInOrder) {
                theSecondMinimumNumberInOrder = array[i];
            }
        }

        for (int i = 0; i < arrayLength; i++) {
            if (array[i] > theFirstMinimumNumberInOrder && array[i] < theSecondMinimumNumberByValue) {
                theSecondMinimumNumberByValue = array[i];
            }
        }

        System.out.println(theSecondMinimumNumberInOrder);
        System.out.println(theSecondMinimumNumberByValue);
    }
}
