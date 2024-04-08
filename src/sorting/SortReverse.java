package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortReverse {
    public static void sortReverse()
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(305);
        list.add(998);
        list.add(774);
        list.add(236);
        list.add(881);


        SortReverseComparator comparator = new SortReverseComparator();

       // Collections.sort(list);
       /* for(int i:list)
        {
            System.out.print(i+" ");
        }*/
        Collections.sort(list,comparator);
        for(int i: list)
            System.out.println(i);


    }

    public static void main(String[] args) {
        sortReverse();
    }
}
