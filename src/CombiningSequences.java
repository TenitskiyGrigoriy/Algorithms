import java.util.Arrays;
import java.util.Scanner;

/**
 * Two infinite increasing sequences of numbers A and B are given.
 * The i-th member of the sequence A is equal to i^2. The i-th member of the sequence B is equal to i^3.
 *
 * It is required to find Cx, where C is an increasing sequence obtained by combining sequences A and B. If there is some number that occurs both in sequence A and sequence B, then this number appears in sequence C in a single instance.
 *
 * Input data
 * The single line of the input file contains a natural number x (1 ≤ x ≤ 10^7).
 *
 * Output
 * Print Cx to the output file.
 */
public class CombiningSequences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int c = in.nextInt();
        int[] array = new int[c];
        int[] array2 = new int[c];

        for (int i = 1; i <= c; i++) {
            array[i - 1] = i * i;
//            System.out.println(array[i - 1]);
        }

        for (int i = 1; i <= c; i++) {
            array2[i - 1] = i * i * i;
//            System.out.println(array2[i - 1]);
        }

        int[] result = merge(array, array2);
        int[] result2 = mergeSort(result);

        System.out.println(result[c]);
//        System.out.println(result2[c]);
    }

    public static int[] mergeSort(int[] src) {
        if(src.length <= 1) {
            return src;
        }
        int[] left = Arrays.copyOfRange(src, 0, src.length / 2);
        int[] right = Arrays.copyOfRange(src, left.length, src.length);
        return merge(mergeSort(left), mergeSort(right));
    }

    private static int[] merge(int[] left, int[] right) {
        int leftIn = 0;
        int rightIn = 0;
        int[] result = new int[left.length + right.length];

        while (leftIn < left.length && rightIn < right.length) {
            if (left[leftIn] < right[rightIn]) {
                result[rightIn + leftIn] = left[leftIn];
                leftIn++;
            } else if (left[leftIn] > right[rightIn]) {
                result[rightIn + leftIn] = right[rightIn];
                rightIn++;
            } else if (left[leftIn] == right[rightIn]) {
                result[rightIn + leftIn] = left[leftIn];
                leftIn++;
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
}
