package Funksiyalarga_oid_sodda_masalalar;/*
 * this file created by Javohir  05.10.2023
 */

import static java.lang.StrictMath.pow;

public class FunSimple_18 {
    public static void main(String[] args) {
        RingS(3);
    }
    static void RingS(int r){
        int S = (int) (3.14*pow(r,2));
        System.out.println(S+" sm2");
    }
}
