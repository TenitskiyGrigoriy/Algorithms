package Algorithms_with_Andrey.andrey_the_first;

import java.util.Scanner;

public class PerfectSquad {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int n = str.length();
        int index = -1;
        int palindromeLength = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int isPalindrome = 1;
                for (int k = i; k <= j; k++) {
                    if (str.charAt(k) != str.charAt(j - (k - i))) {
                        isPalindrome = 0;
                        break;
                    }
                }
                if(isPalindrome == 1 && j - i + 1 > palindromeLength) {
                    index = i;
                    palindromeLength = j - i + 1;
                }
            }
        }
        StringBuilder answer = new StringBuilder();
        for (int i = index; i < index + palindromeLength; i++) {
            answer.append(str.charAt(i));
        }
        System.out.println(answer);
    }
}