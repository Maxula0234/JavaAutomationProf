package bspb_tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

public class SearchPageTest extends BaseTest {

    @Test
    @DisplayName("Поиск и нажатие enter")
    public void searchAndClickEnter() {
        homePage.openHomePage();
        homePage.buttonSearch.click();
        searchPage.textField.sendKeys("Ставки", Keys.ENTER);
    }
}
