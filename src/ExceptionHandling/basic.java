package ExceptionHandling;

public class basic {
    public static void main(String[] args) {
        System.out.println("123");
        try {
            System.out.println(5 / 0);
        }
        catch(ArithmeticException e)
        {
        e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("after exeption");
    }
}
