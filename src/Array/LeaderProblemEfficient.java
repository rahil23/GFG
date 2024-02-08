package Array;

public class LeaderProblemEfficient {
    public static void main(String[] args) {
        int a[]={7,10,4,3,6,5,2};
        int len = a.length-1;
        int currLeader = a[len];
        System.out.println(currLeader);
        for(int i=len;i>0;i--)
        {
            if(a[i]>currLeader)
            {
                currLeader=a[i];
                System.out.println(currLeader);
            }
        }
    }
}
