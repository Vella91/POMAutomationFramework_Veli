package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/*default page is opened after the URL is hit*/
public class DefaultPage {

    WebDriver driver;

    //constructor -> so we can create the page in our tests
    public DefaultPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //locators -> on the page that we are going to use in our tests, you can add locators that might be for future tests
    By loginButton = By.id("nav-ling-login");
    //methods that interact with the web element
    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }
}
