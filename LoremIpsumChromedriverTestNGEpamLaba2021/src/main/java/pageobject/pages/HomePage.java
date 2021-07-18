package pageobject.pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    private static final String SET_RU_LANGUAGE = "//*[@id='Languages']/a[contains(@href, 'ru')]";
    private static final String GENERATE_BUTTON = "//input[@id='generate']";

    private static final String GENERATE_ELEMENT_BY_WORDS = "//form//label[@for='words']";
    private static final String GENERATE_ELEMENT_BY_BYTES = "//form//label[@for='bytes']";
    private static final String SET_AMOUNT= "//input[@name='amount']";

    public HomePage(WebDriver driver) {
        super(driver);
    }

}
