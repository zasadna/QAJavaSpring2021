package avic;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.xpath;

public class AvicTestsHW1 {
    WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

    }

    @BeforeMethod
    public void testsSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://avic.ua/");
    }

    @Test(priority = 1)
    public void checkSmartfonyiAmountOnSearchSecondPage() {
        driver.findElement(xpath("//span[@class='sidebar-item']")).click();
        driver.findElement(xpath("//ul[contains(@class,'sidebar-list')]//a[contains(@href, 'telefonyi-i-aksessuaryi')]")).click();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(xpath("//div[@class='brand-box__title']/a[contains(@href,'smartfonyi')]")).click();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        //   driver.findElement(xpath("//a[@class='btn-see-more js_show_more']")).click(); // for next page
        List<WebElement> elementsList = driver.findElements(xpath("//div[@class='prod-cart__descr']"));
        int actualElementsSize = elementsList.size();
        Assert.assertEquals(actualElementsSize, 12);
    }

    @Test(priority = 2)
    public void checkUvedomitONalichiiPriceAfterGrowUpSort() {
        driver.findElement(By.xpath("//input[@id='input_search']")).clear();
        driver.findElement(By.xpath("//input[@id='input_search']")).sendKeys("Asus", Keys.ENTER);
        new WebDriverWait(driver, 50).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
        driver.findElement(By.xpath("//div[@class='category-top']//span[@class='select2-selection__rendered']")).click();
        driver.findElement(By.xpath("//div[@class='category-top']//*[contains(text(),'По возрастанию')]")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(xpath("//span[@class='sidebar-item']"));
        List<WebElement> elementsList2 = driver.findElements(xpath("//div[@class='prod-cart height']/a[text()='Уведомить о наличии']"));
        String strUvedomitONalichii = elementsList2.get(0).getText();
        Assert.assertEquals(strUvedomitONalichii, "Уведомить о наличии");

    }

    @Test(priority = 3)
    public void checkLeftFilterByPrice() {
        String minPriceFilter = "123";
        String maxPriceFilter = "321";
        driver.findElement(xpath("//span[@class='sidebar-item']")).click();
        driver.findElement(xpath("//ul[contains(@class,'sidebar-list')]//a[contains(@href, 'ua/umnyij-dom')]")).click();
        new WebDriverWait(driver, 50).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
        driver.findElement(xpath("//input[@class='form-control form-control-min']")).clear();
        driver.findElement(xpath("//input[@class='form-control form-control-min']")).sendKeys(minPriceFilter);
        driver.findElement(xpath("//input[@class='form-control form-control-max']")).clear();
        driver.findElement(xpath("//input[@class='form-control form-control-max']")).sendKeys(maxPriceFilter);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(xpath("//div[contains(@class,'tooltip')]//span[@class='filter-tooltip-inner']")).click();
        List<WebElement> elementsList3 = driver.findElements(xpath("//div[@class='prod-cart__prise-new']"));
        if (elementsList3.size() != 0) {
            boolean res = getPrice(minPriceFilter, maxPriceFilter, elementsList3);
            Assert.assertEquals(res, true);
        }
    }

    private boolean getPrice(String minPriceFilter, String maxPriceFilter, List<WebElement> elementsList3) {
        boolean value = false;
        for (int i = 0; i < elementsList3.size(); i++) {
            String currentPrice = elementsList3.get(i).getText();
            int valueCurrentPrice = Integer.parseInt(currentPrice.replaceAll("[^0-9]", ""));
            if (valueCurrentPrice > Integer.parseInt(minPriceFilter) & valueCurrentPrice < Integer.parseInt(maxPriceFilter)) {
                value = true;
            } else {
                value = false;
            }
        }
        return value;
    }

    @Test(priority = 4)
    public void checkCity() {
        driver.findElement(xpath("//div[contains(@class,'header')]//a[contains(@href, 'kontaktyi')]")).click();
        String city = driver.findElement(xpath("//div[contains(@class,'general-col')]/p/span/strong[contains(text(),'Киев')]")).getText();
        Assert.assertEquals(city, "Киев");
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
