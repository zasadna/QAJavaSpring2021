package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage extends BasePage {

    @FindBy(xpath = "//div[contains(@class,'general-col')]/p/span/strong[contains(text(),'Киев')]")
    private WebElement cityKyivName;

    public ContactPage(WebDriver driver) {
        super(driver);
    }

    public String getCityKyiv() {
        return cityKyivName.getText();
    }
}
