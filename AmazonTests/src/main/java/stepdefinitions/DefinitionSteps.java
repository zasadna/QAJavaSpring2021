package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import manager.PageFactoryManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DefinitionSteps {

    private static final long DEFAULT_TIMEOUT = 90;
    WebDriver driver;
    HomePage homePage;
    ShoppingCartPage shoppingCartPage;
    SearchResultsPage searchResultsPage;
    ProductPage productPage;
    SignInPage signInPage;
    PageFactoryManager pageFactoryManager;
    UserStorePage userStorePage;
    InternationalBestSellersPage internationalBestSellersPage;

    @Before
    public void testsSetUp() {
        chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        pageFactoryManager = new PageFactoryManager(driver);
    }

    @And("User opens {string} page")
    public void openPage(final String url) {
        homePage = pageFactoryManager.getHomePage();
        homePage.openHomePage(url);
    }

    @And("User checks search field visibility")
    public void checkSearchVisibility() {
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        assertTrue(homePage.isSearchFieldVisible());
    }

    @And("User makes search by keyword {string}")
    public void enterKeywordToSearchField(final String keyword) {
        homePage.enterTextToSearchField(keyword);
    }

    @And("User clicks search button")
    public void clickSearchButton() {
        homePage.clickSearchButton();
    }

    @And("User opens first product")
    public void openFirstProduct() {
        searchResultsPage = pageFactoryManager.getSearchResultsPage();
        searchResultsPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        searchResultsPage.clickFirstItemOfListGoods();
    }

    @And("User clicks Add to List button")
    public void clickAddToListButton() {
        searchResultsPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        searchResultsPage.clickAddToListButton();
    }

    @And("User checks Sign In button visibility")
    public void userChecksSignInButtonVisibility() {
        homePage.isSignInButtonVisible();
    }

    @When("User clicks Sign In button")
    public void clicksSignInButton() {
        homePage.clickSignInButton();
    }

    @And("User checks Email or mobile phone number field visibility on sign in popup")
    public void userChecksEmailOrMobilePhoneNumberFieldVisibilityOnSignInPopup() {
        signInPage = pageFactoryManager.getSignInPage();
        signInPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        assertTrue(signInPage.isEmailOrMobilePhoneNumberFieldVisible());
    }

    @And("User checks Continue button visibility on sign in popup")
    public void userChecksContinueButtonVisibilityOnSignInPopup() {
        assertTrue(signInPage.isContinueButtonVisible());
    }

    @And("User clicks Continue button")
    public void userClicksContinueButton() {
        signInPage.clickContinueButton();
    }

    @Then("User checks that current error message is {string}")
    public void userChecksThatCurrentErrorMessageIsMessage(final String expecteMessage) {
        signInPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        assertEquals(signInPage.getEmailOrMobilePhoneNumberErrorMessage(), expecteMessage);
    }

    @Then("User checks Sign in page is {string}")
    public void userChecksSignInPageIsSignInPage(final String expectedAmount) {
        assertEquals(signInPage.getUrl(), expectedAmount); //getCurrentUrl()
    }

    @And("User enters his Email in Email or mobile phone number field {string}")
    public void userEntersHisEmailInEmailOrMobilePhoneNumberFieldUserEmail(final String expectedText) {
        signInPage.enterTextToEmailOrMobilePhoneNumberField(expectedText);
    }

    @And("User checks Password field visibility on sign in popup")
    public void userChecksPasswordFieldVisibilityOnSignInPopup() {
        assertTrue(signInPage.isPasswordFieldVisible());
    }

    @And("User enters his Password {string}")
    public void userEntersHisPasswordUserPassword(final String expectedText) {
        signInPage.enterTextToPasswordField(expectedText);
    }

    @And("User checks Sign-In button visibility on sign in popup")
    public void userChecksSignInButtonVisibilityOnSignInPopup() {
        assertTrue(signInPage.isSignInPasswordButtonVisible());
    }

    @And("User clicks Sign-In button on sign in popup")
    public void userClicksSignInButtonOnSignInPopup() {
        signInPage.clickSignInPasswordButton();
    }

    @Then("User checks user was logged in to site as {string}")
    public void userChecksUserWasLoggedInToSiteAsUserName(final String expectedUserName) {
        userStorePage = pageFactoryManager.getUserStorePage();
        assertEquals(userStorePage.getUserName(), expectedUserName);
    }

    @And("User selects {string} brand in the right filter")
    public void userSelectsBrandBrandInTheRightFilter(final String brand) {
        searchResultsPage = pageFactoryManager.getSearchResultsPage();
        searchResultsPage.clickBrandFilterOptions();
    }

    @And("User sets {string} min price in the right filter")
    public void userSetsMinPriceMinPriceInTheRightFilter(final String minPrice) {
        searchResultsPage.setMinPriceFilterOptions(minPrice);
    }

    @And("User sets {string} max price in the right filter")
    public void userSetsMaxPriceMaxPriceInTheRightFilter(final String maxPrice) {
        searchResultsPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        searchResultsPage.setMaxPriceFilterOptions(maxPrice);
    }

    @And("User opens first product after searching")
    public void userOpensFirstProductAfterSearching() {
        searchResultsPage = pageFactoryManager.getSearchResultsPage();
        searchResultsPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        searchResultsPage.clickFirstItemOfListGoodsAfterSearching();
    }

    @And("User clicks go button")
    public void userClicksGoButton() {
        searchResultsPage.clickGoFilterOptions();
    }

    @And("User checks Add to Cart button visibility on product page")
    public void userChecksAddToCartButtonVisibility() {
        productPage = pageFactoryManager.getProductPage();
        assertTrue(productPage.isAddToCartButtonVisible());
    }

    @And("User clicks Add to Cart button on product page")
    public void userClicksAddToCartButtonOnProductPage() {
        productPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        productPage.clickAddToCartButton();
    }

    @And("User checks Cart button visibility")
    public void userChecksCartButtonVisibility() {
        productPage = pageFactoryManager.getProductPage();
        productPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        assertTrue(productPage.isCartButtonFromPopupVisible());
    }

    @And("User clicks Cart button")
    public void userClicksCartButton() {
        productPage.clickCartButtonFromPopup();
    }

    @And("User checks that page opens with {string} title")
    public void userChecksThatPageOpensWithTitleTitle(final String title) {
        shoppingCartPage = pageFactoryManager.getShoppingCartPage();
        assertEquals(shoppingCartPage.getShoppingCartTitle(), title);
    }

    @Then("User checks that quantity is {string}")
    public void userChecksThatQuantityIsQuantity(final String quantity) {
        assertEquals(shoppingCartPage.getQuantityOfGoods(), quantity);
    }

    @And("User checks categories dropdown visibility")
    public void userChecksCategoriesDropdownVisibility() {
        assertTrue(homePage.isCategoriesDropdownVisible());
    }

    @And("User clicks on list of categories")
    public void userClicksOnListOfCategories() {
        homePage.clickCategoriesDropdown();
    }

    @And("User clicks {string} category")
    public void userClicksCategoryNameCategory(final String category) {
        homePage.clickBooksCategoriesDropdown();
    }

    @Then("User checks that title first product has word {string}")
    public void userChecksThatTitleFirstProductHasWordKeywordTitle(final String word) {
        searchResultsPage = pageFactoryManager.getSearchResultsPage();
        assertTrue(searchResultsPage.getFirstOfListAtrBooks() != null);
        System.out.println(searchResultsPage.findWord(searchResultsPage.getFirstOfListAtrBooks(), word));
        assertEquals(searchResultsPage.findWord(searchResultsPage.getFirstOfListAtrBooks(), word), word);
    }

    @And("User clicks Buy Again button")
    public void userClicksBuyAgainButton() {
        userStorePage = pageFactoryManager.getUserStorePage();
        userStorePage.clickBuyAgainButton();
    }

    @And("User checks {string} title visibility")
    public void userChecksTitleTitleVisibility(final String title) {
        assertTrue(userStorePage.isBuyAgainTitleOfPageVisible());
    }

    @Then("User checks that page shows {string}")
    public void userChecksThatPageShowsMessage(final String text) {
        assertEquals(userStorePage.getBuyAgainEmptyText(), text);
    }

    @And("User clicks Shop now link in Amazon Top Sellers")
    public void userClicksShopNowLinkInAmazonTopSellers() {
        homePage = pageFactoryManager.getHomePage();
        homePage.clickShopNowFromAmazonTopSellersLink();
    }

    @And("User clicks Luggage left category")
    public void userClicksLuggageLeftCategory() {
        internationalBestSellersPage = pageFactoryManager.getInternationalBestSellersPage();
        internationalBestSellersPage.clickLuggageDepartments();
    }

    @And("User clicks Luggage Sets left category")
    public void userClicksLuggageSetsLeftCategory() {
        internationalBestSellersPage.clickLuggageSetsDepartments();
    }

    @And("User opens first product from International Best Sellers page")
    public void userOpensFirstProductFromInternationalBestSellersPage() {
        internationalBestSellersPage.clickFirstItemOfListGoods();
    }

    @Then("User checks that title first product has word {string} from International Best Sellers page")
    public void userChecksThatTitleFirstProductHasWordKeywordTitleFromInternationalBestSellersPage(final String word) {
        assertEquals(internationalBestSellersPage.findWord(internationalBestSellersPage.getLuggageTitle(), word), word);
    }

    @And("User clicks Account & Lists in header")
    public void userClicksAccountListsInHeader() {
        userStorePage = pageFactoryManager.getUserStorePage();
        userStorePage.clickAccountAndListsButtonInHeader();
    }

    @And("User clicks Login & security")
    public void userClicksLoginSecurity() {
        userStorePage.clickloginAndSecurity();
    }

    @And("User checks name box visibility")
    public void userChecksNameBoxVisibility() {
        assertTrue(userStorePage.isuserNameFromSecurityBoxVisible());
    }

    @And("User clicks Edit button for changing user's name")
    public void userClicksEditButtonForChangingUserSName() {
        userStorePage.clickEditButtonFromSecurityBox();
    }

    @And("User checks title of page is {string}")
    public void userChecksTitleOfPageIsChangeNameTitle(final String title) {
        assertEquals(userStorePage.getChangeNameTitle(), title);
    }

    @And("User changes current name to {string} new name")
    public void userChangesCurrentNameToNewNameNewName(final String newName) {
        userStorePage.setCustomerNameInput(newName);
    }

    @And("User checks Save changes button")
    public void userChecksSaveChangesButton() {
        userStorePage.clickSaveChangesButton();
    }

    @Then("User checks that current name is {string}")
    public void userChecksThatCurrentNameIsCurrentName(final String currentName) {
        assertEquals(userStorePage.getCurrentName(), currentName);
    }

    @And("User clicks Browsing History button")
    public void userClicksBrowsingHistoryButton() {
        userStorePage = pageFactoryManager.getUserStorePage();
        userStorePage.clickBrowsingHistoryButton();
    }

    @And("User clicks on More like this button of second item")
    public void userClicksOnMoreLikeThisButtonOfSecondItem() {
        userStorePage.clickMoreLikeThisSecondButton();
    }

    @Then("User checks that current page is {string}")
    public void userChecksThatCurrentPageIsCurrentTitleOfPage(final String currentTitle) {
        userStorePage.waitVisibilityOfElement(DEFAULT_TIMEOUT, userStorePage.getSimilarPopup());
        userStorePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        assertEquals(userStorePage.getSimilarItemsTitleOfPage(), currentTitle);
    }

    @Then("User checks Product details visibility")
    public void userChecksProductDetailsVisibility() {
        assertTrue(searchResultsPage.isProductDetailsVisible());
    }

    @After
    public void tearDown() {
        driver.close();
    }
}
