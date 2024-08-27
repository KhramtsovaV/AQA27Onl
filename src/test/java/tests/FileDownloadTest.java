package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class FileDownloadTest extends BaseTest {

    @Test
    public void fileDownloadTest() throws InterruptedException {
        driver.get(ReadProperties.getUrl() + "download");
        WebElement downloadLink = driver.findElement(By.linkText("fileToUpload.jpg"));
        downloadLink.click();

        Thread.sleep(5000);

        String pathToDownloadedFile = "Downloads/fileToUpload.jpg";
        String absolutePathToDownloadedFile = new File(System.getProperty("user.home"), pathToDownloadedFile).getAbsolutePath();

        File downloadedFile = new File(absolutePathToDownloadedFile);
        Assert.assertTrue(downloadedFile.exists(), "Downloaded document is not found");
    }
}