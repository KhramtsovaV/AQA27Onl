package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import services.BrowsersService;

public class Task3 {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        BrowsersService browsersService = new BrowsersService();
        driver = browsersService.getDriver();
    }


    @Test
    public void validateSKF() throws InterruptedException {
        driver.get("https://bymed.top/calc/%D1%81%D0%BA%D1%84-2148");
        Thread.sleep(2000);

        driver.switchTo().frame(1);

        WebElement age = driver.findElement(By.id("age"));
        age.sendKeys("38");
        Thread.sleep(2000);

        WebElement sex = driver.findElement(By.id("sex"));
        Select selectSex = new Select(sex);
        selectSex.selectByValue("F");
        Thread.sleep(2000);

        WebElement creatinin = driver.findElement(By.id("cr"));
        creatinin.sendKeys("80");
        Thread.sleep(2000);

        WebElement CrSize = driver.findElement(By.id("cr-size"));
        Select selectCrSize = new Select(CrSize);
        selectCrSize.selectByVisibleText("мг/дл");
        Thread.sleep(2000);

        WebElement weight = driver.findElement(By.id("mass"));
        weight.sendKeys("55");

        WebElement height = driver.findElement(By.id("grow"));
        height.sendKeys("163");


        WebElement button = driver.findElement(By.xpath("//*[@id=\"input-data\"]/p[7]/button"));
        button.click();


        String value1 = driver.findElement(By.id("mdrd_res")).getText();
        String value2 = driver.findElement(By.id("ckd_epi_res")).getText();
        String value3 = driver.findElement(By.id("cge_res")).getText();

        Assert.assertEquals(value1,0.39);
        Assert.assertEquals(value2,0.36);
        Assert.assertEquals(value3,0.83);


    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
