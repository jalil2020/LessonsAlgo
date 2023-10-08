package Funksiyalarga_oid_sodda_masalalar;/*
 * this file created by Javohir  04.10.2023
 */

public class FunSimple_10 {
    public static void main(String[] args) {
    Swap(45,60);
    }

    static void Swap(int a, int b){
        int v = a;
            a = b;
            b = v;
        System.out.println("a =  "+a+"   b = "+b);
    }

}
