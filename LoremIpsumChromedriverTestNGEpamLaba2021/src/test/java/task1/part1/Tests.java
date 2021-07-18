package task1.part1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tests {

    private WebDriver chromeDriver;
    private String expectedWord = "рыба";
    private String expectedResult = "Lorem ipsum dolor sit amet, consectetur adipiscing elit";

    @BeforeTest
    public void profileSetUp() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
    }

    @BeforeMethod
    public void testsSetUp() {
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://lipsum.com/");
    }

    /**
     * Let's verify that the word "рыба" correctly appears in the first paragraph ("Что такое Lorem Ipsum?"):
     * 1. Go to https://lipsum.com/
     * 2. Switch to Russian language using one of the links
     * 3. Verify that the text of the first <p> element, which is the first paragraph, contains the word «рыба».
     */
    @Test(priority = 1)
    public void checkThatWordContainsCorrectlyInTheFirstParagraph() {
        chromeDriver.findElement(By.xpath("//*[@id='Languages']/a[contains(@href, 'ru')]")).click();
        String actualResult = chromeDriver.findElement(By.xpath("//*[@id='Panes']//p[contains(text(),'рыба')]")).getText();
        Assert.assertEquals(true, actualResult.contains(expectedWord), "Current test word " + expectedWord + " doesn't contain in the first paragraph");
    }

    /**
     *Let's verify that default setting result in text starting with Lorem ipsum:
     * 1. Go to https://lipsum.com/
     * 2. Press “Generate Lorem Ipsum”
     * 3. Verify that the first paragraph starts with "Lorem ipsum dolor sit amet, consectetur adipiscing elit"
     */
    @Test(priority = 2)
    public void checkThatDefaultSettingHasTextStartingWithLoremIpsum() {
        chromeDriver.findElement(By.xpath("//input[@id='generate']")).click();
        String actualResult = chromeDriver.findElement(By.xpath("//div[@id='lipsum']/p[contains(text(),'Lorem ipsum')]")).getText();
        Assert.assertEquals(true, actualResult.contains(expectedResult), "Default setting doesn't starting text with " + expectedResult);
    }

    @AfterMethod
    public void tearDown() {
        chromeDriver.close();
    }
}
