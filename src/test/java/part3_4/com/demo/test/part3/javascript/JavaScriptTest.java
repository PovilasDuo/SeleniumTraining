package part3_4.com.demo.test.part3.javascript;

import org.testng.annotations.Test;
import part3_4.com.demo.base.BaseTest;

public class JavaScriptTest extends BaseTest {

    @Test
    public void testScrollingToElement() {
        homePage.goToForms();
    }
}
