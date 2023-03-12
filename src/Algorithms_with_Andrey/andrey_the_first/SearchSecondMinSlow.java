package Algorithms_with_Andrey.andrey_the_first;

import java.util.Arrays;
import java.util.Scanner;

public class SearchSecondMinSlow {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int arrayLength = intScanner.nextInt();
        int[] array = new int[arrayLength];
        int theSecondMinimumNumberInOrder;
        int theSecondMinimumNumberByValue = Integer.MAX_VALUE;

        for (int i = 0; i < arrayLength; i++) {
            int arrayValue = intScanner.nextInt();
            array[i] = arrayValue;
        }

        Arrays.sort(array);

        theSecondMinimumNumberInOrder = array[1];

        for (int i = 0; i < arrayLength - 1; i++) {
            if (array[i] != array[i + 1]) {
                theSecondMinimumNumberByValue = array[i + 1];
                break;
            }
        }

        System.out.println(theSecondMinimumNumberInOrder);
        System.out.println(theSecondMinimumNumberByValue);
    }
}
