package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ContextMenuTest extends BaseTest {

    @Test
    public void contextMenuTest() {
        driver.get(ReadProperties.getUrl() + "context_menu");
        WebElement contextMenuElement = driver.findElement(By.id("hot-spot"));
        actions.contextClick(contextMenuElement).build().perform();
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "You selected a context menu");
        alert.accept();
    }
}
