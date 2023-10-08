public class FindMedianSortedArrays {
    public static void main(String[] args) {
        int[] num1 = {1, 2};
        int[] num2 = {3,4};

        System.out.println(findMedianSortedArrays(num1, num2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size = nums1.length + nums2.length;
        int[] all = new int[size];

        int i = 0;
        int n1 = 0;
        int n2 = 0;
        while (i < size) {
            if (nums1.length == n1) {
                System.out.println("2n1 = " + n1 + " n2 = " + n2);
                all[i] = nums2[n2];
                n2++;
            } else {
                if (nums2.length == n2) {
                    System.out.println("1n1 = " + n1 + " n2 = " + n2);
                    all[i] = nums1[n1];
                    n1++;
                } else {
                    if (nums1[n1] > nums2[n2]) {
                        System.out.println("2n1 = " + n1 + " n2 = " + n2);
                        all[i] = nums2[n2];
                        n2++;
                    } else {
                        System.out.println("1n1 = " + n1 + " n2 = " + n2);
                        all[i] = nums1[n1];
                        n1++;
                    }
                }
            }
            i++;
        }

        for (int j = 0; j < size; j++) {
            System.out.println(all[j]);
        }
        if (size % 2 == 0) {
            return (double)(all[size / 2] + all[size / 2 - 1]) / 2;
        } else {
            return (double)all[size / 2];
        }
    }
}
