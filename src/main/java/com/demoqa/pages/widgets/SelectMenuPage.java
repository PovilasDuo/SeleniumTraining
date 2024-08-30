package com.demoqa.pages.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

import static utilities.DropDownUtility.*;
import static utilities.JavaScriptUtility.*;

public class SelectMenuPage extends WidgetsPage {

    private By standardMultiSelect = By.id("cars");

    public void SelectStandardMulti(String text) {
        scrollToElementJS(standardMultiSelect);
//        Select select = new Select(find(standardMultiSelect));
//        select.selectByVisibleText(text);
        selectByVisibleText(standardMultiSelect, text);
    }

    public void SelectStandardMulti(int index) {
        scrollToElementJS(standardMultiSelect);
        selectByIndex(standardMultiSelect, index);
    }

    public void DeselectStandardMulti(String value){
        scrollToElementJS(standardMultiSelect);
        deselectByValue(standardMultiSelect, value);
    }

    public List<String> getAllSelectedStandardMultiOptions() {
        return getAllSelectedOptions(standardMultiSelect);
    }
}
