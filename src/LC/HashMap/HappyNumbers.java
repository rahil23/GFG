package LC.HashMap;

import java.net.Inet4Address;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HappyNumbers {
  /*  public static boolean isHappy(int n)
    {
        HashSet<Integer> set = new HashSet<>();

        boolean flag = true;
        int sum=0;
        set.add(sum);
        while((set.contains(sum))) {

            String s = String.valueOf(n);
            String sArr[] = s.split("");

            for (int i = 0; i < sArr.length; i++) {
                sum = Integer.parseInt(sArr[i]) * Integer.parseInt(sArr[i]);
                //sum=sum+sArr[i]*sArr[i];
            }
            set.add(sum);
        }
   return flag;
    }

    public static void main(String[] args) {
        isHappy(19);
    }*/

    public static void main(String[] args) {
isHappy(37);
    }
static boolean isHappy(int n) {
    HashSet<Integer> set = new HashSet<>();
    while (true) {

        while(n!=0)
        {
            String s = String.valueOf(n);
            String sArr[] = s.split("");
            int sum = 0;

            for (int i = 0; i < sArr.length; i++) {
                sum = sum + Integer.parseInt(sArr[i]) * Integer.parseInt(sArr[i]);
                //sum=sum+sArr[i]*sArr[i];
            }
            if(sum==1) {
                return true;
            }
            n=sum;
            if(set.contains(n))
            {
                return false;
            }
            set.add(n);
        }

    }
}
}
