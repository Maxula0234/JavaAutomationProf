package pages.bspb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

public class InvestorsPage extends BasePage {
    private final String URL = "https://www.bspb.ru/investors/";

    public InvestorsPage(WebDriverWait webDriverWait, WebDriver webDriver) {
        super(webDriverWait, webDriver);
    }

    @FindBy(xpath = "//h1[normalize-space(text())='Инвесторам']")
    public WebElement title;

    @FindBy(xpath = "//a[@data-hover='dropdown']//span[text()='Отчетность и презентации']")
    public WebElement reportAndPresentation;

    @FindBy(xpath = "//a[@data-hover='dropdown']//span[text()='ИНФОРМАЦИЯ ДЛЯ АКЦИОНЕРОВ']")
    public WebElement infoForInvestors;

}
