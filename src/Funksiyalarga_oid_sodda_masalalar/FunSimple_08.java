package Funksiyalarga_oid_sodda_masalalar;/*
 * this file created by Javohir  04.10.2023
 */

import java.util.Scanner;

public class FunSimple_08 {
    public static void main(String[] args) {
        int a, r;
        Scanner son = new Scanner(System.in);
        System.out.print("a= ");
        a = son.nextInt();
        System.out.print("r= ");
        r = son.nextInt();
        System.out.println(AddRightDigit(a, r));
    }

    static int AddRightDigit(int a, int r) {
        return a * 10 + r;
    }
}
