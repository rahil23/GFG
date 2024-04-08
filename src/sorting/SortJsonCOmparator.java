package sorting;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Comparator;
import java.util.List;

public class SortJsonCOmparator implements Comparator<JSONObject> {



    @Override
    public int compare(JSONObject o1, JSONObject o2) {
        int mark1 = (int) o1.get("score");
        int mark2 = (int) o2.get(("score"));


        if(mark2>mark1){
            return 1;
        }
        else if(mark1>mark2)
        {
            return -1;
        }
        else {
            JSONArray marksArray1 = (JSONArray) o1.get("marks");
            JSONArray marksArray2 = (JSONArray) o2.get("marks");
            int markObj1 = (Integer)marksArray1.get(0);
            int markObj2 = (Integer)marksArray2.get(0);

            if(markObj2>markObj1) {
                return 1;
            } else if (markObj1>markObj2) {
                return -1;
            }
            else {
                return 0;
            }
        }
    }
}

