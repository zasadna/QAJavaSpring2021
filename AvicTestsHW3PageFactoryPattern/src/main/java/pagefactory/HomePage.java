package pagefactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(xpath = "//div[contains(@class,'header')]//a[contains(@href, 'kontaktyi')]")
    private WebElement contacts;

    @FindBy(xpath = "//input[@id='input_search']")
    private WebElement searchInput;

    @FindBy(xpath = "//span[@class='sidebar-item']")
    private WebElement productCatalogButton;

    @FindBy(xpath = "//ul[contains(@class,'sidebar-list')]//a[contains(@href, 'telefonyi-i-aksessuaryi')]")
    private WebElement smartphonesAndPhonesButton;

    @FindBy(xpath = "//ul[contains(@class,'sidebar-list')]//a[contains(@href, 'ua/umnyij-dom')]")
    private WebElement smartHouseButton;

    @FindBy(xpath = "//div[@class='brand-box__title']/a[contains(@href,'smartfonyi')]")
    private WebElement smartphonesButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickContacts() {
        contacts.click();
    }

    public void clickOnProductCatalogButton() {
        productCatalogButton.click();
    }

    public void clickOnSmartphonesAndPhonesButton() {
        smartphonesAndPhonesButton.click();
    }

    public void clickOnSmartHouseButton() {
        smartHouseButton.click();
    }

    public void clickOnSmartphonesButton() {
        smartphonesButton.click();
    }

    public void searchByKeyword(final String keyword) {
        searchInput.clear();
        searchInput.sendKeys(keyword, Keys.ENTER);
    }
}
