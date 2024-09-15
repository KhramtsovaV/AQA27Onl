package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.annotations.Test;

public class CheckBoxTest extends BaseTest {

    @Test
    public void checkBoxTest(){
        userStep.successfulLogin(ReadProperties.username(), ReadProperties.password());
        userStep.openEditProjectPage();
        userStep.clickCheckBox();
    }

    @Test
    public void removeBoxTest() {
        userStep.successfulLogin(ReadProperties.username(), ReadProperties.password());
        userStep.openEditProjectPage();
        userStep.removeCheckBox();
    }
}