package tests;

import configuration.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import services.BrowsersService;


public class TaskTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new BrowsersService().getDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void loginTest() throws InterruptedException {
        driver.get(ReadProperties.getUrl());
        SoftAssert softAssert = new SoftAssert();

        // Find webElement by TagName
        driver.findElement(By.tagName("title")).isDisplayed();

        // Find webElement by ID
        driver.findElement(By.id("user-name")).sendKeys(ReadProperties.username());

        // Find webElement by Name
        driver.findElement(By.name("password")).sendKeys(ReadProperties.password());

        // Find webElement by className
        driver.findElement(By.className("btn_action")).click();

        Thread.sleep(5000);

        // Find webElement by partialLinkText
        Assert.assertTrue(driver.findElement(By.partialLinkText(" Bike Light")).isDisplayed());

        //.class
        Assert.assertTrue(driver.findElement(By.cssSelector(".shopping_cart_link")).isDisplayed());

        //[attribute=value]
        Assert.assertTrue(driver.findElement(By.cssSelector("[data-test='title']")).isDisplayed());

        // Find webElement by linkText
        WebElement backpackTitle = driver.findElement(By.linkText("Sauce Labs Backpack"));
        backpackTitle.click();
        Thread.sleep(3000);

        //.class1 .class2
        Assert.assertTrue(driver.findElement(By.cssSelector(".header_label .app_logo")).isDisplayed());

        //#id
        Assert.assertTrue(driver.findElement(By.cssSelector("#inventory_item_container")).isDisplayed());

        //.class1.class2
        WebElement productName = driver.findElement(By.cssSelector(".inventory_details_name.large_size"));
        softAssert.assertEquals(productName.getText(), "Sauce Labs Fleece Jacket");

        //tagname
        Assert.assertTrue(driver.findElement(By.cssSelector("footer")).isDisplayed());

        //[attribute~=value]
        WebElement descriptionProduct = driver.findElement(By.cssSelector("[class~=inventory_details_desc]"));
        softAssert.assertEquals(descriptionProduct.getText(), "It's not every day that you come across a midweight quarter-zip fleece jacket capable of handling everything from a relaxing day outdoors to a busy day at the office.");

        //tagname .class
        WebElement price = driver.findElement(By.cssSelector("div.inventory_details_price"));
        softAssert.assertEquals(price.getText(), "$49.99");

        //[attribute|=value]
        WebElement buttonAddToCart = driver.findElement(By.cssSelector("[id|=add-to-cart]"));
        softAssert.assertEquals(buttonAddToCart.getText(), "Add to cart");
        buttonAddToCart.click();
        Thread.sleep(3000);

        //[attribute^=value]
        WebElement buttonBackToProducts = driver.findElement(By.cssSelector("[id^=back-]"));
        softAssert.assertEquals(buttonBackToProducts.getText(), "Back to products");
        buttonBackToProducts.click();

        //[attribute$=value]
        WebElement buttonAddToCartMainPageBackpack = driver.findElement(By.cssSelector("[id$=sauce-labs-backpack]"));
        buttonAddToCartMainPageBackpack.click();

        //[attribute*=value]
        WebElement cartBadge = driver.findElement(By.cssSelector("[data-test*=badge]"));
        cartBadge.isDisplayed();
        Thread.sleep(3000);

        //By.xpath("//tag[contains(@attribute,'text')]");
        WebElement cart = driver.findElement(By.xpath("//*[contains(@id,'cart_container')]"));
        cart.click();
        Thread.sleep(3000);

        //preceding
        Assert.assertTrue(driver.findElement(By.xpath("//footer/preceding::div[@id='contents_wrapper']")).isDisplayed());

        //By.xpath("//tag[@attribute='value']");
        WebElement itemQuantity = driver.findElement(By.xpath("//*[@data-test='item-quantity']"));
        softAssert.assertEquals(itemQuantity.getText(), "1");

        //By.xpath("//tag[text()='text']");
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']")).isDisplayed());

        //By.xpath("//tag[contains(text(),'text')]")
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Sly Pack that melds uncompromising style with')]")).isDisplayed());

        //поиск элемента с условием AND, например //input[@class='_2zrpKA _1dBPDZ' and @type='text']
        WebElement priceInCart = driver.findElement(By.xpath("//*[@class='inventory_item_price' and @data-test='inventory-item-price']"));
        softAssert.assertEquals(priceInCart.getText(), "$29.99");

        //descendant
        Assert.assertTrue(driver.findElement(By.xpath("//*[@class='item_pricebar']//descendant::div")).isDisplayed());

        //ancestor
        WebElement checkout = driver.findElement(By.xpath("//*[text()='Checkout']//ancestor::div"));
        Assert.assertTrue(checkout.isDisplayed());

        //parent
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Continue Shopping']/parent::div")).isDisplayed());

        Assert.assertTrue(driver.findElement(By.cssSelector(".social")).isDisplayed());

        //following
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='cart_footer']/following::div")).isDisplayed());
        Thread.sleep(3000);
    }
}


