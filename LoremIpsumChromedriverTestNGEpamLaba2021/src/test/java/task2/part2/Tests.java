package task2.part2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Tests {
    private WebDriver chromeDriver;
    private String textSizeTen = "10";
    private String textSizeMinusOne = "-1";
    private String textSizeZero = "0";
    private String textSizeFive = "5";
    private String textSizeTwenty = "20";
    private String defaultValue = "5";
    private String expectedWordCountFromSiteResultTen = "10 words";
    private String expectedWordCountFromSiteResultFive = "5 words";
    private String expectedWordCountFromSiteResultTwenty = "20 words";
    private String expectedWordCountFromSiteResultDefaultValue = "5 words";
    private String generateElementByWords = "//form//label[@for='words']";
    private String generateElementByBytes = "//form//label[@for='bytes']";
    private String loremText= "Lorem ipsum";
    private String loremWord= "lorem";

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
     * Let's verify that Lorem Ipsum is generated with correct size:
     * 1. Go to https://www.lipsum.com/
     * 2. Click on "words"
     * 2. Input 10 into the number field
     * 3. Press “Generate Lorem Ipsum”
     * 4. Verify the result has 10 words
     * 5. Verify correct generation for -1, 0, 5, 20 words
     * 6. Create the same test for characters (bytes). Verify 3-4 values.
     */

    @Test(priority = 1)
    public void checkThatTextSizeIsCorrectByWordCountWithTen() {
        Assert.assertEquals(getLengthOfLineByWords(textSizeTen), textSizeTen, "Test result with " + textSizeTen);
    }

    @Test(priority = 2)
    public void checkThatTextSizeIsCorrectByResultFromSiteWithTen() {
        Assert.assertEquals(getWordCountFromSiteResult(textSizeTen), expectedWordCountFromSiteResultTen, "Test result with " + expectedWordCountFromSiteResultTen);
    }

    @Test(priority = 3)
    public void checkThatTextSizeIsCorrectByWordCountWithMinusOne() {
        Assert.assertEquals(getLengthOfLineByWords(textSizeMinusOne), defaultValue, "Test result with " + textSizeMinusOne);
    }

    @Test(priority = 4)
    public void checkThatTextSizeIsCorrectByResultFromSiteWithMinusOne() {
        Assert.assertEquals(getWordCountFromSiteResult(textSizeMinusOne), expectedWordCountFromSiteResultDefaultValue, "Test result with " + expectedWordCountFromSiteResultDefaultValue);
    }

    @Test(priority = 5)
    public void checkThatTextSizeIsCorrectByWordCountWithZero() {
        Assert.assertEquals(getLengthOfLineByWords(textSizeZero), defaultValue, "Test result with " + textSizeZero);
    }

    @Test(priority = 6)
    public void checkThatTextSizeIsCorrectByResultFromSiteWithZero() {
        Assert.assertEquals(getWordCountFromSiteResult(textSizeZero), expectedWordCountFromSiteResultDefaultValue, "Test result with " + expectedWordCountFromSiteResultDefaultValue);
    }

    @Test(priority = 7)
    public void checkThatTextSizeIsCorrectByWordCountWithFive() {
        Assert.assertEquals(getLengthOfLineByWords(textSizeFive), textSizeFive, "Test result with " + textSizeFive);
    }

    @Test(priority = 8)
    public void checkThatTextSizeIsCorrectByResultFromSiteWithFive() {
        Assert.assertEquals(getWordCountFromSiteResult(textSizeFive), expectedWordCountFromSiteResultFive, "Test result with " + expectedWordCountFromSiteResultFive);
    }

    @Test(priority = 9)
    public void checkThatTextSizeIsCorrectByWordCountWithTwenty() {
        Assert.assertEquals(getLengthOfLineByWords(textSizeTwenty), textSizeTwenty, "Test result with " + textSizeTwenty);
    }

    @Test(priority = 10)
    public void checkThatTextSizeIsCorrectByResultFromSiteWithTwenty() {
        Assert.assertEquals(getWordCountFromSiteResult(textSizeTwenty), expectedWordCountFromSiteResultTwenty, "Test result with " + expectedWordCountFromSiteResultTwenty);
    }

    @Test(priority = 11)
    public void checkThatTextSizeIsCorrectByResultFromSiteInBytesWithTen() {
        Assert.assertEquals(getByteCountFromSiteResult(textSizeTen), textSizeTen, "Test result with " + textSizeTen);
    }

    @Test(priority = 12)
    public void checkThatTextSizeIsCorrectByResultFromSiteInBytesWithMinusOne() {
        Assert.assertEquals(getByteCountFromSiteResult(textSizeMinusOne), defaultValue, "Test result with " + defaultValue);
    }

    @Test(priority = 13)
    public void checkThatTextSizeIsCorrectByResultFromSiteInBytesWithZero() {
        Assert.assertEquals(getByteCountFromSiteResult(textSizeZero), defaultValue, "Test result with " + defaultValue);
    }

    @Test(priority = 14)
    public void checkThatTextSizeIsCorrectByResultFromSiteInBytesWithFive() {
        Assert.assertEquals(getByteCountFromSiteResult(textSizeFive), textSizeFive, "Test result with " + textSizeFive);
    }

    @Test(priority = 15)
    public void checkThatTextSizeIsCorrectByResultFromSiteInBytesWithTwenty() {
        Assert.assertEquals(getByteCountFromSiteResult(textSizeTwenty), textSizeTwenty, "Test result with " + textSizeTwenty);
    }

    private void setValue(String expectedLengthOfLine, String type) {
        chromeDriver.findElement(By.xpath("//input[@name='amount']")).clear();
        chromeDriver.findElement(By.xpath(type)).click();
        chromeDriver.findElement(By.xpath("//input[@name='amount']")).sendKeys(expectedLengthOfLine);
        chromeDriver.findElement(By.xpath("//input[@id='generate']")).click();
    }

    private String getLengthOfLineByWords(String expectedLengthOfLine) {
        setValue(expectedLengthOfLine, generateElementByWords);
        String actualResult = chromeDriver.findElement(By.xpath("//div[@id='lipsum']/p")).getText();
        String reg = "('?(\\s|$)(?=(([^']*'){2})*[^']*$)'?)";
        String[] actualResultByWords = actualResult.split(reg);
        return String.valueOf(actualResultByWords.length);
    }

    private String getWordCountFromSiteResult(String textSize) {
        setValue(textSize, generateElementByWords);
        String actualResultFromLine = chromeDriver.findElement(By.xpath("//div[@id='generated']")).getText();
        String noPrefixStr = "Error in result parsing.";
        String [] list = actualResultFromLine.split(",");
        if(list.length>1)
            noPrefixStr = list[1].trim();
        return noPrefixStr;
    }

    private String getByteCountFromSiteResult(String textSize) {
        setValue(textSize, generateElementByBytes);
        String actualResultFromLine = chromeDriver.findElement(By.xpath("//div[@id='generated']")).getText();
        String noPrefixStr = "Error in result parsing.";
        String [] list = actualResultFromLine.split(" ");
        if(list.length>1) {
            noPrefixStr = list[5].trim();
        }
        return noPrefixStr;
    }

    /**
     * Let's verify the checkbox:
     * 1. Go to https://www.lipsum.com/
     * 2. Uncheck "start with Lorem Ipsum" checkbox
     * 3. Press “Generate Lorem Ipsum”
     * 4. Verify that result no longer starts with Lorem ipsum
     */
    @Test(priority = 11)
    public void checkThatCheckboxIsWorks() {
        chromeDriver.findElement(By.xpath("//input[@id='start']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='generate']")).click();
        String actualResult = chromeDriver.findElement(By.xpath("//div[@id='lipsum']/p")).getText();
        Assert.assertFalse(actualResult.contains(loremText));
    }

    /**
     * Let's also check that randomly generated text paragraphs contain the word "lorem" with probability of more than 40%:
     * <p>
     * 1. Go to https://www.lipsum.com/
     * 2. Press “Generate Lorem Ipsum”
     * 3. Get text from each paragraph and determine the number of paragraphs containing the word “lorem”.
     * 4. Run the generation 10 times and get the average number of paragraphs containing the word “lorem”.
     * 5. Fail the test if the value is less than 2 (the actual value seems to be between 2 and 3, so use 3 to check that your test can actually fail).
     */
    @Test(priority = 12)
    public void checkThatRandomParagraphsContainTestWordWithProbabilityOfMore40() {
        int res = 0;
        for (int i = 0; i < 10; i++) {
            res += loremFinder();
        }
        int resCount = res/10;
        Assert.assertTrue(resCount>2, "Text paragraphs contain the word lorem with probability of less than 40%");
        System.out.println(resCount);
    }

    private int loremFinder() {
        chromeDriver.findElement(By.xpath("//input[@id='generate']")).click();
        List<WebElement> elementsList = chromeDriver.findElements(By.xpath("//div[@id='lipsum']/p"));
        int paragraphsCount = 0;
        for (WebElement webElement : elementsList) {
            String str = (webElement.getText()).toLowerCase();
            if (str.contains(loremWord)) {
                paragraphsCount++;
            }
        }
        chromeDriver.get("https://lipsum.com/");
        return paragraphsCount;
    }

    @AfterMethod
    public void tearDown() {
        chromeDriver.close();
    }
}
