package com.demoqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import static utilities.ActionsUtility.sendKeys;
import static utilities.GetUtility.getText;
import static utilities.JavaScriptUtility.scrollToElementJS;
import static utilities.WaitUtility.explicitWaitUntilVisible;

public class TextBoxPage extends ElementsPage {

    private By fullNameTextBox = By.id("userName");
    private By currentAddressField = By.xpath("//textarea[@id='currentAddress']");
    private By submitButton = By.id("submit");
    private By currentAddressResult = By.xpath("//p[@id='currentAddress']");

    public void setFullNameTextBox (String name) {
        scrollToElementJS(fullNameTextBox);
        sendKeys(find(fullNameTextBox), Keys.chord(name));
    }

    public void setEmail(String email) {
        setFullNameTextBox(Keys.chord(Keys.TAB, email));
    }

    public void setCurrentAddressField(String address) {
        find(currentAddressField).sendKeys(address + Keys.ENTER);
    }

    public void clickSubmitButton() {
        scrollToElementJS(submitButton);
        click(submitButton);
    }

    public String getCurrentAddress() {
        explicitWaitUntilVisible(5, currentAddressResult);
        return getText(currentAddressResult);
    }
}
