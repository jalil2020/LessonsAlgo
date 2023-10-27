package Lessons;

import java.util.Scanner;

public class ToqSoniOchirish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) {
                a = remove(a, i);
            }
        }

        Arrays.printArray(a);

    }

    public static int[] remove(int[] x, int index) {
        int[] a = new int[x.length - 1];
        int j = 0;
        for (int i = 0; i < x.length; i++) {
            if (i != index) {
                a[j] = x[i];
                j++;
            }
        }
        return a;
    }
}
