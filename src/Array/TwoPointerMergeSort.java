package Array;

public class TwoPointerMergeSort {
    public static void main(String[] args) {

        int nums1[]={1,2,3,4,0,0,0,0};
        int nums2[]= {2,3,7,8};
        int m=3,n=3;

        int i=m-1;
        int temp;
        int newIndex=nums1.length-1;
        int j=nums2.length-1;
        for(int k=nums1.length-1 ; k>=m;k--)
        {
            if(nums2[j]>nums1[i])
            {
                nums1[k]=nums2[j];
                j--;
            }
            else {
                temp=nums1[i];
                nums1[k]=temp;
                nums1[i]=nums2[j];

            }
        }

        for(int f=0;f<nums1.length-1;f++)
        {
            System.out.println(nums1[f]);
        }

    }
}
