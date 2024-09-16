package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class RadioButton {
    private List<UIElement> uiElementsList;

    public RadioButton(WebDriver driver, By by) {
        uiElementsList = new ArrayList<>();
        for (WebElement element : driver.findElements(by)) {
            UIElement uiElement = new UIElement(driver, element);
            uiElementsList.add(uiElement);
        }
    }

    public void selectByIndex(int index) {
        if (index >= 0 && index < uiElementsList.size()) {
            uiElementsList.get(index).click();
        } else {
            throw new IndexOutOfBoundsException("Index does not match collection size");
        }
    }

    public void selectByValue(String value) {
        for (UIElement uiElement : uiElementsList) {
            if (uiElement.getAttribute("value").equals(value)) {
                uiElement.click();
                return;
            }
        }
        throw new IllegalArgumentException("Value does not exist");
    }

    public void selectByText(String text) {
        for (UIElement uiElement : uiElementsList) {
            UIElement parent = uiElement.getParentElement();
            if (parent.findElements(By.tagName("strong")).size() > 0) {
                if (parent.findElement(By.tagName("strong")).getText().equals(text)) {
                    uiElement.click();
                    return;
                }
            } else {
                if (parent.findElement(By.tagName("p")).getText().equals(text)) {
                    uiElement.click();
                    return;
                }
            }
        }
        throw new IllegalArgumentException("Value with this text does not exist");
    }
}