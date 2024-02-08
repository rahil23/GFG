package Array;

public class LeaderProblem {
    public static void main(String[] args) {
        int a[]={7,10,4,3,6,5,2};
        for(int i=0;i<a.length;i++)
        {
            for (int j=i+1;j<a.length;j++)
            {
                if(a[j]>a[i])
                {
                    break;
                }
                else if(j==a.length-1)
                {
                    System.out.println(a[i]);
                }
            }
        }
    }
}
