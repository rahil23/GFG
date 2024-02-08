package Array;

public class MoveLeftToRightByNNum {

    public static void main(String[] args) {
 int a[]={1,2,3,4,5};
 int n=3;
 for(int i=0;i<n;i++)
 {
     moveNum(a);
 }
 System.out.println("the final Result is below ");
 for(int i=0;i<a.length;i++)
 {
     System.out.print(a[i]);
 }
    }
    public static int[] moveNum(int a[])
    {
        int temp = a[0];
        for (int i=1;i<a.length;i++)
        {
            a[i-1]=a[i];
        }
        a[a.length-1]=temp;
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
        }
        return a;
    }


}
