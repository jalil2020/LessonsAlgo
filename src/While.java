public class While {
    public static void main(String[] args) {
        int e = 10;

        double a1 = 2;
        double k = 1;
        /**
         *
         *   Ak =  2 + 1/A(k-1)
         *   k  = 2, 3 ....
         *   a1 = 2
         *   a2 = 2 + 1/A(k-1) =  2 + 1/a1
         *   a3 = 2 + 1/a2
         *
         * */
        boolean isStop = true;
        while (isStop) {
            double temp = a1;
            a1 = 2 + 1 / a1;
            k++;

            System.out.println("temp : " + temp);
            System.out.println("a1 : " + a1);

            if (Math.abs(a1 - temp) > e) {
                System.out.println(k);
                System.out.println(temp);
                System.out.println(a1);
                isStop = false;
            }
        }

    }
}
