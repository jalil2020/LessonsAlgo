package Funksiyalarga_oid_sodda_masalalar;/*
 * this file created by Javohir  03.10.2023
 */

import static java.lang.Math.sqrt;
import static java.lang.StrictMath.pow;

public class FunSimple_04 {
    public static void main(String[] args) {
        Triangle(5,6,7);

    }
    static void Triangle(double a, double b, double c){
        double pa = a+a+a;
        double pb = b+b+b;
        double pc = c+c+c;
        double Sa= (sqrt(a)/4)*pow(a,2);
        double Sc= (sqrt(c)/4)*pow(c,2);
        double Sb= (sqrt(b)/4)*pow(b,2);
        System.out.println(pa+" "+pb+" "+pc+" "+Sa+" "+Sb+" "+Sc);
    }
}
