package pomtests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.DefaultPage;

import java.time.Duration;

public class BaseTests {

    WebDriver driver;
    DefaultPage defaultPage;

    @BeforeTest
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        defaultPage = new DefaultPage(driver);

    }

    @AfterTest
    public void tearDown(){

    }

    @Test
    public void loginTest() throws InterruptedException {
        driver.get("http://training.skillo-bg.org");
        defaultPage.clickLoginButton();

        Thread.sleep(1000);
    }
}
