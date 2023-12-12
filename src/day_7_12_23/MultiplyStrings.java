package day_7_12_23;

public class MultiplyStrings {


    public static void main(String[] args) {
        String ans = multiply("9133", "0");
        if (ans.replace("0","").length() ==0){
            System.out.println("0");
        }
        System.out.println(multiply("9133", "0").replace("0", ""));
//        System.out.println(addTwoNumber("999", "123999"));
    }

    public static String multiply(String num1, String num2) {
        String ans = "0";
        int d = 0;
        for (int i = num1.length() - 1; i >= 0; i--) {
            String temp = "";
            d = 0;
            for (int j = num2.length() - 1; j >= 0; j--) {
                int sum = (num1.charAt(i) - '0') * (num2.charAt(j) - '0') + d;
                d = sum / 10;
                temp = sum % 10 + temp;
                if (j == 0) {
                    if (d > 0) {
                        temp = d + temp;
                    }
                }
            }
            if (num1.length() - 1 - i > 0) {
                temp = temp + "0".repeat(num1.length() - 1 - i);
            }
            ans = addTwoNumber(ans, temp);
        }
        return ans;
    }

    private static String addTwoNumber(String num1, String num2) {
        String x = "";
        int d = 0;

        int m1 = num1.length() - 1;
        int m2 = num2.length() - 1;

        while (m1 >= 0 || m2 >= 0) {

            int sum = 0;
            if (m1 >= 0 && m2 >= 0) {
                sum = num1.charAt(m1) - '0' + num2.charAt(m2) - '0' + d;
                m1--;
                m2--;
            } else if (m1 >= 0) {
                sum = num1.charAt(m1) - '0' + d;
                m1--;
            } else {
                sum = num2.charAt(m2) - '0' + d;
                m2--;
            }

            x = sum % 10 + x;
            d = sum / 10;

            if (m1 < 0 && m2 < 0 && d > 0) {
                x = "1" + x;
            }

        }
        return x;
    }
}
