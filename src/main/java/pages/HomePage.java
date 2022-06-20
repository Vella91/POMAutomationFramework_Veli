package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//the page that the user is on after logged in

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    //locators using PageFactory - we can add as many locators as we want
    @FindBy(id = "nav-link-new-post")
    WebElement newPostButton;

    @FindBy(xpath = "//i[contains(@class, 'sign-out')]")
    WebElement logoutButton;

    @FindBy(xpath = "//div[@class='post-feed-img']/img[1]")
    WebElement postImage;

    @FindBy(xpath="//a[@class='post-user']")
    WebElement postAuthorHyperlink;

    //methods
    public void clickPostImage() {
        postImage.click();
    }

    public void clickPostAuthorHyperlink(){
        postAuthorHyperlink.click();
    }

    //assertion methods
    public boolean isNewPostButtonDisplayed() {
        return newPostButton.isDisplayed();
    }

    public boolean isUserLoggedIn() {
        return newPostButton.isDisplayed() && logoutButton.isDisplayed();
    }
}