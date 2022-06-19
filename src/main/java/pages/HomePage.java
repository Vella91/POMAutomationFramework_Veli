package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//the page that the user is on after logged in

public class HomePage {

    WebDriver driver;


    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //locators using PageFactory - we can add as many locators as we want
    @FindBy(id="nav-link-new-post")
    WebElement newPostButton;

    @FindBy(xpath = "//i[contains(@class, 'sign-out')]")
    WebElement logoutButton;

    //methods

    //assertion methods
    public boolean isNewPostButtonDisplayed(){
        return newPostButton.isDisplayed();
    }

    public boolean isUserLoggedIn(){
        return newPostButton.isDisplayed() && logoutButton.isDisplayed();
    }
}
