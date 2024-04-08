package String;

public class AnagramMostEfficientWay {
    public static void main(String[] args) {

        String s1="Listen";
        String s2="Sllent";
        int sum1=0;
        int sum2=0;
        int j=0;
        for(int i=0;i<s1.length();i++)
        {
            sum1=sum1+s1.charAt(i);
            sum2 = sum2+s2.charAt(j);
            j++;
        }
        if(sum1==sum2)
        {
            System.out.println("its an anagram");
        }
        else {
            System.out.println("it's not anagram");
        }
    }
}
