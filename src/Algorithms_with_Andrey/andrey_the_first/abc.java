package Algorithms_with_Andrey.andrey_the_first;

import java.math.BigDecimal;
import java.util.Scanner;

public class abc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double eps = 0.0000001;
        if (Math.abs(a + b - c) < eps) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
