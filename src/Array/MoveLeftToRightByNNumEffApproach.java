package Array;

public class MoveLeftToRightByNNumEffApproach {

    public static void main(String[] args) {
 int a[]={1,2,3,4,5};
 int n=2;
 int count=n;
 int len = a.length;
 int[] temp = new int[n];
 for(int i=0;i<n;i++)
 {
     temp[i]=a[i];
 }
 for(int i=n;i<a.length;i++)
 {
     a[i-n]=a[count];
     count++;
 }
 for(int i=0;i<n;i++)
 {
    a[len-n+i]=temp[i];
 }

 for(int i=0;i<a.length;i++)
 {
     System.out.println(a[i]);
 }
 }







 /*for(int i=0;i<n;i++)
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
*/

}
