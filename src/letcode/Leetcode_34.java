package letcode;

import java.util.Arrays;

public class Leetcode_34 {
    public static void main(String[] args) {
        int[] test = {5, 7, 7, 8, 8, 10};
        System.out.println(Arrays.toString(searchRange(test, 3)));
    }

    public static int[] searchRange(int[] nums, int t) {
        int l = 0;
        int r = nums.length - 1;
        int start = -1;
        int end = -1;
        int mid = 0;

        while (l < r) {
            mid = (l + r) / 2;
            if (nums[mid] < t) {
                l = mid + 1;
            } else {
                if (nums[mid] == t) {

                }
                r = mid - 1;
            }

        }
        int[] ans = {start, end};

        return ans;
    }
}
