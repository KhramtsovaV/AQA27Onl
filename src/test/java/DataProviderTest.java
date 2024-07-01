import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;


public class DataProviderTest {

    @Test(dataProvider = "integerDataProvider")
    public void testDivisionInt(int a, int b, int expectedResult) {
        Assert.assertEquals(Calculator.div(a, b), expectedResult);
    }

    @DataProvider(name = "integerDataProvider")
    public Object[][] integerDataProvider() {
        return new Object[][]{
                {10, 5, 2},
                {100, 25, 4},
                {8, 2, 4},
                {0, 10, 0}
        };

    }
}
