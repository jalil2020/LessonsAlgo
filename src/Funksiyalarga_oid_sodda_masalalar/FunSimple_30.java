package Funksiyalarga_oid_sodda_masalalar;/*
 * this file created by Javohir  06.10.2023
 */

import static java.lang.StrictMath.pow;

public class FunSimple_30 {
    public static void main(String[] args) {
        DigitN(174561,6);
    }
    static void DigitN(int k, int n){
        int y=k;
        int s=0;
        int m,b=0;
        while (k>0){
            k/=10;
            s++;
        }
        if (n>s) System.out.println(-1);
        else {
            while (y>0){
                s--;
                m = y%10;
                y/=10;
                b+=m*(pow(10,s));
            }
            int f=0;
            while (n>0){
                f=b%10;
                b /=10;
                n--;

            }
            System.out.println(f);
        }

    }
}
