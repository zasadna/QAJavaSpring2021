package pageobject.pages;

import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.By.xpath;

public class HomePage extends BasePage{
    private static final String SET_RU_LANGUAGE = "//*[@id='Languages']/a[contains(@href, 'ru')]";
    private static final String SET_AMOUNT = "//input[@name='amount']";
    private static final String GENERATE_ELEMENT_BY_WORDS = "//form//label[@for='words']";
    private static final String GENERATE_ELEMENT_BY_BYTES = "//form//label[@for='bytes']";
    private static final String GENERATE_BUTTON = "//input[@id='generate']";
    private static final String START_WITH_LOREM_CHECKBOX = "//input[@id='start']";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnRuLanguage() {
        driver.findElement(xpath(SET_RU_LANGUAGE)).click();
    }
    public void clickOnAmount() {
        driver.findElement(xpath(SET_AMOUNT)).click();
    }
    public void clearOnAmount() {
        driver.findElement(xpath(SET_AMOUNT)).clear();
    }
    public void clickOnWordsRadioButton() {
        driver.findElement(xpath(GENERATE_ELEMENT_BY_WORDS)).click();
    }
    public void clickOnBytesRadioButton() {
        driver.findElement(xpath(GENERATE_ELEMENT_BY_BYTES)).click();
    }
    public void clickOnStartWithLoremCheckbox () {
        driver.findElement(xpath(START_WITH_LOREM_CHECKBOX)).click();
    }
    public void clickOnGenerateButton() {
        driver.findElement(xpath(GENERATE_BUTTON)).click();
    }



}
