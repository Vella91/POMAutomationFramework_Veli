package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreatePostPage extends BasePage {

    public CreatePostPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="create-post")
    WebElement submitPostButton;

    @FindBy(xpath = "//label[@for='customSwitch2']")
    WebElement postTypeToggle;

    public WebElement getPostSubmissionFailedAlertMessage() {
        return postSubmissionFailedAlertMessage;
    }

    @FindBy(xpath = "//div[@id='toast-container']/*")
    WebElement postSubmissionFailedAlertMessage;

    public void clickPostTypeToggle(){
        postTypeToggle.click();
    }

    public void clickSubmitPostButton(){
        submitPostButton.click();
    }
}
