package Algorithms_with_Andrey.dataStructures;

import java.util.Scanner;

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
 * It is guaranteed that the set of input commands satisfies the following requirements:
 * the maximum number of elements in the queue at any time does not exceed 100,
 * all pop and front commands are correct, that is, when they are executed, the queue contains at least one element.
 *
 *
 *
 * Input data
 * Queue management commands are entered, one per line
 *
 * Output
 * It is required to display the log of work with the queue, one message per line
 */
public class SimpleQueue {
    public static void main(String[] args) {
        Queue s = new Queue();

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

    static class Queue {
        private final int[] stackArray;
        private final int size;
        private int head;
        private int tail;

        public Queue() {
            size = 101;
            stackArray = new int[size];
            head = 0;
            tail = 0;
        }

        public void push(int n) {
            stackArray[tail] = n;
             tail = (tail + 1) % size;
            System.out.println("ok");
        }

        public void pop() {
            System.out.println(stackArray[head]);
            head = (head + 1) % size;


        }

        public void front() {
            System.out.println(stackArray[head]);
        }

        public int size() {
            if (tail >= head) {
                return tail - head;
            } else {
                return this.size + tail - head;
            }
        }

        public void clear() {
            tail = 0;
            head = 0;
            System.out.println("ok");
        }

        public void exit() {
            System.out.println("bye");
        }
    }
}
