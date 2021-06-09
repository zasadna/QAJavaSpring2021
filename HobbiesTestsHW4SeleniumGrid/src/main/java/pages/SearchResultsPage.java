package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends BasePage {

    @FindBy(xpath = "//div/ol/li[contains(text(),'Результат поиска')]")
    private WebElement searchResultWord;

    @FindBy(xpath = "//div[@class='products products-grid']/div[@class='row']/div")
    private List<WebElement> searchResultList;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearchResultWord() {
        return searchResultWord;
    }

    public List<WebElement> getSearchResultList() {
        return searchResultList;
    }
}
