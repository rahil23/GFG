package LC.ArrayString;

public class ProductOfArraySelf {

    public static int[] product(int nums[]) {
        int n = nums.length;
        int[] ans = new int[n];
        int cur = 1;
        for (int i = 0; i < n; i++) {
            ans[i] = cur;
            cur *= nums[i];
        }
        cur = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= cur;
            cur *= nums[i];
        }
        return ans;
    }

    public static void main(String args[])
    {
        int nums[]={1,2,3,4};
        int ans[]=product(nums);
        for(int i=0;i<ans.length;i++)
        {
            System.out.println(ans[i]);
        }
    }
}

