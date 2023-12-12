package day_7_12_23;

public class LargestOddNumberinString {

    public static void main(String[] args) {
        System.out.println(largestOddNumber("4206"));
    }

    public static String largestOddNumber(String num) {
        String ans = "";

        for (int i = num.length() - 1; 0 <= i; i--) {
            if ((num.charAt(i) - '0') % 2 == 1) {
                ans = num.substring(0,i+1);
                break;
            }
        }

        return ans;
    }
}
