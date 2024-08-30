package part3_4.com.demo.test.part3.elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demo.base.BaseTest;

public class WebTableTest extends BaseTest {

    @Test
    public void testWebTable() {
        var webTablePage = homePage.goToElements().clickWebTables();
        String emailValue = "cierra@example.com";
        String ageValue = "22";
        webTablePage.clickEdit(emailValue);
        webTablePage.setAge(ageValue);
        webTablePage.clickSubmitButton();

        String actualResult = webTablePage.getTableAge(emailValue);
        Assert.assertEquals(actualResult, ageValue, "\n"+actualResult+" is not equal to "+ageValue+"\n");
    }
}
