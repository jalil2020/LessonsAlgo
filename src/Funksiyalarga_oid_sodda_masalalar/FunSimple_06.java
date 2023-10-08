package Funksiyalarga_oid_sodda_masalalar;/*
 * this file created by Javohir  03.10.2023
 */

public class FunSimple_06 {
    public static void main(String[] args) {
DigitCountSum(555);
    }
    static void DigitCountSum(int a){
        int summa=0, son=0;
        while ( a>0){
              summa += a%10;
              a /=10;
              son++;
        }
        System.out.println(summa + " "+son);
    }
}
