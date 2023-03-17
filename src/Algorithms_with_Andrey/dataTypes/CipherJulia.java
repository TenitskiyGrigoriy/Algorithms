package Algorithms_with_Andrey.dataTypes;

import java.util.Scanner;

/**
 * Julius Caesar used his own method of encrypting text. Each letter was replaced by the next alphabetically through K positions around the circle.
 * It is necessary to determine the source text by the given encryption.
 *
 * Input data
 * The first line contains an encryption consisting of capital Latin letters. The second line contains the number K (1 ≤ K ≤ 10).
 *
 * Output
 * It is required to display the result of decryption.
 */

public class CipherJulia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int k = in.nextInt();
        char[] chArray = str.toCharArray();
        int alphabetSize = 26;
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] alpArray = alphabet.toCharArray();
        for (int i = 0; i < chArray.length; i++) {
            int find = chArray[i] - 'A';
            if (find - k < 0) {
                chArray[i] = alpArray[alphabetSize - (k - find)];
            } else {
                chArray[i] = alpArray[find - k];
            }
        }
        System.out.println(chArray);
    }
}
