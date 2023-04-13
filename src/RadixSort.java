import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RadixSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }

        radixSort(array);

        for (int number : array) {
            System.out.print(number + " ");
        }

    }

    public static void radixSort(int[] array) {

        List<Integer>[] buckets = new ArrayList[10];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        boolean flag = false;
        int tmp = -1;
        int divisor = 1;
        while (!flag) {
            flag = true;

            for (Integer i : array) {
                tmp = i / divisor;
                buckets[tmp % 10].add(i);
                if (flag && tmp > 0) {
                    flag = false;
                }
            }

            int a = 0;
            for (int b = 0; b < 10; b++) {
                for (Integer i : buckets[b]) {
                    array[a] = i;
                    a++;
                }
                buckets[b].clear();
            }
            divisor *=10;
        }
    }
}
