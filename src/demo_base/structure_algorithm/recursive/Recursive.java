package demo_base.structure_algorithm.recursive;

import org.junit.Test;

public class Recursive {

    public static void printNumIterative(int num) {
        for (int a = 1; a <= num; a++) {
            System.out.println("num: " + a);
        }
    }

    public static void printNumRecursive(int num) {
        if (num > 0) {
            printNumRecursive(num - 1);
            System.out.println("num: " + num);
        }
    }

    @Test
    public static void iterative() {
        printNumRecursive(10);
    }

    @Test
    public static void recursive() {
        printNumRecursive(10);
    }

}
