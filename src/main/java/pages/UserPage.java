package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPage extends BasePage {

    public UserPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='btn-group btn-group-toggle post-filter-buttons']")
    WebElement postStatusButtonsContainer;

    @FindBy(xpath= "//button[@class='btn btn-primary profile-edit-btn ng-star-inserted']")
    WebElement followButton;

    @FindBy(xpath = " //*[text()='Unfollow']")
    WebElement unfollowButton;

    public void clickFollowButton(){
        followButton.click();
    }

    public boolean isUnfollowButtonDisplayed(){
        return unfollowButton.isDisplayed();
    }
}
