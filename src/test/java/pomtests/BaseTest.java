package pomtests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.time.Duration;

public class BaseTest {

        WebDriver driver;
        DefaultPage defaultPage;
        LoginModal loginModal;
        HomePage homePage;
        PostModal postModal;
        SignUpModal signUpModal;
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
            signUpModal = new SignUpModal(driver);
        }

        @AfterMethod
        public void tearDown() {
            driver.quit();
        }

    }
