package Recursion;

public class RecursionPatterns {

    //Print n to 1
    static void func(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        func(n-1);
    }

    public static void main(String[] args) {
        func(5);
    }
}
