package Collection;

import java.util.*;

public class TreeMap {
    public static void main(String[] args) {
      /*  java.util.TreeMap<String,Integer> map = new java.util.TreeMap<>();
        map.put("D",1);
        map.put("B",3);
        map.put("A",2);
        map.put("C",4);

        System.out.print(map);*/

/*        List : maintain insertion order
        Set : no duplicates
        Map : in the form of key n value
        Tree : key are sorted
        LinkedHashMap*/

       /* HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(null);
        set.add(4);
        set.add(1);
        System.out.println(set); */  // null will come first and duplicate is only allowed once

/*        TreeSet<String> treeSet = new TreeSet<>();
         treeSet.add("Ada");
         treeSet.add("A");
         treeSet.add("B");
         treeSet.add("aD");
         treeSet.add("AAA");

         Iterator it = treeSet.iterator();
         while(it.hasNext())
         {
             System.out.println(it.next());
         }*/

        java.util.TreeMap<String,Integer> map = new java.util.TreeMap<>();
        map.put("D",1);
        map.put("B",3);
        map.put("A",2);
        map.put("C",4);
        map.put("F",6);
        map.put("E",5);
        //map.put(null,8);


        Iterator<Map.Entry<String,Integer>> st= map.entrySet().iterator();
        while(st.hasNext())
        {
            Map.Entry<String,Integer> iter = st.next();
            System.out.print(iter.getKey()+"---"+iter.getValue());
        }
       // System.out.print(map);

    }
}
