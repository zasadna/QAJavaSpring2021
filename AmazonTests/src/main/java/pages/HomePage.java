package pages;

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

    @FindBy(xpath = "//div[@id='desktop-1']//a[contains(text(),'Shop now')]")
    private WebElement shopNowFromAmazonTopSellers;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean isCategoriesDropdownVisible() {
        return categoriesDropdown.isDisplayed();
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

    public boolean isSearchFieldVisible() {
        return searchField.isDisplayed();
    }

    public void enterTextToSearchField(final String searchText) {
        searchField.clear();
        searchField.sendKeys(searchText);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void clickShopNowFromAmazonTopSellersLink() {
        shopNowFromAmazonTopSellers.click();
    }
}
