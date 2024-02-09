package Array;

public class TwoPointerMergeSort {
    public static void main(String[] args) {

        int nums1[] = {1, 2, 3, 0, 0, 0};
        int nums2[] = {2, 3, 7};
        int m = 3, n = 3;
        int i = m - 1;
        int j = n - 1;
        int k = nums1.length - 1;


        while(j>=0)
            {
                if (i>=0 && nums1[i] > nums2[j])
                {
                    nums1[k] = nums1[i];
                    i--;
                    k--;
                } else
                {
                    nums1[k] = nums2[j];
                    k--;
                    j--;
                }
            }

        for (int c = 0; i < nums1.length; c++) {
            System.out.println(nums1[c]);
        }
    }
}
