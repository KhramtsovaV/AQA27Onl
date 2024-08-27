package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.Assert;

import java.io.File;

public class FileUploadTest extends BaseTest {

    @Test
    public void fileUploadTest() {
        driver.get(ReadProperties.getUrl() + "upload");
        WebElement chooseFileButton = waitsService.presenceOfElementLocated(By.id("file-upload"));
        String pathToFile = "src/test/resources/data/fileToUpload.jpg";
        String absolutePathToFile = new File(pathToFile).getAbsolutePath();
        chooseFileButton.sendKeys(absolutePathToFile);
        waitsService.elementToBeClickable(By.id("file-submit")).click();

        Assert.assertEquals(driver.findElement(By.id("uploaded-files")).getText(),"fileToUpload.jpg");
    }
}
