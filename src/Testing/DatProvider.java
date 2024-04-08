package Testing;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DatProvider {
@DataProvider(name="dataproviderValue")
public Object[][] dataProviderMethod()
{
    return new Object[][]
            {
                    {"name1"}
            };
}
    @Test(dataProvider="dataproviderValue")
    public void t1(String value)
    {
System.out.print(value);
    }
}
