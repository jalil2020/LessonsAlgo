package Funksiyalarga_oid_sodda_masalalar;/*
 * this file created by Javohir  04.10.2023
 */

public class FunSimple_12 {
    public static void main(String[] args) {
        Sortinc3(5,2,7);
    }
    static void  Sortinc3(int a, int b, int c){
        if (a>b){
            int z = a;
            a = b;
            b=z;
        }
       else if (a>c){
            int v = a;
            a = c;
            c=v;
        }
        else if (b>c){
            int t = b ;
            c= b;
            b=t;
        }
        System.out.println(a+"   "+b+"  "+"  "+c);
    }
}
