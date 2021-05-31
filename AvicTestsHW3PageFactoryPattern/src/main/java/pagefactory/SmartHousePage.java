package pagefactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SmartHousePage extends BasePage {

    @FindBy(xpath = "//input[@class='form-control form-control-min']")
    private WebElement minSearchInputOnSmartHousePage;

    @FindBy(xpath = "//input[@class='form-control form-control-max']")
    private WebElement maxSearchInputOnSmartHousePage;

    @FindBy(xpath = "//div[contains(@class,'tooltip')]//span[@class='filter-tooltip-inner']")
    private WebElement clickFilterButton;

    @FindBy(xpath = "//div[@class='prod-cart__prise-new']")
    private List<WebElement> searchResultsProductsByPrice;

    public SmartHousePage(WebDriver driver) {
        super(driver);
    }

    public void setMinSearchInputOnSmartHousePage(final String keyword) {
        minSearchInputOnSmartHousePage.clear();
        minSearchInputOnSmartHousePage.sendKeys(keyword, Keys.ENTER);
    }

    public void setMaxSearchInputOnSmartHousePage(final String keyword) {
        maxSearchInputOnSmartHousePage.clear();
        maxSearchInputOnSmartHousePage.sendKeys(keyword, Keys.ENTER);
    }

    public void clickOnShowFilterButton() {
        clickFilterButton.click();
    }

    public List<WebElement> getSearchResultsProductsByPrice() {
        return searchResultsProductsByPrice;
    }
}
