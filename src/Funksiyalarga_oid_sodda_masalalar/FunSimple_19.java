package Funksiyalarga_oid_sodda_masalalar;/*
 * this file created by Javohir  05.10.2023
 */

import static java.lang.StrictMath.abs;
import static java.lang.StrictMath.pow;

public class FunSimple_19 {
    public static void main(String[] args) {
    RingS2(2,3);
    }
    static void RingS2(int r1, int r2) {
        int S1 = (int) (3.14 * pow(r1, 2));
        int S2 = (int) (3.14 * pow(r2, 2));

        System.out.println(abs(S1-S2) + " sm2"+"     S1= "+S1+"     S1= "+S2);
    }
}