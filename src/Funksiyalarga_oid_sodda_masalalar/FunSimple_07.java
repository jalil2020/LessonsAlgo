package Funksiyalarga_oid_sodda_masalalar;/*
 * this file created by Javohir  04.10.2023
 */

import java.util.Scanner;

import static java.lang.StrictMath.pow;

public class FunSimple_07 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner son = new Scanner(System.in);
        System.out.print("a= ");
        a = son.nextInt();
        System.out.print("b= ");
        b = son.nextInt();
        System.out.print("a= ");
        c = son.nextInt();
        InvertDigit(a);
        InvertDigit(b);
        InvertDigit(c);

    }
     static int InvertDigit(int a){
        int raqamlarsoni=0,son=0;
        int r=a;
        while (a>0){
            a /=10;
            raqamlarsoni++;
        }
        int j =raqamlarsoni;
       while (raqamlarsoni>0){
               j--;
               son +=(r%10) * pow(10,j);
               r /=10;
               raqamlarsoni--;
       }

         return raqamlarsoni;
     }

}
