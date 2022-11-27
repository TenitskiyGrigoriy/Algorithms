package Algorithms;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = new int[] {64, 42, 73, 41, 31, 65, 15, 25, 67, 42, 74, 54, 36};

        printArray(array);

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
            printArray(array);
        }
    }

    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.println("]");
    }
}
