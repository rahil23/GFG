package LC.HashMap;

import java.util.HashMap;

public class RansomNote {
    public static void main(String[] args) {

        String ransomNote = "aac";
        String maganize = "aab";
        String[] ch = maganize.split("");

        HashMap<String, Integer> ransomMagzine = new HashMap<>();
        for (int i=0;i<maganize.length();i++)
        {
            if(ransomMagzine.containsKey(ch[i]))
            {
                ransomMagzine.put(ch[i],ransomMagzine.get(ch[i])+1);
            }
            else
            {
                ransomMagzine.put(ch[i],1);
            }
        }

      //  HashMap<String,Integer> noteMap = new HashMap<>();
        String note[] = ransomNote.split("");
        boolean flag = true;
        for(int i=0;i<ransomNote.length();i++)
        {
            if(ransomMagzine.containsKey(note[i]))
            {
                ransomMagzine.put(ch[i],ransomMagzine.get(note[i])-1);
            }
            else
            {
                flag=false;
               // return flag;
                break;
            }
        }
        System.out.println("results are : "+ flag);
    }
}
