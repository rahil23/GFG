package Collection;

import java.util.HashSet;

public class Set {
    public static void main(String[] args) {

        HashSet<Integer>  in  = new HashSet<>();
        in.add(9);
        in.add(1);
        in.add(5);
        in.add(2);
        in.add(6);
        in.add(2);
        in.add(7);
        in.add(3);
        for(int i=0;i<in.size();i++)
        {
            System.out.println(in);
        }
        //ArrayList/ HashMap , HashSet , /
    }
}
