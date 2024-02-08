package Array;

public class MaximumSubArraySum {
    public static void main(String[] args) {
       // int a[]={1,-2,3,-1,2};
       // int a[]={5,8,3};
        int a[]={2,3,-8,7,-1,2,3};

        int res = 0;
        for(int i=0;i<a.length;i++)
        {int sum = 0;
            for(int j=i;j<a.length;j++)
            {
                sum = sum+a[j];
                res = Math.max(sum,res);
            }
        }
        System.out.println(res);
    }
}
