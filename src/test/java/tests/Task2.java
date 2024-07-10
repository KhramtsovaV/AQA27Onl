package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import services.BrowsersService;

public class Task2 {
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
    public void laminateFlooringCalculator() throws InterruptedException {
        driver.get("https://calc.by/building-calculators/laminate.html");

        Thread.sleep(2000);

        WebElement roomLength = driver.findElement(By.cssSelector("#ln_room_id"));
        roomLength.clear();

        WebElement roomWidth = driver.findElement(By.cssSelector("#wd_room_id"));
        roomWidth.clear();

        WebElement laminatePanelLength = driver.findElement(By.cssSelector("#ln_lam_id"));
        laminatePanelLength.clear();

        WebElement laminatePanelWidth = driver.findElement(By.cssSelector("#wd_lam_id"));
        laminatePanelWidth.clear();

        WebElement numberOfPanelsPerPackage = driver.findElement(By.cssSelector("#n_packing"));
        numberOfPanelsPerPackage.clear();

        WebElement methodOfLayingLaminate = driver.findElement(By.cssSelector("#laying_method_laminate"));
        Select selectMethodOfLayingLaminate = new Select(methodOfLayingLaminate);

        WebElement minCuttingLength = driver.findElement(By.cssSelector("#min_length_segment_id"));
        minCuttingLength.clear();

        WebElement distanceFromWalls = driver.findElement(By.cssSelector("#indent_walls_id"));
        distanceFromWalls.clear();

        WebElement laminateLayingDirectionByLength = driver.findElement(By.cssSelector("#direction-laminate-id0"));
        WebElement laminateLayingDirectionByWidth = driver.findElement(By.cssSelector("#direction-laminate-id1"));
        WebElement laminateLayingDirectionByDiagonal45 = driver.findElement(By.cssSelector("#direction-laminate-id2"));
        WebElement laminateLayingDirectionByDiagonal135 = driver.findElement(By.cssSelector("#direction-laminate-id3"));

        WebElement buttonCalculate = driver.findElement(By.cssSelector(".calc-btn-div"));

        Thread.sleep(2000);

        selectMethodOfLayingLaminate.selectByValue("2");
        Thread.sleep(2000);

        roomLength.sendKeys("500");
        roomLength.sendKeys(Keys.TAB);
        Thread.sleep(2000);

        roomWidth.sendKeys("400");
        roomWidth.sendKeys(Keys.TAB);
        Thread.sleep(2000);

        laminatePanelLength.sendKeys("2000");
        laminatePanelLength.sendKeys(Keys.TAB);
        Thread.sleep(2000);

        laminatePanelWidth.sendKeys("200");
        laminatePanelWidth.sendKeys(Keys.TAB);
        Thread.sleep(2000);

        numberOfPanelsPerPackage.sendKeys("8");
        numberOfPanelsPerPackage.sendKeys(Keys.TAB);
        Thread.sleep(2000);

        minCuttingLength.sendKeys("250");
        minCuttingLength.sendKeys(Keys.TAB);
        Thread.sleep(2000);

        distanceFromWalls.sendKeys("10");
        distanceFromWalls.sendKeys(Keys.TAB);
        Thread.sleep(2000);

        laminateLayingDirectionByWidth.click();
        Thread.sleep(2000);

        buttonCalculate.click();
        Thread.sleep(5000);

        String value1 = driver.findElement(By.cssSelector(".calc-result div:first-child span")).getText();
        String value2 = driver.findElement(By.cssSelector(".calc-result div:nth-child(2) span")).getText();
        Assert.assertEquals(value1, "53");
        Assert.assertEquals(value2, "7");

    }
}

