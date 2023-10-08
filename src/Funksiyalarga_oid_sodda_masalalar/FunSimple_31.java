package Funksiyalarga_oid_sodda_masalalar;/*
 * this file created by Javohir  07.10.2023
 */

import static java.lang.StrictMath.pow;

public class FunSimple_31 {
    public static void main(String[] args) {
        IsPalindrom(121);
    }
    static void IsPalindrom(int k){
        int f=0,d=0, soni=0,y=k,l=y,s=0;
        int m,b=0;

        while (k>0){
            k/=10;
            s++;
        }
        int q=s;
                while (s>0){
                s--;
                m = y%10;
                y/=10;
                b+=m*(pow(10,s));
            }
            while(l>0){
                f = b%10;
                b /=10;
                d = l%10;
                l /= 10;
                if (f==d) soni++;
            }
            if (soni==q) System.out.println("Kiritilgan son Palindrom son");
            else System.out.println("Palindrom son emas");

    }
}
