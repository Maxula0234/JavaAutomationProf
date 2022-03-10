package pages.bspb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

public class HomePage extends BasePage {
    private String URL = "https://bspb.ru/";

    public HomePage(WebDriverWait webDriverWait, WebDriver webDriver) {
        super(webDriverWait, webDriver);
    }

    @FindBy(xpath = "//div[@class='primary']")
    public WebElement header;

    @FindBy(xpath = "//a[@href='/investors']")
    public WebElement investors;

    @FindBy(xpath = "//div[@class]//a[@href='/business']")
    public WebElement bussines;

    @FindBy(xpath = "//a[@data-hover='dropdown']//span[text()='Кредиты']")
    public WebElement buttonCredits;

    @FindBy(xpath = "//a[@data-hover='dropdown']//span[text()='Карты']")
    public WebElement buttonCards;

    @FindBy(xpath = "//a[@data-hover='dropdown']//span[text()='Вклады']")
    public WebElement buttonDeposits;

    @FindBy(xpath = "//a[@href='/search']")
    public WebElement buttonSearch;

    public void clickButtonCredit() {
        buttonCredits.click();
    }

    public void openHomePage() {
        openPage(URL);
    }

    public void clickToBussines() {
        bussines.click();
    }

    public void clickToButtonCredits() {
        buttonCredits.click();
    }

    public void clickToButtonCards() {
        buttonCards.click();
        ;

    }

    public void clickToButtonDeposits() {
        buttonDeposits.click();
    }
}
