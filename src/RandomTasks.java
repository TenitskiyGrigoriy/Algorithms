import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RandomTasks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        String str1 = in.nextLine();
        String str2 = in.nextLine();
        String[] items1 = str1.split(" ");
        String[] items2 = str2.split(" ");

        for (String s : items1) {
            set1.add(Integer.valueOf(s));
        }
        for (String s : items2) {
            set2.add(Integer.valueOf(s));
        }
        set1.retainAll(set2);
        for(int i :set1){
            System.out.print(i + " ");
        }
    }
}
