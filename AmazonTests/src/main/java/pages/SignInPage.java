package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage{

    @FindBy(xpath = "//input[@name='email']")
    private WebElement emailOrMobilePhoneNumberField;

    @FindBy(xpath = "//div[@id='auth-email-missing-alert']//div[@class='a-alert-content']")
    private WebElement emailOrMobilePhoneNumberErrorMessage;

    @FindBy(xpath = "//input[@class='a-button-input']")
    private WebElement continueButton;

    private WebElement url;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@class='a-button-input']")
    private WebElement signInPasswordButton;

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void isEmailOrMobilePhoneNumberFieldVisible() {
        emailOrMobilePhoneNumberField.isDisplayed();
    }

    public void isContinueButtonVisible() {
        continueButton.isDisplayed();
    }

    public void clickContinueButton() {
        continueButton.click();
    }

    public String getEmailOrMobilePhoneNumberErrorMessage() {
        return emailOrMobilePhoneNumberErrorMessage.getText();
    }

    public WebElement getUrl() {
        return url;
    }

    public void enterTextToEmailOrMobilePhoneNumberField(final String setEmail) {
        emailOrMobilePhoneNumberField.clear();
        emailOrMobilePhoneNumberField.sendKeys(setEmail);
    }

    public void isPasswordFieldVisible() {
        passwordField.isDisplayed();
    }

    public void enterTextToPasswordField(final String setPassword) {
        passwordField.clear();
        passwordField.sendKeys(setPassword);
    }

    public void isSignInPasswordButtonVisible() {
        signInPasswordButton.isDisplayed();
    }

    public void clickSignInPasswordButton() {
        signInPasswordButton.click();
    }

}
