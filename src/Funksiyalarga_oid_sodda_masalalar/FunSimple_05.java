package Funksiyalarga_oid_sodda_masalalar;/*
 * this file created by Javohir  03.10.2023
 */

import static java.lang.Math.abs;

public class FunSimple_05 {
    public static void main(String[] args) {
        RectPS(1,1,6,6);

    }
    static void RectPS(int x1,int y1, int x2,int y2){
        int a = abs(x1-x2);
        int b = abs(y1 - y2);
        int S = a*b;
        int P = a+a+b+b;
        System.out.println(S+" "+ P+" ");

    }
}
