package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {

    @FindBy(xpath = "//div[@class='pull-right']//a[contains(@class,'dropdown-toggle mini-cart')]")
    private WebElement viewCart;

    @FindBy(xpath = "//div[@class='pull-right']//a[contains(text(),'В корзину')]")
    private WebElement goToCart;

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public void clickViewCart() {
        viewCart.click();
    }

    public void clickGoToCart() {
       // ((JavascriptExecutor) driver).executeScript("arguments[0].click();", goToCart);
       goToCart.click();
    }

}
