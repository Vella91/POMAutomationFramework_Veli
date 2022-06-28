package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PostModal extends BasePage {

    public PostModal(WebDriver driver) {
       super(driver);
    }

    @FindBy(xpath = "//div[@class='icons-container']/i[@class='like far fa-heart fa-2x']")
    WebElement postModalHeartIcon;

    @FindBy(xpath = "//i[@class='ml-4 far fa-thumbs-down fa-2x']")
    WebElement postModalDislikeIcon;

    @FindBy(xpath = "//div[@class='icons-container']/i[@class='like far fa-heart fa-2x liked']")
    WebElement postModalFilledHeartIcon;

    public WebElement getPostModalFilledHeartIcon() {
        return postModalFilledHeartIcon;
    }

    public void clickHeartIcon(){
        postModalHeartIcon.click();
    }

    public void clickDislikeIcon(){
        postModalDislikeIcon.click();
    }

    //assertion methods
    public boolean IsPostLiked(){
        return postModalFilledHeartIcon.isDisplayed();
    }
}
