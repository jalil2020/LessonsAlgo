package Funksiyalarga_oid_sodda_masalalar;/*
 * this file created by Javohir  05.10.2023
 */

public class FunSimple_16 {
    public static void main(String[] args) {
        System.out.println(ishora(-1) + ishora(0));
    }

    public static int ishora(int x) {
        if (x > 0) return 1;
        else if (x < 0) {
            return -1;
        } else {
            return 0;
        }
    }

   /* static void Ishora(int a,int b){
        if (a>0) a=1;
        if (a<0) a=-1;
        if (a==0) a=0;
        if (b>0) b=1;
        if (b<0) b=-1;
        if (b==0) b=0;
        System.out.println(a+b);
    }*/

}
