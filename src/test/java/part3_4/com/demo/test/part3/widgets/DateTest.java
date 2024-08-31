package part3_4.com.demo.test.part3.widgets;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demo.base.BaseTest;

public class DateTest extends BaseTest {

    @Test
    public void testSelectingDate() {
        String month = "December";
        String day = "31";
        String year = "2034";

        var datePickerPage = homePage.goToWidgets().clickDatePicker();
        datePickerPage.clickSelectDateField();
        datePickerPage.selectMonth(month);
        datePickerPage.selectYear(year);
        datePickerPage.clickDay(day);

        String actualDate = datePickerPage.getDate();
        String expectedDate = "12/31/2024";
        Assert.assertEquals(actualDate, expectedDate, "The expected date and the actual date do no match");
    }
}
