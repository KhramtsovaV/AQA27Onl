import org.testng.annotations.Test;
import org.testng.Assert;


public class CalcTest {

    @Test
    public void testDivisionIntWithPositiveNumbers() {
        Assert.assertEquals(Calculator.div(10,5), 2);
    }

    @Test
    public void testDivisionDoubleWithPositiveNumbers() {
        Assert.assertEquals(Calculator.div(10.8, 5.3),2.0377358490566038);
    }

@Test
    public void testDivisionIntWithNegativeNumbers() {
    Assert.assertEquals(Calculator.div(-10,-5), 2);
    }

    @Test
    public void testDivisionDoubleWithNegativeNumbers() {
        Assert.assertEquals(Calculator.div(-10.8, -5.3),2.0377358490566038);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testIntDivisionByZero() {
        Assert.assertEquals(Calculator.div(10, 0),0);
    }

    @Test
    public void testDivisionDoubleByZero() {
        Assert.assertEquals(Calculator.div(10.34, 0.0),Double.POSITIVE_INFINITY);
        Assert.assertEquals(Calculator.div(-23.4, 0.0),Double.NEGATIVE_INFINITY);

    }
    @Test(testName = "division zero be zero")
    public void testDivisionZeroByZero(){
        Assert.assertEquals(Calculator.div(0.0, 0.0),Double.NaN);
    }

    @Test
    public void testDivisionIntZeroInTheNumerator() {
        Assert.assertEquals(Calculator.div(0, 5),0);
    }




    @Test()
    public void testDivisionDoubleZeroInTheNumerator() {
        Assert.assertEquals(Calculator.div(0.0, 5.3),0);
    }

    @Test(enabled = false,description = "duplicated")
    public void test2DivisionDoubleZeroInTheNumerator() {
        Assert.assertEquals(Calculator.div(0.0, 5.3),0);
    }

    @Test(timeOut = 1000)
    public void testDivisionIntWithOppositeSign() throws InterruptedException {
        Assert.assertEquals(Calculator.div(-195952, 476),-411);
        Thread.sleep(100);
    }

    @Test
    public void testDivisionDoubleWithOppositeSign() {
        Assert.assertEquals(Calculator.div(10.0, -5.0),-2);
    }

}
