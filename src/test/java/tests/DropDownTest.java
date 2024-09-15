package tests;

import baseEntities.BaseTest;
import org.testng.annotations.Test;

public class DropDownTest extends BaseTest {

    @Test
    public void dropDownTestByIndex() throws InterruptedException {
        userStep.successfulLogin();
        userStep.transitionInTestCasePage();
        userStep.addTestCase();
        Thread.sleep(3000);
        userStep.selectTypeDropDownByIndex(3);
    }
    @Test
    public void dropDownTestByText() throws InterruptedException {
        userStep.successfulLogin();
        userStep.transitionInTestCasePage();
        userStep.addTestCase();
        Thread.sleep(3000);
        userStep.selectTypeDropDownByText("Functional");
    }
}