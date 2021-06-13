package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

    @FindBy(xpath = "//input[@name='submit.add-to-cart']")
    private WebElement addToCartButton;

    @FindBy(xpath = "//form[@id='attach-view-cart-button-form']//input")
    private WebElement cartButtonFromPopup;

    @FindBy(xpath = "//span[@id='attach-sidesheet-view-cart-button']")
    private WebElement leftCartPopup;

    @FindBy(xpath = "//span[@id='wishListMainButton']//input[@name='submit.add-to-registry.wishlist']")
    private WebElement addToListButtonAfterSignIn;

    @FindBy(xpath = "//h4[@class='a-popover-header-content']")
    private WebElement wishListPopupWithItem;

    @FindBy(xpath = "//span[@id='WLHUC_result_action_add']")
    private WebElement resultActionAddToList;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public boolean isAddToCartButtonVisible() {
        return addToCartButton.isDisplayed();
    }

    public void clickAddToCartButton() {
        addToCartButton.click();
    }

    public boolean isCartButtonFromPopupVisible() {
        return cartButtonFromPopup.isDisplayed();
    }

    public void clickCartButtonFromPopup() {
        cartButtonFromPopup.click();
    }

    public boolean isLeftCartPopupVisible() {
        return leftCartPopup.isDisplayed();
    }

    public WebElement getLeftCartPopup() {
        return leftCartPopup;
    }

    public void clickAddToListButtonAfterSignIn() {
        addToListButtonAfterSignIn.click();
    }

    public WebElement getWishListPopupWithItem() {
        return wishListPopupWithItem;
    }

    public boolean isWishListPopupWithItemVisible() {
        return wishListPopupWithItem.isDisplayed();
    }

    public WebElement getResultActionAddToList() {
        return resultActionAddToList;
    }

    public boolean isResultActionAddToListVisible() {
        return resultActionAddToList.isDisplayed();
    }
}
