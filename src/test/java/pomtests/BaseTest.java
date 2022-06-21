package pomtests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.*;
import utils.Screenshot;

import java.time.Duration;

public class BaseTest {

        WebDriver driver;
        DefaultPage defaultPage;
        LoginModal loginModal;
        HomePage homePage;
        PostModal postModal;
        SignUpModal signUpModal;
        UserPage userPage;
        CreatePostPage createPostPage;
        WebDriverWait wait;

        @BeforeMethod
        public void setUp() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            //if we change the implicitWait duration to millisecond and small value
            // we make the test flaky to test RETRY logic
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            defaultPage = new DefaultPage(driver);
            loginModal = new LoginModal(driver);
            homePage = new HomePage(driver);
            postModal = new PostModal(driver);
            signUpModal = new SignUpModal(driver);
            createPostPage = new CreatePostPage(driver);
            userPage = new UserPage(driver);
        }

        @AfterMethod
        public void tearDown(ITestResult result)
        {
            if (!result.isSuccess()){
                Screenshot.capture(driver, "screenshots", result.getName());
            }
            driver.quit();
        }

    }
