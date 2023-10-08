package Funksiyalarga_oid_sodda_masalalar;/*
 * this file created by Javohir  05.10.2023
 */

import static java.lang.Math.sqrt;

public class FunSimple_25 {
    public static void main(String[] args) {
        IsSquare(24);
    }
    static void IsSquare(int k){
         double a= sqrt(k);
        if ( a*a == k) System.out.println(true);
            else System.out.println(false);
    }
}
