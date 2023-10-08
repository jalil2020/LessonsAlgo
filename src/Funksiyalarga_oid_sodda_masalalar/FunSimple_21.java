package Funksiyalarga_oid_sodda_masalalar;/*
 * this file created by Javohir  05.10.2023
 */

public class FunSimple_21 {
    public static void main(String[] args) {
         SumRange(4,8);
    }

    static void SumRange(int a, int b) {
        int s = 0;
        while (b >= a) {
            s += a;
            a++;


        }

        System.out.println(s);
    }
}