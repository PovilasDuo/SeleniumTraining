package com.demoqa.pages.widgets;

import org.openqa.selenium.By;

import static utilities.DropDownUtility.selectByVisibleText;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class DatePickerMenuPage extends WidgetsPage {

    private By selectDateField = By.id("datePickerMonthYearInput");
    private By monthDropdDown = By.className("react-datepicker__month-select");
    private By yearDropdDown = By.cssSelector(".react-datepicker__year-select");

    private By dayValue (String day) {
        return By.xpath("//div[contains(@class,'react-datepicker__day react-datepicker__day--')][text()='"+day+"']");
    }

    public void clickDay(String day) {
        scrollToElementJS(dayValue(day));
        click(dayValue(day));
    }

    public boolean isDayInMonth(String day) {
        return find(dayValue(day)).isDisplayed();
    }

    public void clickSelectDateField() {
        click(selectDateField);
    }

    public String getDate() {
        return find(selectDateField).getAttribute("value");
    }

    public void selectMonth(String month) {
        selectByVisibleText(monthDropdDown, month);
    }

    public void selectYear(String year) {
        selectByVisibleText(yearDropdDown, year);
    }
}
