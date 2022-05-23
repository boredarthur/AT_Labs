package main.java.utils;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class ElementWrapper {
    private final WebElement element;

    public ElementWrapper(WebElement element) {
        this.element = element;
    }

    public void click() {
        element.click();
//        Reporter.log("Click on " + element);
        System.out.println("Click on " + element);
    }

    public void sendKeys(String keys) {
        element.sendKeys(keys);
//        Reporter.log("Sending keys: " + keys + " for " + element);
        System.out.println("Sending keys: " + keys + " for " + element);
    }
}
