package Array;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int a[]={1,0,1,0,1,0};
        int count=0;
        for (int i=0;i<a.length;i++)
        {
            if(a[i]!=0)
            {

                int temp;
                temp=a[i];
                a[i]=a[count];
                a[count]=temp;
             count++;
            }
        }
       for(int j=0;j<a.length;j++)
       {
           System.out.println(a[j]);
       }
    }
    public static void swap(int a,int b)
    {
        int temp;
        temp=a;
        a=b;
        b=temp;
    }
}
