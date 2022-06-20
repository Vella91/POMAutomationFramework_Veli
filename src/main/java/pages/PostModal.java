package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PostModal extends BasePage {

    public PostModal(WebDriver driver) {
       super(driver);
    }

    @FindBy(xpath = "//i[@class='like far fa-heart fa-2x']")
    WebElement postModalHeartIcon;

    @FindBy(xpath = "//i[@class='ml-4 far fa-thumbs-down fa-2x']")
    WebElement postModalDislikeIcon;

    @FindBy(xpath = "//i[@class='far fa-heart fa-2x liked']")
    WebElement postModalFilledHeartIcon;

    /*
    By postModalImage = By.xpath("//div[@class='post-modal-img']/img");
    By postModalAuthorNameHyperlink = By.xpath("//div[@class='post-modal-comments']//a[@class='post-user']");
    By postModalHeartIcon = By.xpath("//i[@class='like far fa-heart fa-2x']");
    By postModalDislikeIcon = By.xpath("//i[@class='ml-4 far fa-thumbs-down fa-2x']");*/

    public void clickHeartIcon(){
        postModalHeartIcon.click();
    }

    public void clickDislikeIcon(){
        postModalDislikeIcon.click();
    }

   /* public void clickPostAuthorNameHyperlink(){
        driver.findElement(postModalAuthorNameHyperlink).click();
    }*/


    //change the locator
    //assertion methods
    public boolean IsHeartIconClicked(){
        return postModalFilledHeartIcon.isDisplayed();
    }
}
