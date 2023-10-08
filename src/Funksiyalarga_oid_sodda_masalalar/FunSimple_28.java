package Funksiyalarga_oid_sodda_masalalar;/*
 * this file created by Javohir  05.10.2023
 */

public class FunSimple_28 {
    public static void main(String[] args) {
        IsPrime(71);
    }
    static void IsPrime(int n){
        int p = 0;
        int a=0;
        while (n>=p){
            p++;
            if ( n%p==0) a++;
        }
        if (a>2) System.out.println(false);
        else System.out.println(true);
    }

}
