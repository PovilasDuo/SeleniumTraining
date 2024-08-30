package part2.tests.tests.products;

import static org.testng.Assert.*;
import org.testng.annotations.Test;
import com.saucedemo.pages.ProductsPage;
import part2.tests.base.BaseTest;

public class ProductsTest extends BaseTest {

    @Test
    public void testProductHeaderIsDisplayed() {
        ProductsPage productsPage =
                loginPage.logIntoApplication("standard_user", "secret_sauce");

        assertTrue(productsPage.isProductsHeaderDisplayed(), "\n Products Header is not displayed \n");
    }
}
