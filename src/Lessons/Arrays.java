package Lessons;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int i = 0;
        while (n > 0) {
            int x = sc.nextInt();
            if (x % 2 == 0) {
                array[i] = x;
                i++;
                n--;
            }
        }
        printArray(array);
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + " -> " + a[i]);
        }
    }
}
