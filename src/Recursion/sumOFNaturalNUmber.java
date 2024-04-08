package Recursion;

public class sumOFNaturalNUmber {

    static void func(int n,int sum)
    {
        if(n==0)
        {
            System.out.print(sum);
            return;
        }
        sum=sum+n;
       // System.out.print(sum);
        func(n-1,sum);
    }
    public static void main(String[] args) {
        int sum=0;
        func(5,sum);
    }

}
