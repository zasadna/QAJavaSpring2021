package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class CartTests extends BaseTest {


    private static final long DEFAULT_WAITING_TIME = 150;
    private static final String BREADS_CART = "Корзина";
    private static final String EXPECTED_VALUE = "Яйца пасхальные кролики";

    @Test
    public void checkAddToCart() {
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
        getHomePage().clickAuthorsSchemesCategory();
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getProductPage().isRabbitsProduct();
        getProductPage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
        getProductPage().clickRabbitsProduct();
        getProductPage().clickAddToCartButton();
        getProductPage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
        getCheckoutPage().clickViewCart();
        getCheckoutPage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getCheckoutPage().clickGoToCart();
        getShoppingCartPage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
        assertTrue(getShoppingCartPage().isProductName());
        getShoppingCartPage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
        assertEquals(getShoppingCartPage().getBreadsCartName().getText(), BREADS_CART);
        getShoppingCartPage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
        assertEquals(getShoppingCartPage().getProductName().getText(), EXPECTED_VALUE);
    }
}
