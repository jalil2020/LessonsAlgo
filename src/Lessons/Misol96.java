package Lessons;

import java.util.Arrays;
import java.util.Scanner;

public class Misol96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int[] ans = new int[n];
        int k = 0;

        ans[0] = array[k];
        k++;
        for (int i = 1; i < n; i++) {

            boolean isHas = false;

            for (int j = 0; j < k; j++) {
                if (ans[j] == array[i]) {
                    isHas = true;
                }
            }

            if (!isHas) {
                ans[k] = array[i];
                k++;
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.println(ans[i]);
        }
        System.out.println(Arrays.toString(ans));
    }
}
