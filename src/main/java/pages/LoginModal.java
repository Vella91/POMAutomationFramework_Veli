package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*default page is opened after the URL is hit*/
public class LoginModal {

    WebDriver driver;

    //constructor -> so we can create the page in our tests
    public LoginModal(WebDriver driver) {
        this.driver = driver;
    }

    //locators -> on the page that we are going to use in our tests, you can add locators that might be for future tests
        By userNameField = By.id("defaultLoginFormUsername");
        By passwordField = By.id("defaultLoginFormPassword");
        By signInButton = By.id("sign-in-button");
        By registerButton = By.linkText("Register");


    //methods that interact with the web element
    public void enterUsername(String username){
        driver.findElement(userNameField).clear();
        driver.findElement(userNameField).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickSignIn(){
        driver.findElement(signInButton).click();
    }

    public void clickRegisterButton() {
        driver.findElement(registerButton).click();
    }
}
