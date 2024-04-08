package Java;

public class StringBasics {
    public static void main(String[] args) {

        String s1 = "hi";
        String s2 = "hi";
        String s3 = new String("hi");
        String s4 = new String("hi");
        String s5 = s1;
        String s6=s4;

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3==s4);
        System.out.println(s2==s5);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println(s4.equals(s6));



    }
}
