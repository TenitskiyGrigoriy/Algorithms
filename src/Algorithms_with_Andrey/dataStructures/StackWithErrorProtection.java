package Algorithms_with_Andrey.dataStructures;

import java.util.Scanner;
import java.util.Stack;

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
 * Before executing the back and pop operations, the program must check whether the stack contains at least one element.
 * If there is a back or pop operation in the input data, and the stack is empty, then the program should output the string error instead of a numeric value.
 * Input data
 * Stack management commands are entered, one per line
 *
 * Output
 * The program should output the stack log, one message per line.
 */
public class StackWithErrorProtection {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        Scanner in = new Scanner(System.in);

        label:
        while (true) {
            String str = in.next();
            switch (str) {
                case "push":
                    int n = in.nextInt();
                    s.push(n);
                    System.out.println("ok");
                    break;
                case "pop":
                    if (s.size() == 0) {
                        System.out.println("error");
                    } else {
                        System.out.println(s.pop());
                    }
                    break;
                case "back":
                    if (s.size() == 0) {
                        System.out.println("error");
                    } else {
                        System.out.println(s.peek());
                    }
                    break;
                case "size":
                    System.out.println(s.size());
                    break;
                case "clear":
                    s.clear();
                    System.out.println("ok");
                    break;
                case "exit":
                    System.out.println("bye");
                    break label;
            }
        }
    }


}
