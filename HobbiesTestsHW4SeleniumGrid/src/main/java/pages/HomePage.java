package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {

    @FindBy(xpath = "//*[@id=\"apus-header\"]//input[contains(@class,'tt-input')]")
    private WebElement searchInput;

    @FindBy(xpath = "//button[contains(text(),'Найти')]")
    private WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"vertical-menu\"]/li/a[contains(text(),'Авторские схемы')]")
    private WebElement authorsSchemesCategory;

    @FindBy(xpath = "//ul[@role='tablist']/li/a[contains(text(),'Новые товары')]")
    private WebElement newGoods;

    @FindBy(xpath = "//ul[@role='tablist']/li/a[contains(text(),'Скидки')]")
    private WebElement discounts;

    @FindBy(xpath = "//ul[@role='tablist']/li/a[contains(text(),'Лучшие товары')]")
    private WebElement theBestGoods;

    @FindBy(xpath = "//div[@class='tab-pane active']//div[@class='slick-track']/div")
    private List<WebElement> discountsList;

    @FindBy(xpath = "//div[@class='tab-pane active']//a[contains(text(),'Узор с кругами')]")
    private WebElement patternWithCirclesProductName;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchByKeyword(final String keyword) {
        searchInput.clear();
        searchInput.sendKeys(keyword);
     //   searchInput.sendKeys(keyword, Keys.ENTER);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void clickAuthorsSchemesCategory() {
        authorsSchemesCategory.click();
    }

    public boolean isNewGoods() {
        return newGoods.isDisplayed();
    }
    public void clickNewGoods() {
        newGoods.click();
    }

    public boolean isDiscounts() {
        return discounts.isDisplayed();
    }
    public void clickDiscounts() {
        discounts.click();
    }

    public boolean isTheBestGoods() {
        return theBestGoods.isDisplayed();
    }
    public void clickTheBestGoods() {
        theBestGoods.click();
    }

    public List<WebElement> getDiscountsList() {
        return discountsList;
    }

    public WebElement getPatternWithCirclesProductName() {
        return patternWithCirclesProductName;
    }
}
