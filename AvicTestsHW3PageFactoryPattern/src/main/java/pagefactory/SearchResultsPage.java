package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends BasePage {
    @FindBy(xpath = "//div[@class='category-top']//span[@class='select2-selection__rendered']")
    private WebElement sortSelect;

    @FindBy(xpath = "//div[@class='category-top']//*[contains(text(),'По возрастанию')]")
    private WebElement sortSelectByGrow;

    @FindBy(xpath = "//div[@class='prod-cart height']/a[text()='Уведомить о наличии']")
    private List<WebElement> searchResultsProductsListShowAvailable;

    @FindBy(xpath = "//div[@class='prod-cart__descr']")
    private List<WebElement> searchResultsProductsListText;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnSortSelect() {
        sortSelect.click();
    }

    public void clickOnSortSelectByGrow() {
        sortSelectByGrow.click();
    }

    public int getSearchResultsCount() {
        return getSearchResultsList().size();
    }

    public List<WebElement> getSearchResultsListShowAvailable() {
        return searchResultsProductsListShowAvailable;
    }

    public List<WebElement> getSearchResultsList() {
        return searchResultsProductsListText;
    }
}
