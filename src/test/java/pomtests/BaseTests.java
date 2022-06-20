package pomtests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.DefaultPage;
import pages.HomePage;
import pages.LoginModal;
import pages.PostModal;

import java.time.Duration;

public class BaseTests {

    WebDriver driver;
    DefaultPage defaultPage;
    LoginModal loginModal;
    HomePage homePage;
    PostModal postModal;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        defaultPage = new DefaultPage(driver);
        loginModal = new LoginModal(driver);
        homePage = new HomePage(driver);
        postModal = new PostModal(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


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
    public void likePost() throws InterruptedException {
        driver.get("http://training.skillo-bg.com/");
        defaultPage.clickLoginButton();
        loginModal.enterUsername("test91");
        loginModal.enterPassword("test91");
        loginModal.clickSignIn();
        homePage.clickPostImage();
        postModal.clickHeartIcon();

        Assert.assertTrue(postModal.IsHeartIconClicked());

        Thread.sleep(1000);
    }
}
