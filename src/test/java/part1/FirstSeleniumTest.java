package part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstSeleniumTest {

    WebDriver driver;

    @BeforeClass //runs before the class is compiled. Used for setUp methods to set up the test/class
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterClass //helps clean up the test and works like a POST condition
    public void tearDown() {
        //driver.quit(); //Closes and quits everything
        //driver.close(); //Only closes the current window
    }

    @Test
    public void testLoggingIntoApplication() throws InterruptedException {
        Thread.sleep(2000);
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Admin"); //sends information/types

        var password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        driver.findElement(By.tagName("button")).click();
        ////Test logic above/Test validation, assertion, below
        Thread.sleep(2000); //Not recommended because it is a hard stop/ Used only for demonstration purposes

        String actualResult = driver.findElement(By.tagName("h6")).getText();
        String expectedResult = "Dashboard";

        Assert.assertEquals(actualResult, expectedResult);
    }
}
