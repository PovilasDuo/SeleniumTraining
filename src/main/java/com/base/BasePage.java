package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//Page Object Model
public class BasePage {

    public static WebDriver driver;

    public void setDriver(WebDriver driver) {
        BasePage.driver = driver;
    }

    protected WebElement find(By locator) {
        return driver.findElement(locator);
    }

    protected void set(By locator, String text) {
        WebElement webElement = find(locator);
        webElement.clear();
        webElement.sendKeys(text);
    }

    protected void click(By locator) {
        find(locator).click();
    }

    public static void delay(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        }
        catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
