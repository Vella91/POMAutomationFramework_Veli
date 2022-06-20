package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpModal extends BasePage {

    public SignUpModal(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//input[@formcontrolname='username']")
    WebElement usernameField;

    @FindBy(xpath="//input[@formcontrolname='email']")
    WebElement emailField;

    @FindBy(xpath="//input[@formcontrolname='password']")
    WebElement passwordField;

    @FindBy(xpath="//input[@formcontrolname='confirmPassword']")
    WebElement confirmPasswordField;

    @FindBy(id="sign-in-button")
    WebElement signUpbutton;

    public void inputUsername(){
        usernameField.sendKeys("testVel");
    }

    public void inputEmail(){
        emailField.sendKeys("vel@yopmail.com");
    }
    public void inputPassword(){
        passwordField.sendKeys("testVel");
    }
    public void inputConfirmPassword(){
        confirmPasswordField.sendKeys("testVel");
    }
    public void clickSignUpButton(){
        signUpbutton.click();
    }

    public void registerUser(){
        inputUsername();
        inputEmail();
        inputPassword();
        inputConfirmPassword();
        clickSignUpButton();
    }
}
