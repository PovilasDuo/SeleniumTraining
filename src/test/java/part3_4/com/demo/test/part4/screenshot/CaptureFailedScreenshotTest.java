package part3_4.com.demo.test.part4.screenshot;

import org.testng.annotations.Test;
import part3_4.com.demo.base.BaseTest;

public class CaptureFailedScreenshotTest extends BaseTest {

    @Test
    public void testClickingSubmitButtonWithoutJavaScriptExecutor() {
        var practiceFormPage = homePage.goToForms().clickPracticeForm();
        practiceFormPage.clickSubmitButton();
    }
}
