package Algorithms_with_Andrey;

import java.util.Scanner;

public class PurchasePrice {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int valueA = intScanner.nextInt();
        int valueB = intScanner.nextInt();
        int valueC = intScanner.nextInt();

        int  valueD = valueA * valueC + (valueB * valueC / 100);
        int  valueF = valueB * valueC % 100;

        System.out.println(valueD + " " + valueF);
    }
}
