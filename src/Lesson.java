public class Lesson {
    public static void main(String[] args) {


        System.out.println(raqamlar(1234567, 5));

//        KvadratTenglama(1, 5, 6);
//       KvadratTenglama(1, -5, 6);
    }

    static int raqamlar(int a, int r) {
        return a * 10 + r;
    }

    public static void KvadratTenglama(int a, int b, int c) {
        double x1 = (-b + ditermonat(a, b, c)) / (2 * a);
        double x2 = (-b - ditermonat(a, b, c)) / (2 * a);

        System.out.println("x1=" + x1);
        System.out.println("x2=" + x2);
    }

    public static double ditermonat(int a, int b, int c) {

        return Math.sqrt(b * b - 4 * a * c);
    }


    public static void kvadrati(int n) {
        n = 10;
        System.out.println(n);
//        System.out.println(a * a);
    }

    public static int kvadrat(int n) {
        return n * n;
    }
}
