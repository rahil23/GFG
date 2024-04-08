package String;

public class Regex {
    public static void main(String[] args) {

        String s="w1ww2.r3ah4il5.c6om7";
        String split[] = s.split("[.]");
        for(String s1 : split)
        {
            System.out.print(s1);
        }
        String splits[]=s.split("[0-9]");
        for(String s2 : splits )
        {
            System.out.println(s2);
        }
    }
}
