package Funksiyalarga_oid_sodda_masalalar;/*
 * this file created by Javohir  04.10.2023
 */

import java.util.Scanner;

import static java.lang.StrictMath.pow;

public class FunSimple_09 {
    public static void main(String[] args) {
        int a,r;
        Scanner son = new Scanner(System.in);
        System.out.print("K= ");
        a = son.nextInt();
        System.out.print("R= ");
        r = son.nextInt();
     AddLeftDigit(a,r);
    }
    static void AddLeftDigit(int a, int r){
        int soni=0;
        int b = a;
        while (a>0){
           a /=10;
           soni++;
       }
        int n = (int) (r *pow(10,soni)+b);

        System.out.println(n);
    }
}
