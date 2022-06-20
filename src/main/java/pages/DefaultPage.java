package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*default page is opened after the URL is hit*/
public class DefaultPage extends BasePage {

    //constructor -> so we can create the page in our tests
    public DefaultPage(WebDriver driver) {
       super(driver);
    }

    //locators -> on the page that we are going to use in our tests, you can add locators that might be for future tests
    @FindBy(id = "nav-link-login")
    WebElement loginButton;


  /*  By loginButton = By.id("nav-link-login");
    By postImage = By.xpath("//div[@class='post-feed-img']/img");*/

    //methods that interact with the web element
    public void clickLoginButton(){
        loginButton.click();
    }
}
