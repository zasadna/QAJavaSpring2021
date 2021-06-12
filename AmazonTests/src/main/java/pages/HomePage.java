package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//*[@id='searchDropdownBox']/option")
    private WebElement categoriesDropdown;

    @FindBy(xpath = "//*[@id='searchDropdownBox']/option[contains(text(),'Books')]")
    private WebElement booksCategoriesDropdown;

    @FindBy(xpath = "//div/span[contains(text(),'Sign in')]")
    private WebElement signInButton;

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    private WebElement searchField;

    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    private WebElement searchButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void isCategoriesDropdownVisible() {
        categoriesDropdown.isDisplayed();
    }

    public void clickCategoriesDropdown() {
        categoriesDropdown.click();
    }

    public void clickBooksCategoriesDropdown() {
        booksCategoriesDropdown.click();
    }

    public void isSignInButtonVisible() {
        signInButton.isDisplayed();
    }

    public void clickSignInButton() {
        signInButton.click();
    }

    public void openHomePage(String url) {
        driver.get(url);
    }

  /*
    public void clickSignInPopupCloseButton() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", signInPopupCloseButton);
    }
*/

    public void isSearchFieldVisible() {
        searchField.isDisplayed();
    }

    public void enterTextToSearchField(final String searchText) {
        searchField.clear();
        searchField.sendKeys(searchText);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

}
