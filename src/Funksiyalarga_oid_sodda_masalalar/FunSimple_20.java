package Funksiyalarga_oid_sodda_masalalar;/*
 * this file created by Javohir  05.10.2023
 */

public class FunSimple_20 {

    public static void main(String[] args) {

        TriangleP(3, 4);
    }

    static void TriangleP(int a, int b) {

        double c = Math.sqrt(a * a + b * b);

        System.out.println((c + a + b));
    }
}
