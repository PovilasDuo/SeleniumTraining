package part2.PageObjectModel;

import org.openqa.selenium.By;

//Page Object Model
public class LoginPage extends BasePage {

    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.cssSelector("#login_button_container h3");

    public void setUsername(String username) {
        set(usernameField, username);
    }

    public void setPassword(String password) {
        set(passwordField, password);
    }

    //This is known as a transition method
    //Should never have void type for click methods
    public ProductsPage clickLoginButton() {
        click(loginButton);
        return new ProductsPage();
    }

    //This is known as a convenience method
    public ProductsPage logIntoApplication (String username, String password) {
        setUsername(username);
        setPassword(password);
        return  clickLoginButton();
    }

    public String getErrorMessage() {
        return find(errorMessage).getText();
    }
}
