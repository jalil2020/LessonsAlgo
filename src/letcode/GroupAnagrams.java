package letcode;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] test = {"eat", "tea", "tan", "ate", "nat", "bat"};
//        String[] test = {""};
        groupAnagrams(test);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        int[] stringSize = new int[strs.length];

        String[] temp = new String[strs.length];


        for (int i = 0; i < strs.length; i++) {
            char[] temArray = strs[i].toCharArray();
            Arrays.sort(temArray);
            temp[i] = String.copyValueOf(temArray);
        }

        System.out.println(Arrays.toString(temp));
        for (int i = 0; i < temp.length; i++) {
            if (!Objects.equals(temp[i], "-1")) {
                List<String> a = new ArrayList<>();
                a.add(strs[i]);
                for (int j = i + 1; j < temp.length; j++) {
                    if (Objects.equals(temp[i], temp[j])) {
                        a.add(strs[j]);
                        temp[j] = "-1";
                    }
                }
                ans.add(a);
            }
        }

        System.out.println(Arrays.toString(stringSize));
        System.out.println(ans);
        return Collections.emptyList();
    }
}
