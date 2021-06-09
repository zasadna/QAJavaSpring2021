package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage {

    @FindBy(xpath = "//div[@class='wrapper-breads-inner']/h3[contains(text(),'Корзина')]")
    private WebElement breadsCart;

    @FindBy(xpath = "//table//a[contains(text(),'кролики')]")
    private WebElement productName;

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getBreadsCartName() {
        return breadsCart;
    }

    public WebElement getProductName() {
        return productName;
    }

    public boolean isProductName() {
        return productName.isDisplayed();
    }

}
