package Funksiyalarga_oid_sodda_masalalar;/*
 * this file created by Javohir  05.10.2023
 */

public class FunSimple_14 {
    public static void main(String[] args) {
ShiftRight3(25,30,20);
    }
    static void ShiftRight3(int a, int b, int c){
        int d=a+b+c;
            a=d-(b+a); //20  c
            b=d-(a+b); //5   a
            c=d-(a+b); //15  b

        System.out.println(a+"  "+b + "  "+c);
    }

}
