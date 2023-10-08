package Funksiyalarga_oid_sodda_masalalar;/*
 * this file created by Javohir  05.10.2023
 */

public class FunSimple_16 {
    public static void main(String[] args) {
         Ishora(-25,1);
    }
    static void Ishora(int a,int b){
        if (a>0) a=1;
        if (a<0) a=-1;
        if (a==0) a=0;
        if (b>0) b=1;
        if (b<0) b=-1;
        if (b==0) b=0;
        System.out.println(a+b);
    }

}
