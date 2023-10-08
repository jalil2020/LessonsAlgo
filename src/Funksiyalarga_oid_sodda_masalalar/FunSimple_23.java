package Funksiyalarga_oid_sodda_masalalar;/*
 * this file created by Javohir  05.10.2023
 */

public class FunSimple_23 {
    public static void main(String[] args){

        Quarter(-1,5);
    }

    static void Quarter (int x,int y){

        if (x>0 && y>0){
            System.out.println(1);
        }
        if (x<0 && y>0){
            System.out.println(2);
        }
        if (x<0 && y<0){
            System.out.println(3);
        }
        if (x>0 && y<0){
            System.out.println(4);
        }


    }
}
