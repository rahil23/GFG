package LC.ArrayString;

public class RemoveElements {
    public static void main(String[] args) {
        int a[]={0,1,2,2,3,0,4,2};
        int num=2;
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=num)
            {
                a[count]=a[i];
                count++;
            }
        }
        int i=a.length;
        while(i>0)
        {
            System.out.println(a[i]);
            i--;
        }
    }
}
