package LC.HashMap;

import java.util.HashMap;

public class IsoMorphic {

    public static void main(String[] args) {

        String s1 = "egg";
        String s2 = "add";
        boolean flag = true;

        HashMap<Character,Character> map = new HashMap();
        char ch[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();

        if(s1.length()==s2.length())
        {
           for(int i=0;i<s1.length();i++)
          {
            if(!(map.containsKey(ch[i])))
            {
                map.put(ch[i],ch2[i]);
            }
            else
            {
                char getChar = map.get(ch[i]);
                if(getChar==ch2[i])
                {
                    System.out.println("String are isomorphice");
                }
                else {
                    flag=false;
                    System.out.println("String are not isomorphice");
                    break;
                }

            }

          }
        }
        else {
            System.out.print("String aare not isomorphic");

        }
    }
}
