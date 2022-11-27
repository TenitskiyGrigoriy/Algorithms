package Algorithms_with_Andrey;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int value = intScanner.nextInt();

        if (value % 4 == 0 && value % 100 != 0 || value % 400 == 0) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
