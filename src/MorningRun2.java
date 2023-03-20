import java.util.Scanner;

public class MorningRun2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double x = in.nextDouble();
        double y = in.nextDouble();
        double sum = 1;
        double eps = 0.0000001;
        int count = 1;

        while (eps < Math.abs(x - y) && sum < y) {
            x = x + (x * 70 / 100);
            sum = sum + x;
            count++;
        }
        System.out.println(count);
    }
}
