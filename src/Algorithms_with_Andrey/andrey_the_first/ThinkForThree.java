package Algorithms_with_Andrey.andrey_the_first;

import java.util.Scanner;

/**
 * Two of his friends came to Vasily with great news: they won N rubles in the lottery.
 * Since the lottery ticket was received for change during the general purchase in the store,
 * its ownership could not be determined. It was decided to share the winnings equally.
 * Vasily would like to know if it is possible to share the winnings fairly?
 *
 * Input data
 * The single line contains a natural number N, the number of characters of which does not exceed 255.
 *
 * Output
 * It is required to output "YES" if the entered number is divisible by 3, "NO" if it is not divisible.
 */
public class ThinkForThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        int n = 0;

        for (int i = 0; i < str.length(); i++) {
            n = n + Integer.parseInt(str.substring(i, i + 1));
        }
        if (n % 3 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
