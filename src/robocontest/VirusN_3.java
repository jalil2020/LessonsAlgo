package robocontest;

import java.util.Scanner;

public class VirusN_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        double d = b - a;
        int ans = 1;
        if (d > 0) {
            ans = (int) (Math.log10(d) / Math.log10(2));
        }
        System.out.println(ans);
    }
}
