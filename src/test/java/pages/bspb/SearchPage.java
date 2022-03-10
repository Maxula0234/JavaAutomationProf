package pages.bspb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

public class SearchPage extends BasePage {
    private final String URL = "https://www.bspb.ru/search";

    public SearchPage(WebDriverWait webDriverWait, WebDriver webDriver) {
        super(webDriverWait, webDriver);
    }

    @FindBy(xpath = "//input[@type='text']")
    public WebElement textField;

    @FindBy(xpath = "//button[@class='btn btn-primary icon-search-object']")
    public WebElement buttonSearch;

}
