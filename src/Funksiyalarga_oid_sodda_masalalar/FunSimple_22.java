package Funksiyalarga_oid_sodda_masalalar;/*
 * this file created by Javohir  05.10.2023
 */

public class FunSimple_22 {
    public static void main(String[] args){

        Cacl(5,4,1);
    }

    static void Cacl (int a,int b,int Op){

        switch (Op){
            case 1: System.out.println(a-b);break;
            case 2: System.out.println(a+b);break;
            case 3: System.out.println(a/b);break;
            case 4: System.out.println(a*b);break;

        }

    }
}
