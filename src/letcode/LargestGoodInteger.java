package letcode;

public class LargestGoodInteger {
    public static void main(String[] args) {
//        System.out.println(largestGoodInteger("6777133339"));
//        System.out.println(largestGoodInteger("2300019"));
        System.out.println(largestGoodInteger("42352338"));

    }

    public static String largestGoodInteger(String num) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < num.length() - 2; i++) {
            if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i) == num.charAt(i + 2)) {
                if (ans.length() == 0 || ans.charAt(0) < num.charAt(i)) {
                    ans.setLength(0);
                    ans.append(num.charAt(i));
                    ans.append(num.charAt(i));
                    ans.append(num.charAt(i));
                }
                i += 2;
            }
        }
        return ans.toString();
    }
}
