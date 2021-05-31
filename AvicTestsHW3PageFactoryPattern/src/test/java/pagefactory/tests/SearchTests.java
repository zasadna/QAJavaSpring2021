package pagefactory.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class SearchTests extends BaseTest {
    private String SEARCH_WORD = "Asus";
    private String EXPECTED_SEARCH_RESULT_WORDS = "Уведомить о наличии";
    private int actualElementsSize = 12;
    private String SEARCH_WORD_FROM_SMARTHOUSE_MIN_PRICE_FILTER = "123";
    private String SEARCH_WORD_FROM_SMARTHOUSE_MAX_PRICE_FILTER = "321";
    private String CITY = "Киев";

    @Test(priority = 1)
    public void checkSmartfonyiAmountOnSearchSecondPage() {
        getHomePage().clickOnProductCatalogButton();
        getHomePage().clickOnSmartphonesAndPhonesButton();
        getHomePage().clickOnSmartphonesButton();
        getHomePage().implicitWait(50);
        assertEquals(getSearchResultsPage().getSearchResultsCount(), actualElementsSize);
    }

    @Test(priority = 2)
    public void checkSmartfonesAmountOnSearchPage() {
        getHomePage().searchByKeyword(SEARCH_WORD);
        getHomePage().implicitWait(30);
        getSearchResultsPage().clickOnSortSelect();
        getSearchResultsPage().clickOnSortSelectByGrow();
        getSearchResultsPage().implicitWait(30);
        assertEquals(getSearchResultsPage().getSearchResultsListShowAvailable().get(0).getText(), EXPECTED_SEARCH_RESULT_WORDS);
    }

    @Test(priority = 3)
    public void checkLeftFilterByPrice() {
        getHomePage().clickOnProductCatalogButton();
        getHomePage().clickOnSmartHouseButton();
        getHomePage().waitForPageLoadComplete(50);
        getSmartHousePage().setMinSearchInputOnSmartHousePage(SEARCH_WORD_FROM_SMARTHOUSE_MIN_PRICE_FILTER);
        getSmartHousePage().setMaxSearchInputOnSmartHousePage(SEARCH_WORD_FROM_SMARTHOUSE_MAX_PRICE_FILTER);
        getSmartHousePage().implicitWait(50);
        getSmartHousePage().clickOnShowFilterButton();
        getHomePage().implicitWait(50);
        if (getSmartHousePage().getSearchResultsProductsByPrice().size() != 0) {
            boolean res = getPrice(SEARCH_WORD_FROM_SMARTHOUSE_MIN_PRICE_FILTER, SEARCH_WORD_FROM_SMARTHOUSE_MAX_PRICE_FILTER, getSmartHousePage().getSearchResultsProductsByPrice());
            Assert.assertEquals(res, true);
        }
    }

    private boolean getPrice(String minPriceFilter, String maxPriceFilter, List<WebElement> elementsList3) {
        boolean value = false;
        for (int i = 0; i < elementsList3.size(); i++) {
            String currentPrice = elementsList3.get(i).getText();
            int valueCurrentPrice = Integer.parseInt(currentPrice.replaceAll("[^0-9]", ""));
            if (valueCurrentPrice > Integer.parseInt(minPriceFilter) & valueCurrentPrice < Integer.parseInt(maxPriceFilter)) {
                value = true;
            } else {
                value = false;
            }
        }
        return value;
    }

    @Test(priority = 4)
    public void checkCity() {
        getHomePage().clickContacts();
        Assert.assertEquals(getContactPage().getCityKyiv(), CITY);
    }
}
