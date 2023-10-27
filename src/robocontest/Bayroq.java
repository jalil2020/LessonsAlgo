package robocontest;

import java.util.Scanner;

public class Bayroq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] f = new double[45];
        f[0] = 0;
        f[1] = 1;

        for (int i = 2; i < 45; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        System.out.println(f[n] * 2);
    }
}
