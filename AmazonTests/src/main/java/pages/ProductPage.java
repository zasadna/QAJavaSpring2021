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

}
