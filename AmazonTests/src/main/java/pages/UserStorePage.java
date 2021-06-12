package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserStorePage extends BasePage{

    @FindBy(xpath = "//div/span[contains(text(),'Olha')]")
    private WebElement userName;

    @FindBy(xpath = "//a[contains(text(),'Buy Again')]")
    private WebElement buyAgainButton;

    @FindBy(xpath = "//h1[contains(text(),'Your Orders')]")
    private WebElement buyAgainTitleOfPage;

    @FindBy(xpath = "//span[contains(text(),'There are no recommended items for you')]")
    private WebElement buyAgainEmptyText;

    public UserStorePage(WebDriver driver) {
        super(driver);
    }

    public String getUserName() {
        return userName.getText();
    }

    public void clickBuyAgainButton() {
        buyAgainButton.click();
    }

    public boolean isBuyAgainTitleOfPageVisible() {
        return buyAgainTitleOfPage.isDisplayed();
    }

    public String getBuyAgainEmptyText() {
        return buyAgainEmptyText.getText();
    }
}
