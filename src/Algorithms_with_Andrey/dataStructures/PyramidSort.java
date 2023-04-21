package Algorithms_with_Andrey.dataStructures;

import java.util.Arrays;
import java.util.Scanner;

public class PyramidSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }

        int[] heap = new int[n];
        for (int i = 0; i < n; i++) {
            insert(heap, i, array[i]);
        }
        System.out.println(Arrays.toString(heap));
//        heapSort(array);
//        for (int number: array) {
//            System.out.print(number + " ");
//        }
    }


    private static void siftUp(int[] a, int size,  int x) {
        int i = size - 1;
        while (i > 0 && a[i] < a[(i-1)/2]) {
            swap(a, i, (i-1)/2);
            i = (i - 1) / 2;
        }

    }

    private static void insert(int[] a, int size, int x) {
        a[size] = x;
        size++;
        siftUp(a, size, x);
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static void siftDown(int[] a, int i, int size) {
        while (2 * i + 1 < size) {
            int l = 2 * i + 1;
            int r = 2 * i + 2;
            int smallest = i;
            if (a[l] < a[i]) {
                smallest = l;
            }
            if (r < size && a[r] < a[smallest]) {
                smallest = r;
            }
            if (i != smallest) {
                swap(a, i, smallest);
                i = smallest;
//            heapFly(a, largest, size);
            } else {
                break;
            }
        }
    }

    private static int pop(int[] a, int size) {
        int top = a[0];
        a[0] = a[size - 1];
        siftDown(a, 0, size - 1);
        return top;
    }

    private static void heapSort(int[] a) {
        int n = a.length;
        int i = n - 1;
        while (i >= 0) {
            siftDown(a, i--, n);
        }
        System.out.println(Arrays.toString(a));
        while (n > 0) {
            a[n - 1] = pop(a, n);
            n--;
        }
        for (int j = 0; j < a.length / 2; j++) {
            swap(a, j, a.length - j - 1);
        }
    }
}
