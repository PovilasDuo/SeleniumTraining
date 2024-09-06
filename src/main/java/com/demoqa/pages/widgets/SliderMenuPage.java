package com.demoqa.pages.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static utilities.ActionsUtility.dragAndDropBy;
import static utilities.GetUtility.getAttributes;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class SliderMenuPage extends WidgetsPage {

    private By slider = By.xpath("//div[@id='sliderContainer']//input[@type='range']");
    private By sliderValue = By.id("sliderValue");

    public void moveSlider(int x, int y) {
        scrollToElementJS(slider);
        dragAndDropBy(find(slider), x, y);
    }

    public String getSliderValue() {
        return getAttributes(sliderValue, "value");
    }
}
