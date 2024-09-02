package com.demoqa.pages.forms;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.clickJS;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class PracticeFormPage extends FormsPage {

    private By femaleRadioButton = By.id("gender-radio-2");
    private By sportsHobbyCheckbox = By.id("hobbies-checkbox-1");
    private By readingHobbyCheckbox = By.id("hobbies-checkbox-2");
    private By musicHobbyCheckbox = By.id("hobbies-checkbox-3");
    private By sumbitButton = By.id("submit");

    public void clickFemaleRadioButton() {
        scrollToElementJS(femaleRadioButton);
        clickJS(femaleRadioButton);
    }

    public boolean isFemaleSeleccted() {
        return find(femaleRadioButton).isSelected();
    }

    public void clickSportsHobbyCheckBox() {
        if (!find(sportsHobbyCheckbox).isSelected()) {
            scrollToElementJS(sportsHobbyCheckbox);
            clickJS(sportsHobbyCheckbox);
        }
    }

    public void clickReadingHobbyCheckBox() {
        if (!find(readingHobbyCheckbox).isSelected()) {
            scrollToElementJS(readingHobbyCheckbox);
            clickJS(readingHobbyCheckbox);
        }
    }

    public void clickMusicHobbyCheckBox() {
        if (!find(musicHobbyCheckbox).isSelected()) {
            scrollToElementJS(musicHobbyCheckbox);
            clickJS(musicHobbyCheckbox);
        }
    }

    public void unclickReadingHobbyCheckBox() {
        if (find(readingHobbyCheckbox).isSelected()) {
            scrollToElementJS(readingHobbyCheckbox);
            clickJS(readingHobbyCheckbox);
        }
    }

    public boolean isReadingHobbyCheckBoxSelected() {
        return find(readingHobbyCheckbox).isSelected();
    }

    public void clickSubmitButton() {
        //scrollToElementJS(sumbitButton);
        click(sumbitButton);
    }
}
