package HashMap;

import java.util.Comparator;
import java.util.Map;

public class MapComparator implements Comparator<Map.Entry<Character,Integer>> {

    @Override
    public int compare(Map.Entry<Character,Integer> o1, Map.Entry<Character,Integer> o2) {
        if(o2.getValue()>o1.getValue())
        {
            return 1;
        }

        else if(o2.getValue()==o1.getValue())
        {

            Character ch1 = o1.getKey();
            Character ch2 = o2.getKey();
            if(ch2>ch1)
            {
                return -1;
            }
        }
        else {
            return -1;
        }
        //return o2.getValue().compareTo(o1.getValue());
        return 0;
    }
}
