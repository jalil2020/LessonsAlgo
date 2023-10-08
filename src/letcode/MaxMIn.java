package letcode;

import java.util.Scanner;

public class MaxMIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int min1 = sc.nextInt();
        int min2 = sc.nextInt();

        if (min1 > min2) {
            int temp = min1;
            min1 = min2;
            min2 = temp;
        }

        for (int i = 2; i < n; i++) {
            int x = sc.nextInt();
            if (min1 > x) {
                min2 = min1;
                min1 = x;
            }
        }

        System.out.println(min1);
        System.out.println(min2);


        /* int b = 9, c = 32;
        int max = 0, maxIndex = -1;
        for (int i = 0; i < 10; i++) {
            int x = sc.nextInt();
            if (x > b && x < c && max < x) {
                max = x;
                maxIndex = i;
            }
        }

        if (maxIndex > 0) {
            System.out.println("max:" + max + "index: " + maxIndex);
        } else {
            System.out.println(0);
        }*/
    }
}
