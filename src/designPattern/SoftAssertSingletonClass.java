package designPattern;

import org.testng.asserts.SoftAssert;

public class SoftAssertSingletonClass {

    private static SoftAssert softAssertInstance;
     private  SoftAssertSingletonClass() {}

    public static SoftAssert getInstance()
    {
        if(softAssertInstance==null)
        {
            softAssertInstance= new SoftAssert();
        }
        return  softAssertInstance;
    }

    public static void assertTrue(boolean condition , String message)
    {
        try
        {
            getInstance().assertTrue(condition,message);
        }
        catch (AssertionError e)
        {
            getInstance().fail(message);
        }
    }

}
