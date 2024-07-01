import org.testng.Assert;
import org.testng.annotations.Test;

public class InvocationTest {
    @Test(invocationCount = 10, threadPoolSize = 5, invocationTimeOut = 10000)
    public void testDivisionIntWithPositiveNumbers() {
        Assert.assertEquals(Calculator.div(10,5), 2);
    }
}
