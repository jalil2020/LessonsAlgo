package Funksiyalarga_oid_sodda_masalalar;/*
 * this file created by Javohir  05.10.2023
 */

import static java.lang.Math.sqrt;

public class FunSimple_25 {
    public static void main(String[] args) {
        System.out.println(IsSquare(25));
    }

    static boolean IsSquare(int k) {
        return k == sqrt(k) * sqrt(k);
    }
}
