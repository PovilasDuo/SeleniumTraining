package part3_4.com.demo.test.part3.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demo.base.BaseTest;

public class RadioButtonTest extends BaseTest {

    @Test
    public void testRadioButton() {
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickFemaleRadioButton();
        boolean isFemaleRadioButtonSelected = formsPage.isFemaleSeleccted();
        Assert.assertTrue(isFemaleRadioButtonSelected, "\nFemale radio button is not selected\n");
    }
}
