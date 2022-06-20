package pomtests;

import org.testng.Assert;
import org.testng.annotations.*;

public class SmokeTests extends BaseTest {


    @Test(testName = "user successfully logs in")
    public void loginTest() throws InterruptedException {
        driver.get("http://training.skillo-bg.com/");
        defaultPage.clickLoginButton();
        loginModal.enterUsername("test51");
        loginModal.enterPassword("test51");
        loginModal.clickSignIn();

        //the assertion is in the test itself
        Assert.assertTrue(homePage.isUserLoggedIn());

        Thread.sleep(1000);
    }

    @Test
    public void likePostTest() throws InterruptedException {
        driver.get("http://training.skillo-bg.com/");
        loginTest();
      /*  defaultPage.clickLoginButton();
        loginModal.enterUsername("test91");
        loginModal.enterPassword("test91");
        loginModal.clickSignIn();*/
        homePage.clickPostImage();
        postModal.clickHeartIcon();

        Assert.assertTrue(postModal.IsHeartIconClicked());

        Thread.sleep(1000);
    }

    @Test
    public void createAccount(){
        driver.get("http://training.skillo-bg.com/");
        defaultPage.clickLoginButton();
        loginModal.clickRegisterButton();
        signUpModal.registerUser();
        //same assert as on Login from HomePage PO
        Assert.assertTrue(homePage.isNewPostButtonDisplayed());

    }

    @Test
    public void logoutTest(){
        //logout functionality from every place
        //click the home button
        //click the logout button
    }
}
