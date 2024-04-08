package HashMap;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws JSONException {
        // Your JSON data
        String jsonData = "{\n" +
                "    \"students\": [\n" +
                "        {\n" +
                "            \"name\": \"Ram\",\n" +
                "            \"score\": 80,\n" +
                "            \"marks\": [\n" +
                "                70,\n" +
                "                80,\n" +
                "                50\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Hari\",\n" +
                "            \"score\": 90,\n" +
                "            \"marks\": [\n" +
                "                50,\n" +
                "                90,\n" +
                "                60\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Sita\",\n" +
                "            \"score\": 80,\n" +
                "            \"marks\": [\n" +
                "                75,\n" +
                "                80,\n" +
                "                60\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Gita\",\n" +
                "            \"score\": 60,\n" +
                "            \"marks\": [\n" +
                "                50,\n" +
                "                40,\n" +
                "                60\n" +
                "            ]\n" +
                "        }\n" +
                "    ]\n" +
                "}";

        // Parse JSON into Java objects
        JSONObject jsonObject = new JSONObject(jsonData);
        JSONArray studentsArray = jsonObject.getJSONArray("students");
        List<JSONObject> studentsList = new ArrayList<>();
        for (int i = 0; i < studentsArray.length(); i++) {
            studentsList.add(studentsArray.getJSONObject(i));
        }

        // Custom comparator to sort based on score and first element of marks
        Collections.sort(studentsList, new Comparator<JSONObject>() {
            @Override
            public int compare(JSONObject o1, JSONObject o2) {
                try {

                    int score1 = o1.getInt("score");
                    int score2 = o2.getInt("score");
                    if (score1 != score2) {
                        return Integer.compare(score2, score1); // Descending order by score
                    } else {
                        JSONArray marks1 = o1.getJSONArray("marks");
                        JSONArray marks2 = o2.getJSONArray("marks");
                        int mark1 = marks1.getInt(0);
                        int mark2 = marks2.getInt(0);
                        return Integer.compare(mark2, mark1); // Descending order by first element of marks
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                return 0;
            }
        });

        // Convert sorted list back to JSON
        JSONArray sortedStudentsArray = new JSONArray(studentsList);
        JSONObject sortedJsonObject = new JSONObject();
        sortedJsonObject.put("students", sortedStudentsArray);
        System.out.println(sortedJsonObject.toString());
    }
}