package day_6_12_2023;

public class TotalMoney {
    public static void main(String[] args) {
        System.out.println(totalMoney(4));
    }

    public static int totalMoney(int n) {
        int week = n / 7;
        int lastDay = n % 7;
        int full_week = week * 28 + (week - 1 + 1) * (week - 1) * 7 / 2;
        int full_lastDay = (lastDay + 2* week + 1) * lastDay / 2;
        System.out.println(full_week);
        System.out.println(full_lastDay);
        return full_week + full_lastDay;

//        return (n / 7) * 28 + ((n / 7 + 1) * (n / 7) / 2) * 7 + (n % 7 + 1) * (n % 7) / 2;

//        return (n / 7) * 28 + (n % 7) * (n / 7) + (n % 7 + 1) * (n % 7) / 2;
    }
}
