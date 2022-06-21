package pomtests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.*;

public class SmokeTests extends BaseTest {


    @Test(testName = "user successfully logs in")
    public void loginTest() throws InterruptedException {
        driver.get("http://training.skillo-bg.com/");
        defaultPage.clickLoginButton();
        loginModal.enterUsername("test91");
        loginModal.enterPassword("test91");
        loginModal.clickSignIn();
        wait.until(ExpectedConditions.visibilityOf(homePage.getAlertPopUpHomePage()));

        //the assertion is in the test itself
        Assert.assertTrue(homePage.isUserLoggedIn());
    }

    @Test(testName = "user successfully logs in")
    public void loginTestEndToEnd() throws InterruptedException {
        driver.get("http://training.skillo-bg.com/");
        defaultPage.clickLoginButton();
        loginModal.enterUsername("test91");
        loginModal.enterPassword("test91");
        loginModal.clickSignIn();
        wait.until(ExpectedConditions.visibilityOf(homePage.getAlertPopUpHomePage()));

        //the assertion is in the test itself
        Assert.assertTrue(homePage.isUserLoggedIn());
        logoutTest();
    }

    //keeps failing
    @Test
    public void likePostTest() throws InterruptedException {
        driver.get("http://training.skillo-bg.com/");
        loginTest();
        homePage.clickPostImage();
/*
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='icons-container']/i[@class='like far fa-heart fa-2x']"))));
*/
        postModal.clickHeartIcon();

        wait.until(ExpectedConditions.visibilityOf(postModal.getPostModalFilledHeartIcon()));
        Assert.assertTrue(postModal.IsPostLiked());
        logoutTest();
    }

    @Test(retryAnalyzer = utils.Retry.class)
    public void createAccount(){
        driver.get("http://training.skillo-bg.com/");
        defaultPage.clickLoginButton();
        loginModal.clickRegisterButton();
        signUpModal.registerUser();
        //same assert as on Login from HomePage PO
        Assert.assertTrue(homePage.isNewPostButtonDisplayed());
        logoutTest();
    }

    @Test
    public void viewUserPageAndFollowUser() throws InterruptedException {
        driver.get("http://training.skillo-bg.com/");
        loginTest();
        homePage.clickPostAuthorHyperlink();
        userPage.clickFollowButton();
        Assert.assertTrue(userPage.isUnfollowButtonDisplayed());
        logoutTest();
    }


    //normally not part of Smoke tests but just for the exercise
    @Test
    public void createNewPostFailing() throws InterruptedException {
        driver.get("http://training.skillo-bg.com/");
        loginTest();
        homePage.clickNewPostButton();
        createPostPage.clickPostTypeToggle();
        createPostPage.clickSubmitPostButton();
        wait.until(ExpectedConditions.visibilityOf(createPostPage.getPostSubmissionFailedAlertMessage()));
        logoutTest();
    }


    @Test
    public void logoutTest(){
        //click home button from any page???
        homePage.clickLogoutButton();
        wait.until(ExpectedConditions.visibilityOf(defaultPage.getAlertPopUp()));

        //logout functionality from every place
        //click the home button
        //click the logout button
    }
}
