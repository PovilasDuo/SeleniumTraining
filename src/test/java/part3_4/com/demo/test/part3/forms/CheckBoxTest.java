package part3_4.com.demo.test.part3.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demo.base.BaseTest;

public class CheckBoxTest extends BaseTest {

    @Test
    public void testCheckBox() {
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickSportsHobbyCheckBox();
        formsPage.clickReadingHobbyCheckBox();
        formsPage.clickMusicHobbyCheckBox();

        Assert.assertTrue(formsPage.isReadingHobbyCheckBoxSelected(), "\nReading Check Box is not selected\n");

        formsPage.unclickReadingHobbyCheckBox();
        Assert.assertFalse(formsPage.isReadingHobbyCheckBoxSelected(), "\nReading Check Box is selected\n");
    }
}
