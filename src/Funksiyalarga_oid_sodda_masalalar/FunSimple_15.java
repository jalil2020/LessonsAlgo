package Funksiyalarga_oid_sodda_masalalar;/*
 * this file created by Javohir  05.10.2023
 */

public class FunSimple_15 {
    public static void main(String[] args) {
        ShiftLeft3(3, 1, 2);
    }

    static void ShiftLeft3(int a, int b, int c) {
        int d = a + b + c; // 1 2 3  6

        a = d - (c + a); //20  b 2

        c = d - (a + c); //5   c 1

        b = d - (c + b); //15  b 3

        System.out.println(a + "  " + b + "  " + c);
    }
}

