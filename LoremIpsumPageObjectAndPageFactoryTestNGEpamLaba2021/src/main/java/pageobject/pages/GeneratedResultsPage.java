package pageobject.pages;

import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.By.xpath;

public class GeneratedResultsPage extends BasePage{
    private static final String SEARCH_WORD_FISH = "//*[@id='Panes']//p[contains(text(),'рыба')]";
    private static final String LIST_PARAGRAPHS_RESULT = "//div[@id='lipsum']/p";
    private static final String SITE_RESULT = "//div[@id='generated']";

    public GeneratedResultsPage(WebDriver driver) {
        super(driver);
    }

    public String getTextFish() {
        return driver.findElement(xpath(SEARCH_WORD_FISH)).getText();
    }
}
