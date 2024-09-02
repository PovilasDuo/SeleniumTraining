package part3_4.com.demo.test.part4.alerts;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demo.base.BaseTest;

import static utilities.SwitchToUtility.*;

@Test
public class AlertsTest extends BaseTest {

    public void testInformationAlert() {
        String expectedAlertTest = "You clicked a button";
        var alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlerts();
        alertsPage.clickInformationAlertButton();
        Assert.assertEquals(getAlertText(), expectedAlertTest, "\nActual and expected alert messages do not match\n");
        acceptAlert(); //necessary step to be able to perform other actions (handling alert)
    }

    public void testConfirmationAlert() {
        var alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlerts();
        alertsPage.clickConfirmationAlertButton();
        dismissAlert();
        String actualConfirmationResult = alertsPage.getConfirmationResult();
        String expectedConfirmationResult = "You selected Cancel";
        Assert.assertEquals(actualConfirmationResult, expectedConfirmationResult,
                "You did not select cancel alert");
    }

    public void testPromptAlert() {
        String alertText = "Selenium with Java";
        var alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlerts();
        alertsPage.clickPromptAlertButton();
        setAlertText(alertText);
        acceptAlert();
        String actualResult = alertsPage.getPromptAlertResult();
        String expectedResult = "You entered " + alertText;
        Assert.assertEquals(actualResult, expectedResult, "\nActual and expected results do not match\n");
    }
}
