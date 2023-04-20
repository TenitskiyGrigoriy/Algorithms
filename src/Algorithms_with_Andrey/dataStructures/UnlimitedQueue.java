package Algorithms_with_Andrey.dataStructures;

import java.util.Scanner;
import java.util.Stack;

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
 * The queue size should be limited only by the available RAM.
 * Before executing the front and pop operations, the program must check whether the queue contains at least one element.
 * If the front or pop operation occurs in the input data, and the queue is empty, then the program should output the string error instead of a numeric value.
 *
 * Input data
 * Queue management commands are entered, one per line
 *
 * Output
 * It is required to display the log of the queue operation, one message per line
 */
public class UnlimitedQueue {
    public static void main(String[] args) {
        UnlimitedQueue.Queue s = new UnlimitedQueue.Queue();

        Scanner in = new Scanner(System.in);

        label:
        while (true) {
            String str = in.next();
            switch (str) {
                case "push":
                    int n = in.nextInt();
                    s.push(n);
                    break;
                case "pop":
                    s.pop();
                    break;
                case "front":
                    s.front();
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

    static class Queue<T> {
        private final Stack<Integer> s1;
        private final Stack<Integer> s2;

        public Queue() {
            s1 = new Stack<>();
            s2 = new Stack<>();
        }

        public void push(int n) {
            s1.push(n);
            System.out.println("ok");
        }

        public void pop() {
            if (s1.isEmpty() && s2.isEmpty()) {
                System.out.println("error");
            } else if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }
            if (!s2.isEmpty()) {
                System.out.println(s2.pop());
            }

        }

        public void front() {
            if (s1.isEmpty() && s2.isEmpty()) {
                System.out.println("error");
            } else if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }
            if (!s2.isEmpty()) {
                System.out.println(s2.peek());
            }
        }

        public int size() {
            return s1.size() + s2.size();
        }

        public void clear() {
            s1.clear();
            s2.clear();
            System.out.println("ok");
        }

        public void exit() {
            System.out.println("bye");
        }
    }
}
