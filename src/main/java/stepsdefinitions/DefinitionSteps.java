package stepsdefinitions;

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

        private static final long DEFAULT_TIMEOUT = 60;

        WebDriver driver;
        HomePage homePage;
        SearchResultsPage searchResultsPage;
        ProductPage productPage;
        WishlistPage wishlistPage;
        DeliveryAndReturnsPage deliveryAndReturnsPage;
        PageFactoryManager pageFactoryManager;
        ShoppingCartPage shoppingCartPage;

    @Before
    public void testsSetUp() {
        chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        pageFactoryManager = new PageFactoryManager(driver);
        driver.navigate().refresh();
    }

    @And("User opens {string} page")
    public void openPage(final String url) {
        homePage = pageFactoryManager.getHomePage();
        homePage.openHomePage(url);
    }

    @And("User clicks country Button")
    public void userClicksCountryButton() {
        homePage.userClicksCountryButton();
        homePage.waitVisibilityOfElement(DEFAULT_TIMEOUT, homePage.getCountryPopup());
    }

    @And("User checks country field visibility")
    public void userChecksCountryFieldVisibility() {
        assertTrue(homePage.userChecksCountryFieldVisibility());
    }

    @And("User checks currency field visibility")
    public void userChecksCurrencyFieldVisibility() {
        assertTrue(homePage.userChecksCurrencyFieldVisibility());
    }

    @And("User updates preferences")
    public void userUpdatesPreferences() {
        homePage.waitVisibilityOfElement(DEFAULT_TIMEOUT, homePage.getCountryPopup());
        homePage.userUpdatesPreferences();
    }


    @And("User checks header visibility")
    public void userChecksHeaderVisibility() {
        homePage.userChecksHeaderVisibility();
    }

    @And("User checks footer visibility")
    public void userChecksFooterVisibility() {
        homePage.userChecksFooterVisibility();
    }

    @And("User checks search field visibility")
    public void userChecksSearchFieldVisibility() {
        homePage.userChecksSearchFieldVisibility();
    }

    @And("User checks women shop top icon visibility")
    public void userChecksWomenShopTopIconVisibility() {
        homePage.userChecksWomenShopTopIconVisibility();
    }

    @And("User checks men shop top icon visibility")
    public void userChecksMenShopTopIconVisibility() {
        homePage.userChecksMenShopTopIconVisibility();
    }

    @And("User checks cart visibility")
    public void userChecksCartVisibility() {
        homePage.userChecksCartVisibility();
    }

    @And("User checks wishlist visibility")
    public void userChecksWishlistVisibility() {
        homePage.userChecksWishlistVisibility();
    }



    @When("User clicks 'Profile' button")
    public void userClicksProfileButton() {
        homePage.userClicksProfileButton();
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        homePage.waitVisibilityOfElement(DEFAULT_TIMEOUT, homePage.getProfilePopup());

    }

    @And("User checks sign bar in visibility")
    public void userChecksSignBarInVisibility() {
        homePage.waitVisibilityOfElement(DEFAULT_TIMEOUT, homePage.getProfilePopup());
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        homePage.userChecksSignInBarVisibility();
    }

    @And("User checks join bar visibility")
    public void userChecksJoinBarVisibility() {
        homePage.userChecksJoinBarVisibility();
    }

    @When("User clicks sign in bar")
    public void userClicksSignIn() {
        homePage.userClicksProfileButton();
        homePage.userClicksSignIn();
    }

    @And("User checks email field to sign in visibility")
    public void userChecksEmailFieldToSignInVisibility() {
        assertTrue(homePage.userChecksEmailFieldToSignInVisibility());
    }

    @And("User checks password field to sign in visibility")
    public void userChecksPasswordFieldToSignInVisibility() {
        assertTrue(homePage.userChecksPasswordFieldToSignInVisibility());
    }

    @And("User checks 'Sign In' button visibility")
    public void userChecksSignInButtonVisibility() {
        assertTrue(homePage.userChecksSignInButtonVisibility());
    }


    @When("User clicks join")
    public void userClicksJoin() {
        homePage.userClicksJoin();
    }

    @And("User checks email field to join visibility")
    public void userChecksEmailFieldToJoinVisibility() {
        assertTrue(homePage.userChecksEmailFieldToJoinVisibility());
    }

    @And("User checks password field to join visibility")
    public void userChecksPasswordFieldToJoinVisibility() {
        assertTrue(homePage.userChecksPasswordFieldToJoinVisibility());
    }

    @And("User checks 'Join Asos' button visibility")
    public void userChecksJoinAsosButtonVisibility() {
        assertTrue(homePage.userChecksJoinAsosButtonVisibility());
    }

    @Then("User clicks 'Asos Home' Button")
    public void userClicksAsosHomeButton() {
        homePage.userClicksAsosHomeButton();
    }


    @When("User clicks join bar")
    public void userClicksJoinBar() { homePage.userClicksJoinBar();
    }

    @And("User clicks 'Join Asos' button")
    public void userClicksJoinAsosButton() { homePage.userClicksJoinAsosButton();
    }

    @And("User checks email address to join error visibility")
    public void userChecksEmailAddressErrorVisibility() {
        assertTrue(homePage.userChecksEmailAddressToJoinErrorVisibility());
    }

    @And("User checks first name to join error visibility")
    public void userChecksFirstNameToJoinErrorVisibility() {
        assertTrue(homePage.userChecksFirstNameToJoinErrorVisibility());
    }

    @And("User checks last name to join error visibility")
    public void userChecksLastNameToJoinErrorVisibility() {
        assertTrue(homePage.userChecksLastNameToJoinErrorVisibility());
    }

    @And("User checks password to join error visibility")
    public void userChecksPasswordToJoinErrorVisibility() {
        assertTrue(homePage.userChecksPasswordToJoinErrorVisibility());
    }

    @And("User checks date of birth to join error visibility")
    public void userChecksDateOfBirthToJoinErrorVisibility() {
        assertTrue(homePage.userChecksDateOfBirthToJoinErrorVisibility());
    }

    @And("User clicks on day field")
    public void userClicksOnDayField() {
        driver.navigate().refresh();
        homePage.userClicksOnDayField();
    }

    @And("User enters {string} in day field")
    public void userEntersDayInDayField(final String day) { homePage.userEntersDayInDayField(day);
    }

    @And("User clicks on month field")
    public void userClicksOnMonthField() { homePage.userClicksOnMonthField();
    }

    @And("User enters {string} in month field")
    public void userEntersLetterInMonthField(final String letter) { homePage.userEntersLetterInMonthField(letter);
    }

    @And("User clicks on year field")
    public void userClicksOnYearField() { homePage.userClicksOnYearField();
    }

    @And("User enters {string} in year field")
    public void userEntersNumberInYearField(final String number) { homePage.userEntersNumberInYearField(number);
        homePage.userClicksOnYearField();
    }

    @Then("User checks date of birth to join error reason massage visibility")
    public void userChecksDateOfBirthToJoinErrorMassageVisibility() {
        assertTrue(homePage.userChecksDateOfBirthToJoinErrorMassageVisibility());
    }

    @When("User clicks 'Sign In' button")
    public void userClicksSignInButton() { homePage.userClicksSignInButton();
    }

    @And("User checks email address to sign in error visibility")
    public void userChecksEmailAddressToSignInErrorVisibility() {
        assertTrue(homePage.userChecksEmailAddressToSignInErrorVisibility());
    }

    @And("User checks password to sign in error visibility")
    public void userChecksPasswordToSignInErrorVisibility() {
        assertTrue(homePage.userChecksPasswordToSignInErrorVisibility());
    }

    @When("User enters {string} in email field to sign in")
    public void userEntersEmailInEmailFieldToSignIn(final String email) {
        driver.navigate().refresh();
        homePage.userEntersEmailInEmailFieldToSignIn(email);
    }

    @When("User enters {string} in password field to sign in")
    public void userEntersPasswordInPasswordFieldToSignIn(final String password) {
        driver.navigate().refresh();
        homePage.userEntersPasswordInPasswordFieldToSignIn(password);
    }

    @When("User enters {string} in search field")
    public void userEntersKeywordInSearchField(final String keyword) {
        homePage.userEntersKeywordInSearchField(keyword);
        homePage.userClicksSearchButton();
    }

    @And("User checks the amount of products in search page")
    public void userChecksThatAmountOfProductsInSearchPage() {
        searchResultsPage = pageFactoryManager.getSearchResultsPage();
        searchResultsPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        assertEquals(searchResultsPage.getAmountOfProductsInSearchPageCount(), 72);
    }

    @When("User clicks on 'Gender Tab'")
    public void userClicksOnGenderTab() {
        searchResultsPage.userClicksOnGenderTab();
    }

    @And("User chooses 'Women'")
    public void userChoosesWomen() {
        searchResultsPage.userChoosesWomen();
    }

    @And("User clicks on 'SaleNewSeason Tab'")
    public void userClicksOnSaleNewSeasonTab() {
        searchResultsPage.userClicksOnSaleNewSeasonTab();
    }

    @And("User chooses 'Sale'")
    public void userChoosesSale() {
        searchResultsPage.userChoosesSale();
    }

    @And("User clicks on 'Discount Tab'")
    public void userClicksOnDiscountTab() {
        searchResultsPage.userClicksOnDiscountTab();
    }

    @And("User chooses 'Up to 20'")
    public void userChoosesUpTo20() {
        searchResultsPage.userChoosesUpTo20();
    }

    @Then("User checks the amount of products in search page with filters")
    public void userChecksTheAmountOfProductsInSearchPageWithFilters() {
        searchResultsPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        assertEquals(searchResultsPage.getAmountOfProductsInSearchPageWithFiltersCount(), 2);
    }

    @And("User clicks wishlist on first product")
    public void userClicksWishlistOnFirstProduct() {
        searchResultsPage = pageFactoryManager.getSearchResultsPage();
        searchResultsPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        searchResultsPage.userClicksWishlistOnFirstProduct();
    }

    @And("User clicks wishlist on second product")
    public void userClicksWishlistOnSecondProduct() {
        searchResultsPage.userClicksWishlistOnSecondProduct();
    }

    @And("User clicks on wishlist")
    public void userClicksOnWishlist() {
        searchResultsPage.userClicksOnWishlist();
    }

    @Then("User checks that amount of products in wishlist are two")
    public void userChecksThatAmountOfProductsInWishlistAreTwo() {
        wishlistPage = pageFactoryManager.getWishlistPage();
        wishlistPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        wishlistPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, wishlistPage.getFirstProductImage());
        assertEquals(wishlistPage.getAmountOfProductsInWishlistCount(), 2);
    }

    @When("User clicks on delete from wishlist button first product")
    public void userClicksOnDeleteFromWishlistButtonFirstProduct() {
        wishlistPage = pageFactoryManager.getWishlistPage();
        wishlistPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, wishlistPage.getFirstProductImage());
        wishlistPage.userClicksOnDeleteFromWishlistButtonFirstProduct();
    }

    @Then("User checks that wishlist is empty")
    public void userChecksThatWishlistIsEmpty() {
        wishlistPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, wishlistPage.getNoItemIcon());
        assertTrue(wishlistPage.userChecksThatWishlistIsEmpty());
    }





    @And("User clicks delivery and returns button")
    public void userClicksDeliveryAndReturnsButton() {
        homePage.userClicksDeliveryAndReturnsButton();
    }

    @And("User checks 'Delivery Tab' visibility")
    public void userChecksDeliveryTabVisibility() {
        deliveryAndReturnsPage = pageFactoryManager.getDeliveryAndReturnsPage();
        assertTrue(deliveryAndReturnsPage.userChecksDeliveryTabVisibility());
    }

    @And("User checks 'Returns Tab' visibility")
    public void userChecksReturnsTabVisibility() {
        assertTrue(deliveryAndReturnsPage.userChecksReturnsTabVisibility());
    }

    @And("User checks standard delivery info bar visibility")
    public void userChecksStandardDeliveryInfoBarVisibility() {
        deliveryAndReturnsPage.userChecksStandardDeliveryInfoBarVisibility();
    }

    @And("User checks express delivery info bar visibility")
    public void userChecksExpressDeliveryInfoBarVisibility() {
        deliveryAndReturnsPage.userChecksExpressDeliveryInfoBarVisibility();
    }

    @When("User clicks on 'Returns Tab'")
    public void userClicksOnReturnsTab() {
        deliveryAndReturnsPage.userClicksOnReturnsTab();
    }

    @Then("User checks download returns pdf info visibility")
    public void userChecksDownloadReturnsPdfInfoVisibility() {
        assertTrue(deliveryAndReturnsPage.userChecksDownloadReturnsPdfInfoVisibility());
    }





    @When("User clicks on first product")
    public void userClicksOnFirstProduct() {
        searchResultsPage = pageFactoryManager.getSearchResultsPage();
        searchResultsPage.userClicksOnFirstProduct();
    }

    @And("User checks video icon visibility")
    public void userChecksVideoIconVisibility() {
        productPage = pageFactoryManager.getProductPage();
        productPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        productPage.userChecksVideoIconVisibility();
    }

    @And("User checks price visibility")
    public void userChecksPriceVisibility() {
        productPage.userChecksPriceVisibility();
    }

    @And("User checks size field visibility")
    public void userChecksSizeFieldVisibility() {
        productPage.userChecksSizeFieldVisibility();
    }

    @And("User checks add to bag button visibility")
    public void userChecksAddToBagButtonVisibility() {
        productPage.userChecksAddToBagButtonVisibility();
    }

    @And("User clicks on fit assistant size button")
    public void userClicksOnFitAssistantSizeButtonVisibility() {

        productPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        productPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, productPage.getFitAssistantIcon());
        productPage.userClicksOnFitAssistantSizeButton();
    }

    @Then("User checks fit assistant size popup visibility")
    public void userChecksFitAssistantSizePopupVisibility() {
        productPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, productPage.getFitAssistantSizePopup());
        assertTrue(productPage.userChecksFitAssistantSizePopupVisibility());
    }

    @And("User clicks on second product")
    public void userClicksOnSecondProduct() {
        searchResultsPage = pageFactoryManager.getSearchResultsPage();
        searchResultsPage.userClicksOnSecondProduct();
        productPage = pageFactoryManager.getProductPage();
        productPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
    }

    @And("User enters {string} on height field")
    public void userEntersHeightOnHeightField(final String height) {
        productPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, productPage.getHeightField());
        productPage.userEntersHeightOnHeightField(height);
    }

    @And("User clicks on weight field")
    public void userClicksOnWeightField() {
        productPage.userClicksOnWeightField();
    }

    @And("User enters {string} on weight field")
    public void userEntersWeightOnWeightField(final String weight) {
        productPage.userEntersWeightOnWeightField(weight);
    }

    @And("User clicks on continue button")
    public void userClicksOnContinueButton() {
        productPage.userClicksOnContinueButton();
    }

    @And("User clicks on flatter tummy shape button")
    public void userClicksOnFlatterTummyShapeButton() {
        productPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, productPage.getFlatterTummyShapeButtonIcon());
        productPage.userClicksOnFlatterTummyShapeButton();
    }

    @And("User clicks on straighter hip shape button")
    public void userClicksOnStraighterHipShapeButton() {
        productPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, productPage.getStraighterHipShapeButtonIcon());
        productPage.userClicksOnStraighterHipShapeButton();
    }

    @And("User clicks on 75 bust size button")
    public void userClicksOnBustSizeButton() {
        productPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, productPage.getBraLabel());
        productPage.userClicksOnBustSizeButton();
    }

    @And("User clicks on A cup size button")
    public void userClicksOnACupSizeButton() {
        productPage.userClicksOnACupSizeButton();
    }

    @And("User clicks on age field")
    public void userClicksOnAgeField() {
        productPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, productPage.getAgeFieldVisible());
        productPage.userClicksOnAgeField();
    }

    @And("User enters {string} on age field")
    public void userEntersAgeOnAgeField(final String age) {
        productPage.userEntersAgeOnAgeField(age);
    }

    @And("User clicks on skip question button")
    public void userClicksOnSkipQuestionButton() {
        productPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, productPage.getBrandYouNormallyWearIcons());
        productPage.userClicksOnSkipQuestionButton();
    }

    @And("User clicks on tighter fit preference button")
    public void userClicksOnTighterFitPreferenceButton() {
        productPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, productPage.getFitPreferenceSlider());
        productPage.userClicksOnTighterFitPreferenceButton();
    }

    @Then("User checks fit size assistant find S size")
    public void userChecksFitSizeAssistantFindSSize() {
        productPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, productPage.getsSizeIcon());
        assertTrue(productPage.userChecksFitSizeAssistantFindSSize());
    }

    @And("User clicks on s size")
    public void userClicksOnSSize() {
        productPage.clicksOnSizeField();
        productPage.userClicksOnSSize();
    }

    @And("User clicks on add to bag button")
    public void userClicksOnAddToBagButton() {
        productPage.userClicksOnAddToBagButton();
    }

    @And("User checks that amount of products in cart is {string}")
    public void userChecksTheAmountOfProductsInCart(final String expectedAmount) {
        productPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, productPage.getCartPopup());
        assertEquals(productPage.getTextOfAmountProductsInCart(), expectedAmount);
    }

    @Then("User checks checkout button visibility")
    public void userChecksCheckoutButtonVisibility() {
        assertTrue(productPage.userChecksCheckoutButtonVisibility());
    }

    @And("User clicks on delete from cart button")
    public void userClicksOnDeleteFromCartButton() {
        productPage.userClicksOnDeleteFromCartButton();
        productPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
    }

    @Then("User checks that cart is empty")
    public void userChecksThatCartIsEmpty() {

        shoppingCartPage = pageFactoryManager.getShoppingCartPage();
        shoppingCartPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, shoppingCartPage.getCartEmptinessMassage());
        assertTrue(shoppingCartPage.isCartEmptinessMassage());

    }

    @And("User clicks on cart button")
    public void userClicksOnCartButton() {
        productPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, productPage.getCartIcon());
        productPage.userClicksOnCartButton();
    }


    @After
    public void tearDown() {
        driver.close();
    }



}
