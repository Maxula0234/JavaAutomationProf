package bspb_tests;

import Constant.WebDriverName;
import com.google.common.io.Resources;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.WebDriverFactory;
import pages.bspb.HomePage;
import pages.bspb.InvestorsPage;
import pages.bspb.SearchPage;

import java.time.Duration;
import java.util.logging.Logger;

public class BaseTest {
    public Logger reporter = Logger.getLogger("reporter");
    private final String URL = "https://www.bspb.ru/";

    public WebDriver driver;
    public WebDriverWait webDriverWait;

    public HomePage homePage;
    public InvestorsPage investorsPage;
    public SearchPage searchPage;

    @BeforeAll
    public static void setChromDriver() {
        System.setProperty("webdriver.chrome.driver", Resources.getResource("chromedriver.exe").getPath());
    }

    @BeforeEach
    public void setDriver() {
        this.driver = WebDriverFactory.getWebDriver(WebDriverName.CHROME);
        driver.manage().window().maximize();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        homePage = new HomePage(webDriverWait, driver);
        investorsPage = new InvestorsPage(webDriverWait, driver);
        searchPage = new SearchPage(webDriverWait, driver);
    }

    @AfterEach
    public void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
