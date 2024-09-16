package services;

import configuration.ReadProperties;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.util.Locale;

public class BrowsersService {
    private WebDriver driver = null;

    public BrowsersService() {
        switch (ReadProperties.browserName().toLowerCase()) {
            case "chrome":
                DriverManagerType driverManagerType = DriverManagerType.CHROME;
                WebDriverManager.getInstance(driverManagerType).clearDriverCache().setup();

                driver = new ChromeDriver();
                break;
            case "safari":
                driverManagerType = DriverManagerType.SAFARI;
                WebDriverManager.getInstance(driverManagerType).clearDriverCache().setup();

                driver = new SafariDriver(getSafariOptions());
                break;
            default:
                System.out.println("Browser " + ReadProperties.browserName() + " not supported");
        }
    }

    public WebDriver getDriver() {
        return driver;
    }

    private ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--disable-gpu");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--silent");
        options.addArguments("--start-maximized");

        if (ReadProperties.isHeadless()) {
            options.addArguments("--headless");
        }
        return options;
    }

    private SafariOptions getSafariOptions() {
        SafariOptions options = new SafariOptions();

        return options;
    }
}

