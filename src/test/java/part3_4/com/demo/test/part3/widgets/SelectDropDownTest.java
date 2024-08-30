package part3_4.com.demo.test.part3.widgets;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demo.base.BaseTest;

import java.util.List;

public class SelectDropDownTest extends BaseTest {

    @Test
    public void testMultiSelectDropDown() {
        var selectMenuPage = homePage.goToWidgets().clickSelectMenu();
        selectMenuPage.SelectStandardMulti("Volvo");
        selectMenuPage.SelectStandardMulti(1);
        selectMenuPage.SelectStandardMulti("Audi");
        selectMenuPage.SelectStandardMulti(2);

        selectMenuPage.DeselectStandardMulti("saab");
        List<String> actualSelectedOptioons = selectMenuPage.getAllSelectedStandardMultiOptions();

        Assert.assertTrue(actualSelectedOptioons.contains("Volvo"));
        Assert.assertTrue(actualSelectedOptioons.contains("Saab"),"Saab is selected as an option");
        Assert.assertFalse(actualSelectedOptioons.contains("Opel"));
        Assert.assertTrue(actualSelectedOptioons.contains("Audi"));
    }
}
