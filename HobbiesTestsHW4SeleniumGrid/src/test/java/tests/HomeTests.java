package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HomeTests extends BaseTest {

    private static final long DEFAULT_WAITING_TIME = 90;
    private static final String PRODUCT_NAME = "Узор с кругами";
    private static final int EXPECTED_DISCOUNTS_SIZE = 6;

    @Test
    public void checkSizeOfDiscountsList() {
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        assertTrue(getHomePage().isNewGoods());
        assertTrue(getHomePage().isDiscounts());
        assertTrue(getHomePage().isTheBestGoods());
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().clickDiscounts();
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
        assertEquals(getHomePage().getPatternWithCirclesProductName().getText(), PRODUCT_NAME);
        assertEquals(getHomePage().getDiscountsList().size(), EXPECTED_DISCOUNTS_SIZE);
    }
}
