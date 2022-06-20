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

    public void inputUsername(String username){
        usernameField.sendKeys(username);
    }

    public void inputEmail(String email){
        emailField.sendKeys(email);
    }
    public void inputPassword(String password){
        passwordField.sendKeys(password);
    }
    public void inputConfirmPassword(String confirmPassword){
        confirmPasswordField.sendKeys(confirmPassword);
    }
    public void clickSignUpButton(){
        signUpbutton.click();
    }

    public void registerUser(){
        inputUsername("testvell");
        inputEmail("testvel@yopmail.com");
        inputPassword("testvell");
        inputConfirmPassword("testvell");
        clickSignUpButton();
    }
}
