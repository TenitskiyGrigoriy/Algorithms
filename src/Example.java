import java.util.Arrays;

public class Example {
    public static void main(String[] args) {

        test1();
        test2();
    }

    public static void babbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int additionalVariable = array[i];
            int index = i - 1;
            while (index >= 0 && array[index] > additionalVariable){
                array[index+1] = array[index];
                index--;
            }
            array[index+1] = additionalVariable;
        }
    }

    public static void maximumSelectionSort(int[] array) {
        int maxIndex;

        for (int i = array.length - 1; i > 0; i--) {
            maxIndex = i;
            for (int j = i - 1; j >= 0; j--) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[maxIndex];
            array[maxIndex] = temp;
        }
    }


    public static int[] mergeSort(int[] array) {
        if(array.length <= 1) {
            return array;
        }
        int[] left = Arrays.copyOfRange(array, 0, array.length / 2);
        int[] right = Arrays.copyOfRange(array, left.length, array.length);
        return merge(mergeSort(left), mergeSort(right));

    }

    private static int[] merge(int[] left, int[] right) {
        int leftIn = 0;
        int rightIn = 0;
        int[] result = new int[left.length + right.length];

        while (leftIn < left.length && rightIn < right.length) {
            if (left[leftIn] <= right[rightIn]) {
                result[rightIn + leftIn] = left[leftIn];
                leftIn++;
            } else {
                result[rightIn + leftIn] = right[rightIn];
                rightIn++;
            }
        }

        while (leftIn < left.length) {
            result[rightIn + leftIn] = left[leftIn];
            leftIn++;
        }
        while (rightIn < right.length) {
            result[rightIn + leftIn] = right[rightIn];
            rightIn++;
        }
        return result;
    }

    public static void quickSort(int[] sortArr, int low, int high) {
        if (sortArr.length == 0 && low >= high) {
            return;
        }

        int middle = low + (high - low) / 2;
        int border = sortArr[middle];

        int i = low;
        int j = high;
        while (i <= j) {
            while (sortArr[i] < border) {
                i++;
            }
            while (sortArr[j] > border) {
                j--;
            }
            if (i <= j) {
                int swap = sortArr[i];
                sortArr[i] = sortArr[j];
                sortArr[j] = swap;
                i++;
                j--;
            }
        }

        //рекурсия для сортировки левой и правой части
        if (low < j) {
            quickSort(sortArr, low, j);
        }
        if (high > i) {
            quickSort(sortArr, i, high);
        }
    }


    private static void test1() {
        int testLen = 100000;

        int[] arr1 = new int[testLen];
        int[] arr2 = new int[testLen];
        int[] arr3 = new int[testLen];
        int[] arr4 = new int[testLen];
        int[] arr5 = new int[testLen];

        System.out.println("\n------Случайный массив------");

        for (int i = 0; i < testLen; i++) {
            arr1[i] = arr2[i] = arr3[i] = arr4[i] = arr5[i] = (int)Math.round(Math.random() * 10000);
        }

        System.out.println("Сортировка пузырьком:");
        measureTime(() -> babbleSort(arr1));

        System.out.println("Сортировка максимумом:");
        measureTime(() -> maximumSelectionSort(arr3));

        System.out.println("Сортировка вставками:");
        measureTime(() -> insertionSort(arr2));

        System.out.println("Сортировка слиянием:");
        measureTime(() -> mergeSort(arr4));

        System.out.println("Быстрая сортировка:");
        measureTime(() -> quickSort(arr5, 0, testLen - 1));

    }

    private static void test2() {
        int testLen = 100000;

        int[] arr1 = new int[testLen];
        int[] arr2 = new int[testLen];
        int[] arr3 = new int[testLen];
        int[] arr4 = new int[testLen];
        int[] arr5 = new int[testLen];

        System.out.println("\n-----Отсортированный массив-----");

        for (int i = 0; i < testLen; i++) {
            arr1[i] = arr2[i] = arr3[i] = arr4[i] = arr5[i] = i;
        }

        System.out.println("Сортировка пузырьком:");
        measureTime(() -> babbleSort(arr1));

        System.out.println("Сортировка максимумом:");
        measureTime(() -> maximumSelectionSort(arr3));

        System.out.println("Сортировка вставками:");
        measureTime(() -> insertionSort(arr2));

        System.out.println("Сортировка слиянием:");
        measureTime(() -> mergeSort(arr4));

        System.out.println("Быстрая сортировка:");
        measureTime(() -> quickSort(arr5, 0, testLen - 1));

    }

    private static void measureTime(Runnable task) {
        long startTime = System.currentTimeMillis();
        task.run();
        long elapsed = System.currentTimeMillis() - startTime;
        System.out.println("Затраченное время: " + elapsed + " ms");
    }
}
