import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertThrows;

public class DependencyTest {

    @Test
    public void testDivisionIntByZero() {
        assertThrows(ArithmeticException.class, () -> {
            int result = Calculator.div(10, 0);
        });

    }

    @Test(dependsOnMethods = "testDivisionIntByZero")
    public void testDivisionDoubleByZero() {
        assertThrows(ArithmeticException.class, () -> {
            double result = Calculator.div(10.34, 0);
        });

    }
    @Test
    public void testDivisionIntZeroInTheNumerator() {
        Assert.assertEquals(Calculator.div(0, 5),0);
    }

    @Test(dependsOnMethods ="testDivisionIntZeroInTheNumerator",alwaysRun = true)
    public void testDivisionDoubleZeroInTheNumerator() {
        Assert.assertEquals(Calculator.div(0.0, 5.3),0);
    }
}
