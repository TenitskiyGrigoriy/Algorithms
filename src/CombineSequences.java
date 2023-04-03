import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

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

public class CombineSequences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        List<Integer> listC = new ArrayList<>();
        int i = 1, j = 1;
        while (listC.size() < x) {
            if (i * i < j * j * j) {
                listC.add(i * i);
                i++;
            } else if (i * i > j * j * j) {
                listC.add(j * j * j);
                j++;
            } else {
                listC.add(i * i);
                i++;
                j++;
            }
        }

        System.out.println(listC.get(x - 1));
    }
}

