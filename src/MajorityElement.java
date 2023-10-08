import java.util.ArrayList;
import java.util.List;

public class MajorityElement {
    public static void main(String[] args) {
        int[] test = {0, 0, 0};
        System.out.println(majorityElement(test));
    }

    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int count1 = 0;
        int count2 = 0;
        int n2 = 0;
        int n1 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (n2 != nums[i] && count1 == 0 || nums[i] == n1) {
                n1 = nums[i];
                count1++;
            } else {
                if (nums[i] != n1 && count2 == 0 || nums[i] == n2) {
                    n2 = nums[i];
                    count2++;
                } else {
                    count1--;
                    count2--;
                }
            }
            System.out.println("count 1:" + count1);
            System.out.println("count 2:" + count2);
        }

        count1 = 0;
        count2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == n1) {
                count1++;
            } else {
                if (nums[i] == n2) {
                    count2++;
                }
            }
        }


        System.out.println(n1);
        System.out.println(n2);
        if (count1 > nums.length / 3) {
            ans.add(n1);

        }
        if (count2 > nums.length / 3) {
            ans.add(n2);
        }

        return ans;
    }
}
