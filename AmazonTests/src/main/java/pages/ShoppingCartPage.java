package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage {

    @FindBy(xpath = "//div[@class='a-row']/h1")
    private WebElement shoppingCartTitle;

    @FindBy(xpath = "//span[@class='a-dropdown-prompt']")
    private WebElement quantityOfGoods;

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    public String getShoppingCartTitle() {
        return shoppingCartTitle.getText();
    }

    public WebElement getQuantityOfGoods() {
        return quantityOfGoods;
    }
}
