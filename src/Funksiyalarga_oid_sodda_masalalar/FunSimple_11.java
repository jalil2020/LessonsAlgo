package Funksiyalarga_oid_sodda_masalalar;/*
 * this file created by Javohir  04.10.2023
 */

public class FunSimple_11 {
    public static void main(String[] args) {
        Minmax(60, 50);
    }

    static void Minmax(int x, int y) {
        if (x > y) {
            int v = x;
            x = y;
            y = v;
        }
        System.out.println(" x = " + x + "   y = " + y);
    }
}
