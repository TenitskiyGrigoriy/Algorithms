package Algorithms_with_Andrey;

import java.util.Scanner;

public class NextAndPrevious {
    public static void main(String[] args) {
        Scanner intScanner = new Scanner(System.in);
        int value = intScanner.nextInt();
        System.out.println("The next number for the number " + value + " is " + (value + 1) + ".");
        System.out.println("The previous number for the number " + value + " is " + (value - 1) + ".");
    }
}
