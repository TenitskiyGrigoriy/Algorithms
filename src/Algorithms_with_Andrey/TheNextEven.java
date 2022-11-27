package Algorithms_with_Andrey;

import java.util.Scanner;

public class TheNextEven {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int startValue= intScanner.nextInt();

        int theRemainderOfTheDivision = startValue % 2;
        int endValue = startValue + 2 - theRemainderOfTheDivision;

        System.out.println(endValue);
    }
}
