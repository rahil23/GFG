package LC.HashMap;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public static void main(String[] args) {

      String str[]={"eat","tea","tan","ate","nat","bat"};

        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for(int i=0;i<str.length;i++)
        {
            char ch[] = str[i].toCharArray();
            Arrays.sort(ch);
            String sortedString = String.valueOf(ch);
           if(!(map.containsKey(sortedString)))
           {

               map.put(sortedString,new ArrayList<>());
               //map.put(sortedString,map.get(sortedString).add(str[i]));
           }
              map.get(sortedString).add(str[i]);
        }


        System.out.print(map.values());


    }
}
