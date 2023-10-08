package Funksiyalarga_oid_sodda_masalalar;/*
 * this file created by Javohir  05.10.2023
 */

public class FunSimple_27 {
    public static void main(String[] args) {
        IsPower5(25,5);
    }
    static void IsPower5(int k,int n) {
         int p=1;
        while (k > p) {

            p *= n;

        }
        if (k==p) System.out.println(true);
        else System.out.println(false);

    }
}
