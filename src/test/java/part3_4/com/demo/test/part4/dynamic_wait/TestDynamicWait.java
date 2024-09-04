package part3_4.com.demo.test.part4.dynamic_wait;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demo.base.BaseTest;

@Test
public class TestDynamicWait extends BaseTest {

    public void testVisibleAfterButtonText() {
        var dynamicPage = homePage.goToElements().clickDynamicProperties();
        String actualText = dynamicPage.getVisibleAfterButtonText();
        String expectedTest = "Visible After 5 Seconds";
        Assert.assertEquals(actualText, expectedTest, "\nActual and expected texts do not match\n");
    }

    public void testProgressBar() {
        var progressBarPage = homePage.goToWidgets().clickProgressBar();
        progressBarPage.clickStartButton();
        String actualValue = progressBarPage.getProgressValue();
        String expectedValue = "100%";
        Assert.assertEquals(actualValue, expectedValue, "\nThe progress value has not reached 100%\nThe current value is: " + actualValue + "\n");
    }
}
