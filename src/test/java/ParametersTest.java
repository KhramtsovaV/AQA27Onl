import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {

    @Test
    @Parameters({"intParam1", "intParam1"})
    public void testDivisionInt(@Optional("10") int intParam1,@Optional("2") int intParam2) {
        System.out.println(intParam1/intParam2);
    }

    @Test
    @Parameters({"doubleParam1", "doubleParam1"})
    public void doubleDivisionInt(@Optional("10.0") double doubleParam1,@Optional("2.0") double doubleParam2) {
        System.out.println(doubleParam1/doubleParam2);
    }
}
