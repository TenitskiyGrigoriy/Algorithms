import java.util.ArrayList;
import java.util.Scanner;

/**
 * Implement a "stack" data structure.
 * Write a program that describes the stack and simulates how the stack works by implementing all the methods listed here.
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
 * The stack size should be limited only by the size of the available RAM. Before executing the back and pop operations,
 * the program must check whether the stack contains at least one element.
 * If there is a back or pop operation in the input data, and the stack is empty,
 * then the program should output the string error instead of a numeric value.
 *
 * Input data
 * Stack management commands are entered, one per line
 *
 * Output
 * It is required to display the stack operation log, one message per line
 */
public class UnlimitedStack {

    public static void main(String[] args) {
        UnlimitedStack.Stack s = new UnlimitedStack.Stack();

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
                case "back":
                    s.back();
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
        private ArrayList stackArray = new ArrayList<>();
        private int size;

        public Stack() {
            this.size = 0;
        }

        public void push(int n) {
            stackArray.add(size, n);
            size++;
            System.out.println("ok");
        }

        public void pop() {
            if (size < 1) {
                System.out.println("error");
                return;
            }
            System.out.println((int) stackArray.get(--size));
        }

        public void back() {
            if (size < 1) {
                System.out.println("error");
                return;
            }
            System.out.println((int) stackArray.get(size - 1));
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

}
