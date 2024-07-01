import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertThrows;

public class PriorityTest {

    @Test(priority = 1)
    public void testDivisionIntWithPositiveNumbers() {
        Assert.assertEquals(Calculator.div(10,5), 2);
    }

    @Test(priority = 9)
    public void testDivisionDoubleWithPositiveNumbers() {
        Assert.assertEquals(Calculator.div(10.8, 5.3),2.0377358490566038);
    }

    @Test(priority = 3)
    public void testDivisionIntWithNegativeNumbers() {
        Assert.assertEquals(Calculator.div(-10,-5), 2);
    }

    @Test(priority = 2)
    public void testDivisionDoubleWithNegativeNumbers() {
        Assert.assertEquals(Calculator.div(-10.8, -5.3),2.0377358490566038);
    }

    @Test(priority = 7)
    public void testDivisionIntByZero() {
        assertThrows(ArithmeticException.class, () -> {
            int result = Calculator.div(10, 0);
        });

    }

    @Test(priority = 4)
    public void testDivisionDoubleByZero() {
        assertThrows(ArithmeticException.class, () -> {
            double result = Calculator.div(10.34, 0);
        });

    }
    @Test(priority = 5)
    public void testDivisionIntZeroInTheNumerator() {
        Assert.assertEquals(Calculator.div(0, 5),0);
    }

    @Test(priority = 6)
    public void testDivisionDoubleZeroInTheNumerator() {
        Assert.assertEquals(Calculator.div(0.0, 5.3),0);
    }

    @Test(priority = 3)
    public void testDivisionIntWithOppositeSign() throws InterruptedException {
        Assert.assertEquals(Calculator.div(-195952, 476),-411);
        Thread.sleep(100);
    }

    @Test(priority = 8)
    public void testDivisionDoubleWithOppositeSign() {
        Assert.assertEquals(Calculator.div(10.0, -5.0),-2);
    }

}
