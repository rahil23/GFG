package Array;

public class MergeTwoArray {

    public static void main(String[] args) {
        int nums1[] = {1,2,3,4,7};
        int nums2[] = {2,5,6};
        int m=5 , n=3;
        int c [] = new int[m+n];
        int a=0;
        int b=0;
        for(int i=0;i<c.length;i++)
        {
            if(a!=nums1.length && b!= nums2.length) {
                if (nums1[a] >= nums2[b]) {
                    c[i] = nums2[b];
                    b++;
                } else if (nums2[b] >= nums1[a]) {
                    c[i] = nums1[a];
                    a++;
                }
            } else if (a==nums1.length) {
                c[i]=nums2[b];
                b++;
            }
            else {
                c[i]=nums1[a];
                a++;
            }
        }

        for(int i=0;i<c.length;i++)
        {
            System.out.println(c[i]);
        }
    }
}
