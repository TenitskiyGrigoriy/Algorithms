package Algorithms_with_Andrey.arrays;

import java.util.Scanner;

public class AreThereTwoElementsWithTheSameSigns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        boolean isTrue = false;

        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < arraySize - 1; i++) {
            if(array[i] > 0 && array[i + 1] > 0 || array[i] < 0 && array[i + 1] < 0) {
                isTrue = true;
                break;
            }
        }

        if (isTrue) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
