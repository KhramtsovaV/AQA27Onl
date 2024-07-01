import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertThrows;

public class GroupsTest {

    @Test(groups = "smoke")
    public void testDivisionIntWithPositiveNumbers() {
        Assert.assertEquals(Calculator.div(10,5), 2);
    }

    @Test(groups ="regression")
    public void testDivisionDoubleWithPositiveNumbers() {
        Assert.assertEquals(Calculator.div(10.8, 5.3),2.0377358490566038);
    }

    @Test(groups ={"smoke","regression"})
    public void testDivisionIntWithNegativeNumbers() {
        Assert.assertEquals(Calculator.div(-10,-5), 2);
    }

    @Test(groups ={"smoke","regression"})
    public void testDivisionDoubleWithNegativeNumbers() {
        Assert.assertEquals(Calculator.div(-10.8, -5.3),2.0377358490566038);
    }

    @Test(groups ={"smoke","regression"})
    public void testDivisionIntByZero() {
        assertThrows(ArithmeticException.class, () -> {
            int result = Calculator.div(10, 0);
        });

    }

    @Test(groups ={"smoke","regression"})
    public void testDivisionDoubleByZero() {
        assertThrows(ArithmeticException.class, () -> {
            double result = Calculator.div(10.34, 0);
        });

    }
    @Test(groups ={"smoke","regression"})
    public void testDivisionIntZeroInTheNumerator() {
        Assert.assertEquals(Calculator.div(0, 5),0);
    }

    @Test(groups ={"smoke","regression"})
    public void testDivisionDoubleZeroInTheNumerator() {
        Assert.assertEquals(Calculator.div(0.0, 5.3),0);
    }

    @Test(groups = "regression",dependsOnGroups = "smoke")
    public void testDivisionIntWithOppositeSign() {
        Assert.assertEquals(Calculator.div(-195952, 476),-411);
    }

    @Test(groups = "regression")
    public void testDivisionDoubleWithOppositeSign() {
        Assert.assertEquals(Calculator.div(10.0, -5.0),-2);
    }

}
