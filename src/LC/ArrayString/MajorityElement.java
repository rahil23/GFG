package LC.ArrayString;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MajorityElement {

    public static void main(String[] args) {

        int nums[]={2,2,1,1,1,2,2};
        int n=nums.length/2;
        int majorityKey;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i],1);
            }
        }
       Iterator<Map.Entry<Integer,Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext())
        {
            Map.Entry<Integer,Integer> entry = iterator.next();
            if(entry.getValue()>n)
            {
                 majorityKey = entry.getKey();
            }
        }

    }
}
