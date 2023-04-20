package Algorithms_with_Andrey.dataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Implement a "queue" data structure. Write a program that describes the queue and simulates the operation of the queue by implementing all the methods listed here.
 * The program reads a sequence of commands and, depending on the command, performs one or another operation.
 * After executing each command, the program should print one line. Possible commands for the program:
 *
 * push n
 * Add the number n to the queue (the value of n is given after the command). The program should print ok.
 * pop
 * Remove the first element from the queue. The program should output its value.
 * front
 * The program should output the value of the first element without removing it from the queue.
 * size
 * The program should output the number of items in the queue.
 * clear
 * The program should clear the queue and print ok.
 * exit
 * The program should print bye and exit.
 * The queue size should be limited only by the available RAM. Before executing the front and pop operations,
 * the program must check whether the queue contains at least one element. If the front or pop operation occurs in the input data,
 * and the queue is empty, then the program should output the string error instead of a numeric value.
 *
 * Input data
 * Queue management commands are entered, one per line
 *
 * Output
 * It is required to display the log of the queue operation, one message per line
 */
public class newUnlimitedQueue {
    public static void main(String[] args) {
        ArrayList<String> commands = new ArrayList<>();
        newUnlimitedQueue.Queue s = new Queue();

        FastReader in = new FastReader();

        label:
        while (true) {
            String str = in.next();
            switch (str) {

                case "push":
                    int n = in.nextInt();
                    commands.add(s.push(n));
                    break;
                case "pop":
                    commands.add(s.pop());
                    break;
                case "front":
                    commands.add(s.front());
                    break;
                case "size":
                    commands.add(s.size());
                    break;
                case "clear":
                    commands.add(s.clear());
                    break;
                case "exit":
                    commands.add(s.exit());
                    String arraylist = String.join("\n", commands);
                    System.out.println(arraylist);
                    break label;
            }
        }
    }

    static class Queue {
        private final int[] stackArray;
        private final int size;
        private int head;
        private int tail;

        public Queue() {
            size = 100001;
            stackArray = new int[size];
            head = 0;
            tail = 0;
        }

        public String push(int n) {
            stackArray[tail] = n;
            tail = (tail + 1) % size;
            return "ok";
        }

        public String pop() {
            if (size().equals("0")) {
                return "error";
            } else {
                int tmp = stackArray[head];
                head = (head + 1) % size;
                return Integer.toString(tmp);
            }
        }

        public String front() {
            if (size().equals("0")) {
                return "error";
            } else {
                return Integer.toString(stackArray[head]);
            }
        }

        public String size() {
            if (tail >= head) {
                return Integer.toString(tail - head);
            } else {
                return Integer.toString(size + tail - head);
            }
        }

        public String clear() {
            tail = 0;
            head = 0;
            return "ok";
        }

        public String exit() {
            return "bye";
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
