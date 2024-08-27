package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicControlsTest extends BaseTest {

    @Test
    public void dynamicControlsTest() {
        driver.get(ReadProperties.getUrl() + "dynamic_controls");
        WebElement removeButton = driver.findElement(By.xpath("//button[contains(text(),'Remove')]"));
        removeButton.click();
        waitsService.waitVisibilityOf(By.id("message"));
        waitsService.invisibilityOf(By.cssSelector("input[type='checkbox']"));
        Assert.assertFalse(driver.findElement(By.cssSelector("[type='text']")).isEnabled());
        WebElement enableButton = waitsService.elementToBeClickable(By.xpath("//button[contains(text(),'Enable')]"));
        enableButton.click();
        waitsService.waitVisibilityOf(By.id("message"));
        waitsService.elementToBeClickable(By.cssSelector("input[type='text']"));
    }
}
