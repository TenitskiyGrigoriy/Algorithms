package Algorithms_with_Andrey.quadratic_sorts;

import java.util.Scanner;

/**
 * The Mesklinites are on an expedition to the ends of the earth.
 * They have a ship made up of N × M rafts linked together. Each raft has its own weight capacity,
 * and each Mesklinite has its own mass. Each raft can have no more than one Mesklinite.
 * If the weight capacity of the selected raft is less than the mass of the Mesklinite, then the poor Mesklinite will sink upon landing.
 *
 * The leader of the expedition thinks over the seating arrangements for the rafts. Help him determine the maximum number of Mesklinites that will be able to hit the road.
 *
 * Input data
 * The first line contains numbers N and M (1 ≤ N, M ≤ 40).
 * Each of the following N lines contains M numbers indicating the carrying capacity of the corresponding raft.
 * The (N+2)-th line contains the number K (1 ≤ K ≤ 2000) – the number of Mesklinites. The (N+3)-th line contains K numbers,
 * the i-th of which is the mass of the i-th Mesklinite. All masses of Mesklinites and carrying capacities of rafts are natural numbers not exceeding 109.
 *
 * Output
 * It is required to print one number - the maximum possible number of participants in the expedition.
 */
public class Expedition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int raftLength = n * m;
        int counter = 0;
        int[] raft = new int[raftLength];
        for (int i = 0; i < raftLength; i++) {
            raft[i] = in.nextInt();
        }
        sort(raft);
        int k = in.nextInt();
        int[] mesklinites = new int[k];
        for (int i = 0; i < k; i++) {
            mesklinites[i] = in.nextInt();
        }
        sort(mesklinites);
        int i = 0;
        int j = 0;
        while (i < raftLength && j < k) {
            if (raft[i] >= mesklinites[j]) {
                counter++;
                i++;
                j++;
            } else {
                i++;
            }
        }
        System.out.println(counter);
    }

    public static void sort(int array[]) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int index = i - 1;
            while (index >= 0 && array[index] > temp) {
                array[index + 1] = array[index];
                index--;
            }
            array[index + 1] = temp;
        }
    }
}
