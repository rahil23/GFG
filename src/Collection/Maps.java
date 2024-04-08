package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(5, "Sahil");
        map1.put(1, "rahil");
        map1.put(4, "Shyam");
        map1.put(3, "honey");
        map1.put(8, "ganesh");


    /*    Iterator it = map1.entrySet().iterator();
        while(it.hasNext())
        {
            Object s = it.next();
        }*/

    /*    for(int i=0;i<map1.keySet().size();i++)
        {
            System.out.print(map1.keySet());
        }*/

        Iterator<Map.Entry<Integer,String>> it = map1.entrySet().iterator();
        while(it.hasNext())
        {
            Map.Entry<Integer,String> entry = it.next();
            System.out.println(entry.getKey()+"---"+entry.getValue());
        }
    }
}