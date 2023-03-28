package Algorithms_with_Andrey.linear_search_in_an_array;

import java.util.Scanner;

/**
 * Athlete Vasily participated in hockey competitions and received a silver medal in the individual competition.
 * It is known that participants who receive the same number of points are awarded the same rewards.
 * It is known that gold, silver and bronze medals were played. The problem does not ask for the rules of hockey.
 * It is only necessary to determine how many points Vasily scored.
 *
 * To solve this problem, it is better not to use an array.
 *
 * Input data
 * The first line contains the number N (2 ≤ N ≤ 1000) the number of athletes participating in the competition,
 * the second line contains N integers - the results separated by a space.
 *
 * Output
 * It is required to display one number - the result of Vasily
 */
public class SilverMedal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        int first = 0;
        int second = 0;

        for (int i = 0; i < n; i++) {
            if (array[i] > first) {
                second = first;
                first = array[i];
            } else if (array[i] > second && array[i] < first) {
                second = array[i];
            }
        }
        System.out.println(second);
    }
}
