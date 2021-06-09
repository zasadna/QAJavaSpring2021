package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SearchTests extends BaseTest{

    private static final long DEFAULT_WAITING_TIME = 350;
    private static final String SEARCH_WORD = "узор";
    private static final int EXPECTED_SEARCH_SIZE = 10;

    @Test
    public void checkAmountPatternsOnSearchPage() {
        getSearchResultsPage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().searchByKeyword(SEARCH_WORD);
        getSearchResultsPage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().clickSearchButton();
        getSearchResultsPage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getSearchResultsPage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
        assertEquals(getSearchResultsPage().getSearchResultList().size(), EXPECTED_SEARCH_SIZE);
    }
}
