package part2.tests.tests.login;

import org.testng.Assert;
import org.testng.annotations.Test;
import part2.tests.base.BaseTest;

public class LogInTest extends BaseTest {

    @Test
    public void testLoginErrorMessage() {
        loginPage.setUsername("standard_user");
        loginPage.setPassword("not_correct");
        loginPage.clickLoginButton();
        String actualMessage = loginPage.getErrorMessage();

        Assert.assertTrue(actualMessage.contains("Epic sadface"));
    }
}
