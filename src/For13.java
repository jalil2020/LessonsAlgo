public class For13 {
    public static void main(String[] args) {
        int n = 9;
        double s = 0;
        for (int i = 0; i < n; i++) {
            double temp = Math.pow(-1, i) * (1 + 0.1 * i);
            System.out.println(i+" -- >  "+temp);
            s += temp;
        }
        /***
         *
         *   -1  -> 0  1
         *   -1  -> 1  -1
         *   -1 ->  2  1
         *   -1  -> 3  -1 * -1 * -1 = -1
         */
        System.out.println(s);
    }
}
