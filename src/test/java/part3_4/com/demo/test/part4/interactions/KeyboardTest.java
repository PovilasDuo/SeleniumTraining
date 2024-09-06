package part3_4.com.demo.test.part4.interactions;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demo.base.BaseTest;

public class KeyboardTest extends BaseTest {

    @Test
    public void testKeyboardInput() {
        var textBoxPage = homePage.goToElements().clickTextBox();
        textBoxPage.setFullNameTextBox("Test Name 123");
        textBoxPage.setEmail("test@email.com");
        textBoxPage.setCurrentAddressField("1234 Selenium Avenue");
        textBoxPage.setCurrentAddressField("Suite 3400");
        textBoxPage.setCurrentAddressField("Dallas, Texas");
        textBoxPage.clickSubmitButton();

        String actualAddress = textBoxPage.getCurrentAddress();
        Assert.assertTrue(actualAddress.contains("Suite 3400"), "\nActual address does not contain 'Suite 3400'\n");
    }
}
