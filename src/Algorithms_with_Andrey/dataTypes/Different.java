package Algorithms_with_Andrey.dataTypes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * Given N numbers, you need to find out how many of them are different.
 *
 * Input data
 * The first line contains the number N – the number of numbers. (1 <= N <= 100000)
 * The second line contains N numbers separated by a space, each not exceeding 2*109 modulo.
 *
 * Output data
 * Print a number equal to the number of different numbers among the data.
 */

public class Different {
    public static void main(String[] args) {
        FastReader reader = new FastReader();
        int arraySize = reader.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arraySize; i++) {
            set.add(reader.nextInt());
        }

        System.out.println(set.size());
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}


