public class ComparisonQuickSortAndBubbleSort {
    public static void main(String[] args) {

        test1();
        test2();
    }

    private static void quickSort(int[] arr, int from, int to) {

        if (from < to) {

            int divideIndex = partition(arr, from, to);

            quickSort(arr, from, divideIndex - 1);

            quickSort(arr, divideIndex, to);
        }
    }

    private static int partition(int[] arr, int from, int to) {
        int rightIndex = to;
        int leftIndex = from;

        int pivot = arr[from + (to - from) / 2];
        while (leftIndex <= rightIndex) {

            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }

            while (arr[rightIndex] > pivot) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                swap(arr, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    private static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    private static void bubbleSort(int[] arr) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    swap(arr, i - 1, i);
                    sorted = false;
                }
            }
        }
    }

    private static void test1() {
        int testLen = 10000;

        int[] arr1 = new int[testLen];
        int[] arr2 = new int[testLen];

        System.out.println("\n------Случайный массив------");

        for (int i = 0; i < testLen; i++) {
            arr2[i] = arr1[i] = (int)Math.round(Math.random() * 10000);
        }

        System.out.println("Быстрая сортировка:");
        measureTime(() -> quickSort(arr1, 0, testLen - 1));

        System.out.println("Сортировка пузырьком:");
        measureTime(() -> bubbleSort(arr2));
    }

    private static void test2() {
        int testLen = 1000000;

        int[] arr1 = new int[testLen];
        int[] arr2 = new int[testLen];

        System.out.println("\n-----Отсортированный массив-----");

        for (int i = 0; i < testLen; i++) {
            arr2[i] = arr1[i] = i;
        }

        System.out.println("Быстрая сортировка:");
        measureTime(() -> quickSort(arr1, 0, testLen - 1));

        System.out.println("Сортировка пузырьком:");
        measureTime(() -> bubbleSort(arr2));
    }

    private static void measureTime(Runnable task) {
        long startTime = System.currentTimeMillis();
        task.run();
        long elapsed = System.currentTimeMillis() - startTime;
        System.out.println("Затраченное время: " + elapsed + " ms");
    }
}

