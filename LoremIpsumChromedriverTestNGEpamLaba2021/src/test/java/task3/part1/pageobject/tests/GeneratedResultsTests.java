package task3.part1.pageobject.tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class GeneratedResultsTests extends BaseTest{
    private String SEARCH_KEYWORD = "рыба";

    @Test(priority = 1)
    public void checkThatWordContainsCorrectlyInTheFirstParagraph() {
        getHomePage().clickOnRuLanguage();
        getGeneratedResultsPage().getTextFish();
        assertTrue((getGeneratedResultsPage().getTextFish()).contains(SEARCH_KEYWORD), "Current test word " + SEARCH_KEYWORD + " doesn't contain in the first paragraph");
    }



}
