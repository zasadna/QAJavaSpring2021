package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserStorePage extends BasePage{

    @FindBy(xpath = "//div/span[contains(text(),'Olha')]")
    private WebElement userName;

    @FindBy(xpath = "//a[contains(text(),'Buy Again')]")
    private WebElement buyAgainButton;

    @FindBy(xpath = "//div[@id='nav-xshop-container']//a/span[contains(text(),'Browsing History')]")
    private WebElement browsingHistoryButton;

    @FindBy(xpath = "//h1[contains(text(),'Your Orders')]")
    private WebElement buyAgainTitleOfPage;

    @FindBy(xpath = "//span[contains(text(),'There are no recommended items for you')]")
    private WebElement buyAgainEmptyText;

    @FindBy(xpath = "//a[@id='nav-link-accountList']")
    private WebElement accountAndListsButtonInHeader;

    @FindBy(xpath = "//a[@class='ya-card__whole-card-link']//h2[contains(text(),'Login')]")
    private WebElement loginAndSecurityBox;

    @FindBy(xpath = "//div[@class='a-row']/span[contains(text(),'Name')]")
    private WebElement userNameFromSecurityBox;

    @FindBy(xpath = "//input[@class='a-button-input'][@class='a-button-input']")
    private WebElement editButtonFromSecurityBox;

    @FindBy(xpath = "//h1[contains(text(),'Change your name')]")
    private WebElement changeNameTitle;

    @FindBy(xpath = "//input[@name='customerName']")
    private WebElement customerNameInput;

    @FindBy(xpath = "//input[@id='cnep_1C_submit_button']")
    private WebElement saveChangesButton;

    @FindBy(xpath = "//div[contains(text(),'Olha')]")
    private WebElement currentName;

    @FindBy(xpath = "//span[@id='a-autoid-2']/span/input")
    private WebElement moreLikeThisSecondButton;

    @FindBy(xpath = "//div[@class='mlt-top']")
    private WebElement similarPopup;

    @FindBy(xpath = "//div[@class='mlt-header']")
    private WebElement similarItemsTitleOfPage;

    public UserStorePage(WebDriver driver) {
        super(driver);
    }

    public String getUserName() {
        return userName.getText();
    }

    public void clickBuyAgainButton() {
        buyAgainButton.click();
    }

    public void clickBrowsingHistoryButton() {
        browsingHistoryButton.click();
    }

    public boolean isBuyAgainTitleOfPageVisible() {
        return buyAgainTitleOfPage.isDisplayed();
    }

    public String getBuyAgainEmptyText() {
        return buyAgainEmptyText.getText();
    }

    public void clickAccountAndListsButtonInHeader() {
        accountAndListsButtonInHeader.click();
    }

    public void clickLoginAndSecurity() {
        loginAndSecurityBox.click();
    }

    public boolean isUserNameFromSecurityBoxVisible() {
        return userNameFromSecurityBox.isDisplayed();
    }

    public void clickEditButtonFromSecurityBox() {
        editButtonFromSecurityBox.click();
    }

    public WebElement getEditButtonFromSecurityBox() {
        return editButtonFromSecurityBox;
    }

    public String getChangeNameTitle() {
        return changeNameTitle.getText();
    }

    public void setCustomerNameInput(final String newName) {
        customerNameInput.clear();
        customerNameInput.sendKeys(newName);
    }

    public void clickSaveChangesButton() {
        saveChangesButton.click();
    }

    public String getCurrentName() {
        return currentName.getText();
    }

    public void clickMoreLikeThisSecondButton() {
        moreLikeThisSecondButton.click();
    }

    public WebElement getSimilarPopup() {
        return similarPopup;
    }

    public String getSimilarItemsTitleOfPage() {
        return similarItemsTitleOfPage.getText();
    }

    public WebElement getSaveChangesButton() {
        return saveChangesButton;
    }
}
