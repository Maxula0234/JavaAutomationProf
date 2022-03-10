package bspb_tests;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class HomePageTest extends BaseTest {

    @Test
    public void openHomePage() {
        homePage.openHomePage();
        homePage.buttonDeposits.isDisplayed();
        homePage.bussines.isDisplayed();
        homePage.buttonCredits.isDisplayed();
        homePage.buttonCards.isDisplayed();
    }

    @Test
    @DisplayName("Перейти с главной на вкладку 'Инвесторы'")
    public void goToInvestors() {
        homePage.openHomePage();
        assertThat(homePage.investors.isDisplayed());
        homePage.investors.click();
        investorsPage.reportAndPresentation.isDisplayed();
    }

    @Test
    @DisplayName("Переход с главной на поиск")
    public void goToSearch() {
        homePage.openHomePage();
        homePage.buttonSearch.isDisplayed();
        homePage.buttonSearch.click();
        searchPage.textField.isDisplayed();
        reporter.info("Успешно перешли на страницу поиска");

    }
}
