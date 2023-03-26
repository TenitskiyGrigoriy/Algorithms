package Algorithms_with_Andrey.andrey_the_first;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * It is known that any natural number can be represented as the sum of at most four squares of natural numbers.
 * Vasya decided to come up with a similar statement for cubes - he wants to know how many cubes are enough to represent any number.
 * His first working hypothesis is eight.
 * <p>
 * It turned out that almost all the numbers that Vasya could think of can be represented as a sum of no more than eight cubes.
 * However, the number 239, for example, does not allow such a representation.
 * Now Vasya wants to find some other such numbers, and also, perhaps, some pattern in the representations of all other numbers,
 * in order to put forward a hypothesis about the form of all numbers that are not represented as the sum of eight cubes.
 * <p>
 * Help Vasya write a program that checks whether it is possible to represent a given natural number as a sum of no more than eight cubes of natural numbers,
 * and if possible, finds some such representation.
 * <p>
 * Input data
 * A natural number N <= 2*10^9 is entered.
 * <p>
 * Output
 * It is required to output no more than eight natural numbers, the cubes of which add up to N.
 * If the desired representation does not exist, then the word IMPOSSIBLE must be output to the output file.
 */
public class SumOfCubes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // change this to the number you want to check
        ArrayList<Integer> cubes = findCubes(n, 8); // try to find a sum of 8 cubes that add up to n
        if (cubes == null) {
            System.out.println("IMPOSSIBLE");
        } else {
            for (int i = 0; i < cubes.size(); i++) {
                System.out.print(cubes.get(i) + " ");
            }
        }
    }

    public static ArrayList<Integer> findCubes(int n, int numCubes) {
        if (n == 0) {
            return new ArrayList<Integer>(); // base case, found a sum of cubes that add up to n
        }
        if (numCubes == 0 || n < 0) {
            return null; // base case, cannot find a sum of numCubes cubes that add up to n
        }
        int root = (int) Math.cbrt(n); // get the cube root of n
        ArrayList<Integer> cubes = null;
        for (int i = root; i >= 1; i--) {
            cubes = findCubes(n - i * i * i, numCubes - 1); // recursively try to find a sum of numCubes-1 cubes that add up to n-i^3
            if (cubes != null) {
                cubes.add(i); // add i to the list of cubes
                return cubes;
            }
        }
        return null; // cannot find a sum of numCubes cubes that add up to n
    }

}

