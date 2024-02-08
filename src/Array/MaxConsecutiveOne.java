package Array;

public class MaxConsecutiveOne {

    public static void main(String[] args) {
        int a[]={0,0,0,1,1,1,1,1,0};
        int count=0;
        int res=0;
        boolean flag = true;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==0)
            {
                count=0;
            }
            else
            {
                count++;
              res=  Math.max(count,res);
            }
        }
        System.out.println(res);
    }
}
