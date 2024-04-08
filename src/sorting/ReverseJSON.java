package sorting;

import org.json.JSONArray;
import org.json.JSONObject;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ReverseJSON {
    public static void main(String[] args) {


        String sampleJSON = "{ \"students\":[ { \"name\" : \"Ram\", \"score\" : 80, \"marks\" : [ 70, 80, 50 ] }, { \"name\" : \"Hari\", \"score\" : 90, \"marks\" : [ 50, 90, 60 ] }, { \"name\" : \"Sita\", \"score\" : 80, \"marks\" : [ 75, 80, 60 ] }, { \"name\" : \"Gita\", \"score\" : 60, \"marks\" : [ 50, 40, 60 ] } ] }";
        JSONObject jsonObject = new JSONObject(sampleJSON);
        JSONArray studentArray = jsonObject.getJSONArray("students");
        ArrayList<JSONObject> list = new ArrayList<>();

        for (int i = 0; i < studentArray.length(); i++) {
           list.add(studentArray.getJSONObject(i));
        }

        Comparator jsonCOmparator = new SortJsonCOmparator();

        Collections.sort(list,jsonCOmparator);

        JSONObject resJsonObject = new JSONObject();
        JSONArray resJSonArray = new JSONArray(list);
        resJsonObject.put("students",resJSonArray);
        System.out.println(resJSonArray.toString());


    }
}
