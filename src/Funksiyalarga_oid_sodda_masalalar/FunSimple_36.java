package Funksiyalarga_oid_sodda_masalalar;/*
 * this file created by Javohir  07.10.2023
 */

public class FunSimple_36 {
    public static void main(String[] args){
        FibN(10);
    }

    static void FibN (int n){

        int f1 =0, f2=1, f3=0;
        for(int i = 3; i<=n; i++ ){
            f3=f1+f2;
            int y=f2;
            f2=f3;
            f1=y;
        }
        System.out.println(f3);
    }
}
