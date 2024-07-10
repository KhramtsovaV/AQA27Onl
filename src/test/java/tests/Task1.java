package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import services.BrowsersService;

import java.security.Key;

public class Task1 {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new BrowsersService().getDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void warmFloorCalc() throws InterruptedException {
        driver.get("https://kermi-fko.ru/raschety/Calc-Rehau-Solelec.aspx");

        Thread.sleep(2000);

        WebElement floorWidth = driver.findElement(By.id("el_f_width"));
        WebElement floorLength = driver.findElement(By.id("el_f_lenght"));

        WebElement room = driver.findElement(By.id("room_type"));
        Select selectRoom = new Select(room);

        WebElement heatingType = driver.findElement(By.id("heating_type"));
        Select selectHeating = new Select(heatingType);

        WebElement heatLoss = driver.findElement(By.id("el_f_losses"));
        WebElement buttonCalculate = driver.findElement(By.name("button"));

        floorWidth.sendKeys("5");
        floorWidth.sendKeys(Keys.TAB);

        floorLength.sendKeys("4");
        floorLength.sendKeys(Keys.TAB);

        selectRoom.selectByValue("3");
        Thread.sleep(2000);

        selectHeating.selectByValue("2");
        Thread.sleep(2000);

        heatLoss.sendKeys("40");
        heatLoss.sendKeys(Keys.TAB);

        buttonCalculate.click();
        Thread.sleep(2000);

        WebElement resultCablePower = driver.findElement(By.id("floor_cable_power"));
        WebElement resultSpecCablePower = driver.findElement(By.id("spec_floor_cable_power"));

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(resultCablePower.getAttribute("value"), "42");
        softAssert.assertEquals(resultSpecCablePower.getAttribute("value"), "2");

        softAssert.assertAll();


    }


}


