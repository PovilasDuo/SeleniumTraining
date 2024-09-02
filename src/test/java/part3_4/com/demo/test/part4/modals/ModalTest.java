package part3_4.com.demo.test.part4.modals;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demo.base.BaseTest;

public class ModalTest extends BaseTest {

    @Test
    public void testModalDialog() {
        var afwPage = homePage.goToAlertsFramesWindowsCard();
        var modelsDialogsPage = afwPage.clickModelDialogs();
        modelsDialogsPage.clickSmallModalButton();
        String actualTextResult = modelsDialogsPage.getSmallModalText();
        Assert.assertTrue(actualTextResult.contains("small modal"), "\n'The message does not contain 'small modal'\n");
        modelsDialogsPage.clickCloseButton();
    }
}
