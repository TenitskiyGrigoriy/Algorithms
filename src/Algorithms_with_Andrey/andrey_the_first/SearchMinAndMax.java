package Algorithms_with_Andrey.andrey_the_first;

import java.util.Scanner;

public class SearchMinAndMax {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int arrayLength = intScanner.nextInt();
        int[] array = new int[arrayLength];
        int minValueInArray = Integer.MAX_VALUE;
        int maxValueInArray = Integer.MIN_VALUE;

        for (int i = 0; i < arrayLength; i++) {
            int arrayValue = intScanner.nextInt();
            array[i] = arrayValue;
        }
//        int minValueInArray = array[0];
//        int maxValueInArray = array[0];

        for (int i = 0; i < arrayLength; i++) {
            if (array[i] < minValueInArray) {
                minValueInArray = array[i];
            }
            if (array[i] > maxValueInArray) {
                maxValueInArray = array[i];
            }
        }

        System.out.println("Max value in array: " + maxValueInArray);
        System.out.println("Min value in array: " + minValueInArray);
    }
}
