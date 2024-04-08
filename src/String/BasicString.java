package String;

import java.util.ArrayList;
import java.util.HashMap;

public class BasicString {

    public static void main(String[] args) {

        HashMap<Integer, ArrayList<String>> hp = new HashMap<Integer, ArrayList<String>>();
        String text = "Java is a programming language";

        //splitting using whitespace,punctuation etc..
        String wordsArray[] = text.split("[^a-zA-Z0-9]");

        //iterating through Strign array
        for (String eachWord : wordsArray) {
            int length = eachWord.length();

            //if length of the word is already existing as key
            if (hp.containsKey(length)) {
                //fetch the existing value of arraylist: Add the word to array list and add it as value to the key
                ArrayList<String> list = hp.get(length);
                list.add(eachWord);
                hp.put(length, list);
            }
            //if length of the word is not existing as key
            else {
                //Create one empty arraylist: Add the word to array list and add it as value to the key
                ArrayList<String> list = new ArrayList<String>();
                list.add(eachWord);
                hp.put(length, list);
            }
        }
        System.out.println(hp);
        //fetch the keys of hashmap and store in arraylist
        ArrayList<Integer> keyList = new ArrayList<Integer>(hp.keySet());
        ArrayList<String> outputList = new ArrayList<String>();
        //iterate through key list
        for (int key : keyList) {
            //fetch each key's value(arrayList) and add all values of arrayList to the outputList
            ArrayList<String> wordsList = hp.get(key);
            outputList.addAll(wordsList);
        }
        System.out.println(outputList);


    }
}
