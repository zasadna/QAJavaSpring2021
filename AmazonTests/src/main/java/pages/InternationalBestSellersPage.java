package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class InternationalBestSellersPage extends BasePage{

    @FindBy(xpath = "//li/a[contains(text(),'Luggage')]")
    private WebElement luggageDepartments;

    @FindBy(xpath = "//li/a[contains(text(),'Luggage Sets')]")
    private WebElement luggageSetsDepartments;

    @FindBy(xpath = "//div[contains(@class, 'sg-col-4-of-12 s-result-item')]")
    private List<WebElement> listLuggage;

    @FindBy(xpath = "//h1[@id='title']")
    private WebElement luggageTitle;

    public InternationalBestSellersPage(WebDriver driver) {
        super(driver);
    }

    public void clickLuggageDepartments() {
        luggageDepartments.click();
    }

    public void clickLuggageSetsDepartments() {
        luggageSetsDepartments.click();
    }

    public void clickFirstItemOfListGoods() {
        listLuggage.get(0).click();
    }

    public String getLuggageTitle() {
        return luggageTitle.getText();
    }

    public String findWord(String text, String word){
        String[] tokens = text.split(" ");
        for(String s:tokens){
            if (word.equals(s)) {
                return word;
            }
        }
        return "not found";
    }
}
