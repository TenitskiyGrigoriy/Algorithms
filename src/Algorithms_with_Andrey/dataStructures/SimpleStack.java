package Algorithms_with_Andrey.dataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Implement a "stack" data structure. Write a program that describes the stack and simulates how the stack works by implementing all the methods listed here.
 * The program reads a sequence of commands and, depending on the command, performs one or another operation.
 * After executing each command, the program should print one line. Possible commands for the program:
 *
 * push n
 * Push the number n onto the stack (the value of n is specified after the command). The program should print ok.
 * pop
 * Remove the last element from the stack. The program should output its value.
 * back
 * The program must print the value of the last element without removing it from the stack.
 * size
 * The program should print the number of elements on the stack.
 * clear
 * The program should clear the stack and print ok.
 * exit
 * The program should print bye and exit.
 * Input data
 * Stack management commands are entered in the previously described format, 1 per line.
 *
 * It is guaranteed that the set of input commands satisfies the following requirements:
 * the maximum number of elements on the stack at any time does not exceed 100, all pop and back commands are correct, that is,
 * when they are executed, the stack contains at least one element.
 *
 * Output
 * It is required to display the protocol of work with the stack, 1 message per line
 */
public class SimpleStack {

    public static void main(String[] args) {
        Stack s = new Stack(100);

        FastReader in = new FastReader();

        label:
        while (true) {
            String str = in.next();
            switch (str) {
                case "push":
                    int n = in.nextInt();
                    s.push(n);
                    break;
                case "pop":
                    System.out.println(s.pop());
                    break;
                case "back":
                    System.out.println(s.back());
                    break;
                case "size":
                    System.out.println(s.size());
                    break;
                case "clear":
                    s.clear();
                    break;
                case "exit":
                    s.exit();
                    break label;
            }
        }
    }

    static class Stack {
        private int[] stackArray;
        private int size;

        public Stack(int size) {
            stackArray = new int[size];
            this.size = 0;
        }

        public void push(int n) {
            stackArray[size] = n;
            size++;
            System.out.println("ok");
        }

        public int pop() {
            return stackArray[--size];
        }

        public int back() {
            return stackArray[size - 1];
        }

        public int size() {
            return size;
        }

        public void clear() {
            size = 0;
            System.out.println("ok");
        }

        public void exit() {
            System.out.println("bye");
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                if (st.hasMoreTokens()) {
                    str = st.nextToken("\n");
                } else {
                    str = br.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
