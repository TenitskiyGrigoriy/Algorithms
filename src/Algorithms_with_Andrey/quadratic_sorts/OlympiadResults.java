package Algorithms_with_Andrey.quadratic_sorts;

import java.util.Scanner;

/**
 * During the Olympiad, each of the participants received their identification number - a natural number.
 * It is necessary to sort the list of participants in the Olympiad by the number of points they have scored.
 *
 * Input data
 * The first line contains a number N (1 ≤ N ≤ 1000) – the number of participants.
 * Each following line gives the identification number and score of the respective participant. All numbers in the input file do not exceed 105.
 *
 * Output
 * In the output file, output the original list in descending order of scores.
 * If some participants have the same scores, then they need to be sorted among themselves in ascending order of the identification number.
 */
public class OlympiadResults {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] id = new int[n];
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = in.nextInt();
            result[i] = in.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (result[j] < result[j + 1]) {
                    int temp = result[j + 1];
                    int temp2 = id[j + 1];

                    result[j + 1] = result[j];
                    id[j + 1] = id[j];

                    result[j] = temp;
                    id[j] = temp2;
                } else if(result[j] == result[j + 1] && id[j] > id[j + 1]) {
                    int temp = result[j + 1];
                    int temp2 = id[j + 1];

                    result[j + 1] = result[j];
                    id[j + 1] = id[j];

                    result[j] = temp;
                    id[j] = temp2;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(id[i] + " " + result[i]);
        }
    }
}
