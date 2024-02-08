package Array;

public class SecondLargest {

    public static void main(String[] args) {

        int[] a = {15,20,50,30,60,40,100};
        int lar=a[0];
        int secLar = a[0];
        for(int i=0;i<a.length;i++)
        {
            for (int j=0;j<a.length;j++)
            {
                if(a[j]>lar)
                {
                    secLar=lar;
                    lar=a[j];
                }
                else if(a[j]>secLar && a[j]!=lar)
                {
                    secLar=a[j];
                }

            }
        }

        System.out.println("largest Element is"+lar);
        System.out.println("second largest Element is"+secLar);


    }
}
