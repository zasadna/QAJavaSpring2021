package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends BasePage {

    @FindBy(xpath = "//div[contains(@class, 'sg-col-4-of-12 s-result-item')]")
    private List<WebElement> listGoods;

    @FindBy(xpath = "//*[@id='p_89/Razer']//a")
    private WebElement brandFilterOptions;

    @FindBy(xpath = "//input[@name='low-price']")
    private WebElement minPriceFilterOptions;

    @FindBy(xpath = "//input[@name='high-price']")
    private WebElement maxPriceFilterOptions;

    @FindBy(xpath = "//input[@class='a-button-input']")
    private WebElement goFilterOptions;

    @FindBy(xpath = "//a[contains(text(),'Add to List')]")
    private WebElement addToListButton;

    @FindBy(xpath = "//div[contains(@class, 'a-section a-spacing-medium')]//h2/a")
    private List<WebElement> listGoodsAfterSearching;

    @FindBy(xpath = "//a/span[contains(text(),'Art')]")
    private List<WebElement> listAtrBooks;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public void clickFirstItemOfListGoods() {
        listGoods.get(0).click();
    }

    public void clickFirstItemOfListGoodsAfterSearching() {
        listGoodsAfterSearching.get(0).click();
    }

    public void clickBrandFilterOptions() {
        brandFilterOptions.click();
    }

    public void setMinPriceFilterOptions(final String minPrice) {
        minPriceFilterOptions.sendKeys(minPrice);
    }

    public void setMaxPriceFilterOptions(final String maxPrice) {
        maxPriceFilterOptions.sendKeys(maxPrice);
    }

    public void clickGoFilterOptions() {
        goFilterOptions.click();
    }

    public void clickAddToListButton() {
        addToListButton.click();
    }

    public String getFirstOfListAtrBooks() {
        return listAtrBooks.get(0).getText();
    }

    public String findWord(String text, String word){
        String[] tokens = text.split(" ");
        for(String s:tokens){
            if (word.equals(s)) {
                return word;
            }
        }
        return "not find";
    }




}
