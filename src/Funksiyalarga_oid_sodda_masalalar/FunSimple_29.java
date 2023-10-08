package Funksiyalarga_oid_sodda_masalalar;/*
 * this file created by Javohir  05.10.2023
 */

public class FunSimple_29 {
    public static void main(String[] args) {
        DigitCount(1000);
    }
    static void DigitCount(int n){
        int p = 0;
        while ( n>0){
            n /=10;
            p++;
        }
        System.out.println(p);
    }
}
