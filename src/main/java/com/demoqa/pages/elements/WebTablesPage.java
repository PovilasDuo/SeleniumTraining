package com.demoqa.pages.elements;

import com.base.BasePage;
import org.openqa.selenium.By;

public class WebTablesPage extends ElementsPage {

    private By registraionAgeField = By.id("age");
    private By submitButton = By.id("submit");

    public void clickEdit(String email) {
        By edit = By.xpath("//div[text()='"+email+"']//following::span[@title='Edit']");
        click(edit);
    }

    public void setAge(String age) {
        set(registraionAgeField, age);
    }

    public void clickSubmitButton() {
        click(submitButton);
    }

    //Searching with indexes is not recommended because they can change
    public String getTableAge(String email) {
        By tableAge = By.xpath("//div[text()='alden@example.com']//preceding::div[1]");
        return find(tableAge).getText();
    }
}
