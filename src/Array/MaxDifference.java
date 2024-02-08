package Array;

public class MaxDifference {
    public static void main(String[] args) {

        int a[]={2,3,10,6,4,8,1};
        int res = a[1]-a[0];
        int minValue = a[0];
        for(int i=1;i<a.length;i++)
        {
            int diff;
            diff = a[i]-minValue;
            res = Math.max(diff,res);
            minValue = Math.min(a[i],minValue);
        }
    }
}
