package Recursion;

public class Factorial {

    static void func(int n,int fact)
    {

        if(n==0)
        {
            return;
        }
        fact = fact*n;
       System.out.println(fact);
        func(n-1,fact);

    }
    public static void main(String[] args) {
        int fact=1;
        func(4,fact);


    }
}
