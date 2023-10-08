package Funksiyalarga_oid_sodda_masalalar;/*
 * this file created by Javohir  02.10.2023
 */

public class FunSimple_02 {
    public static void main(String[] args) {
        PowerA234(6,7,8);
    }

    static void PowerA234(double a, double b, double c) {
        double a2 = a * a;
        double a3 = a * a * a;
        double a4 = a * a + a + a;
        double b2 = b * b;
        double b3 = b * b * b;
        double b4 = b * b * b * b;
        double c2 = c * c;
        double c3 = c * c * c;
        double c4 = c * c * c * c;

        System.out.println(a2 + " " + a3 + " " + a4 + " " + b2 + " " + b3 + " " + b4 + " " + c2 + " " + c3 + " " + c4);
    }
}

