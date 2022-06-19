package pomtests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.DefaultPage;
import pages.LoginModal;

import java.time.Duration;

public class BaseTests {

    WebDriver driver;
    DefaultPage defaultPage;
    LoginModal loginModal;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        defaultPage = new DefaultPage(driver);
        loginModal = new LoginModal(driver);

    }

    @AfterTest
    public void tearDown() {

    }

    @Test
    public void loginTest() throws InterruptedException {
        driver.get("http://training.skillo-bg.org");
        defaultPage.clickLoginButton();
        loginModal.enterUsername("test51");
        loginModal.enterPassword("test51");
        loginModal.clickSignIn();

        Thread.sleep(1000);
    }
}
