package HashMap;

import java.util.*;

public class SortHashMap {
    public static void main(String[] args) {

        HashMap<Character,Integer> map = new HashMap<>();
        map.put('e',2);
        //map.put('a',2);
        map.put('w',4);
        map.put('l',2);
        map.put('m',4);
        map.put('o',4);
        map.put('r',3);
       // map.put('c',2);
        map.put('q',5);

      /*  Set<Map.Entry<Character, Integer>> mapIterator = map.entrySet();
        ArrayList<Map.Entry<Character,Integer>> list = new ArrayList(mapIterator);
        MapComparator com = new MapComparator();
        Collections.sort(list, com );*/
       /* System.out.println(map);
        TreeMap<Character,Integer> map2 = new TreeMap<>(map);
        System.out.println(map2);*/

        Set<Map.Entry<Character, Integer>> entry = map.entrySet();
        List<Map.Entry<Character,Integer>> entryList = new ArrayList<>(entry);
        MapComparator com = new MapComparator();
        Collections.sort(entryList,com);
System.out.println(entryList);
String outStr="";
 for(int i=0;i<entryList.size();i++)
 {
    int size= entryList.get(i).getValue();
    for(int j=0;j<size;j++)
    {
       outStr=outStr+ entryList.get(i).getKey();
    }
     System.out.println(entryList.get(i).getValue());
 }
 System.out.println(outStr);
       // System.out.println(map);
    }
}
