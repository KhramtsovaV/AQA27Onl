import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTest {

    @Test(retryAnalyzer = Retry.class)
    public void testDivisionIntWithPositiveNumbers() {
        Assert.assertEquals(Calculator.div(10,5), 2);
    }

    @Test(retryAnalyzer = Retry.class)
    public void testDivisionDoubleWithPositiveNumbers() {
        Assert.assertEquals(Calculator.div(10.8, 5.0),2.0377358490566038);
    }

}
