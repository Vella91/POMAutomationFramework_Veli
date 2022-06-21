package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * parent page for common logic of all pages
 */
public class BasePage {
    WebDriver driver;
    Actions actions;
    JavascriptExecutor executor;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
        this.executor = (JavascriptExecutor)driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@id='nav-link-home']")
    WebElement homeButton;

    public void clickHomeButton(){
        homeButton.click();
    }
}