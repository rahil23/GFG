package Array;

public class maxDifferenceProblem {
    public static void main(String[] args) {

        int a[]= {2,3,10,6,4,8,1,11};
        int min = a[0];
        int currMax = a[1]-a[0];
        int res;
        for (int i=1;i<a.length;i++)
        {
            res = a[i]-min;
            if(res>currMax)
            {
                currMax = Math.max(res,currMax);
                min = Math.min(min,a[i]);
            } else if (min>a[i]) {
                min=a[i];

            }
        }
        System.out.println(currMax);
    }
}
