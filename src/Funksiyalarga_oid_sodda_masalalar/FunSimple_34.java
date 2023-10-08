package Funksiyalarga_oid_sodda_masalalar;/*
 * this file created by Javohir  07.10.2023
 */

public class FunSimple_34 {  public static void main(String[] args){
    FactN(5);
}

    static void FactN (int k){
        int summa =1;
        while(k>0){
            summa *=k;
            k--;

        }
        System.out.println(summa);
    }

}











