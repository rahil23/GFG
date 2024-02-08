package Array;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicate {
    public static void main(String[] args) {

        int a[]={5,1,2,2,2,5,6,3,3,1,2,3,4};
       ArrayList<Integer> b = new ArrayList<>();
        int count=0;
        HashMap<Integer,Integer> map = new HashMap();
        for(int i=0;i<a.length;i++)
        {
            if(!(map.containsKey(a[i])))
            {
                b.add(a[i]);
                map.put(a[i],1);
            }

        }
        b.stream().sorted();
        System.out.print(b);
    }
}
