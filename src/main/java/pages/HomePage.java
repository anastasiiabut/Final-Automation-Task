package pages;

import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy (xpath = "//button[@data-testid='country-selector-btn']")
    private WebElement countryButton;

    @FindBy (xpath = "//section[@data-testid='country-selector-form']")
    private WebElement countryPopup;

    @FindBy (xpath = "//select[@id='country']")
    private WebElement countryField;

    @FindBy (xpath = "//select[@id='currency']")
    private WebElement currencyField;

    @FindBy (xpath = "//button[@data-testid='save-country-button']")
    private WebElement updatePreferencesButton;

    @FindBy (xpath = "//div[@id='chrome-header']")
    private WebElement header;

    @FindBy (xpath = "//div[@id='chrome-footer']")
    private WebElement footer;

    @FindBy (xpath = "//input[@id='chrome-search']")
    private WebElement searchField;

    @FindBy (xpath = "//a[@id='women-floor']")
    private WebElement womenShopTopIcon;

    @FindBy (xpath = "//a[@id='men-floor']")
    private WebElement menShopTopIcon;

    @FindBy (xpath = "//a[@data-testid='miniBagIcon']")
    private WebElement cartIcon;

    @FindBy (xpath = "//a[@data-testid='savedItemsIcon']")
    private WebElement wishlistIcon;

    @FindBy (xpath = "//button[@data-testid='myAccountIcon']")
    private WebElement profileButton;

    @FindBy (xpath = "//div[@data-testid='myaccount-dropdown']")
    private WebElement profilePopup;

    @FindBy(xpath = "//a[@href='https://my.asos.com/my-account?lang=en-GB&store=ROW&country=UA&keyStoreDataversion=hgk0y12-29']")
    private WebElement signInBar;

    @FindBy(xpath = "//a[@data-testid='signup-link']")
    private WebElement joinBar;

    @FindBy (xpath = "//a[@id='new-to-asos-tab']")
    private WebElement joinButton;

    @FindBy(xpath = "//input[@data-st-field='id-signIn-emailAddress']")
    private WebElement emailFieldToSignIn;

    @FindBy (xpath = "//input[@data-st-field='id-signIn-password']")
    private WebElement passwordFieldToSignIn;

    @FindBy (xpath = "//input[@id='signin']")
    private WebElement signInButton;

    @FindBy(xpath = "//input[@data-st-field='id-register-email']")
    private WebElement emailFieldToJoin;

    @FindBy (xpath = "//input[@data-st-field='id-register-password']")
    private WebElement passwordFieldToJoin;

    @FindBy (xpath = "//input[@type='submit']")
    private WebElement joinAsosButton;

    @FindBy (xpath = "//a[@class='home']")
    private WebElement asosHome;

    @FindBy (xpath = "//span[@class='qa-email-validation field-validation-error']")
    private WebElement emailAddressToJoinError;
    @FindBy (xpath = "//span[@class='qa-firstname-validation field-validation-error']")
    private WebElement firstNameToJoinError;
    @FindBy (xpath = "//span[@class='qa-lastname-validation field-validation-error']")
    private WebElement lastNameToJoinError;
    @FindBy (xpath = "//span[@class='qa-password-validation field-validation-error']")
    private WebElement passwordToJoinError;
    @FindBy (xpath = "//span[@class='qa-birthyear-validation subfield-validation field-validation-error']")
    private WebElement dateOfBirthToJoinError;

    @FindBy(xpath = "//select[@class='qa-birthday-textbox']")
    private WebElement dayField;
    @FindBy(xpath = "//select[@class='qa-birthmonth-textbox']")
    private WebElement monthField;
    @FindBy(xpath = "//select[@class='qa-birthyear-textbox']")
    private WebElement yearField;

    @FindBy (xpath = "//span[@id='BirthDay-error']")
    private WebElement dateOfBirthToJoinErrorMassage;

    @FindBy(xpath = "//span[@class='qa-email-validation field-validation-error']")
    private WebElement emailAddressToSignInError;
    @FindBy(xpath = "//span[@class='qa-password-validation field-validation-error']")
    private WebElement passwordToSignInError;
    @FindBy (xpath = "//button[@data-testid='search-button-inline']")
    private WebElement searchButton;

    @FindBy (xpath = "//a[text()='Delivery & returns']")
    private WebElement deliveryAndReturnsButton;


    public HomePage(WebDriver driver) { super(driver); }
    public void openHomePage(String url) { driver.get(url); }

    public void userClicksCountryButton() { countryButton.click(); }
    public boolean userChecksCountryFieldVisibility() { return countryField.isDisplayed(); }
    public boolean userChecksCurrencyFieldVisibility() { return currencyField.isDisplayed(); }
    public void userUpdatesPreferences() { updatePreferencesButton.click(); }
    public void userChecksHeaderVisibility() { header.isDisplayed(); }
    public void userChecksFooterVisibility() { footer.isDisplayed(); }
    public void userChecksSearchFieldVisibility() { searchField.isDisplayed();}
    public void userChecksWomenShopTopIconVisibility() { womenShopTopIcon.isDisplayed();}
    public void userChecksMenShopTopIconVisibility() { menShopTopIcon.isDisplayed();}
    public void userChecksCartVisibility() { cartIcon.isDisplayed(); }
    public void userChecksWishlistVisibility() { wishlistIcon.isDisplayed(); }
    public void userClicksProfileButton() { profileButton.click();}
    public WebElement getProfilePopup() { return profilePopup; }
    public WebElement getCountryPopup() { return countryPopup; }
    public void userChecksSignInBarVisibility() { signInBar.isDisplayed(); }
    public void userChecksJoinBarVisibility() { joinBar.isDisplayed(); }
    public void userClicksSignIn() { signInBar.click(); }
    public void userClicksJoin() { joinButton.click(); }
    public boolean userChecksEmailFieldToJoinVisibility() { return emailFieldToJoin.isDisplayed(); }
    public boolean userChecksPasswordFieldToJoinVisibility() { return passwordFieldToJoin.isDisplayed(); }
    public boolean userChecksJoinAsosButtonVisibility() { return joinAsosButton.isDisplayed(); }
    public boolean userChecksEmailFieldToSignInVisibility() { return emailFieldToSignIn.isDisplayed(); }
    public boolean userChecksPasswordFieldToSignInVisibility() { return passwordFieldToSignIn.isDisplayed(); }
    public boolean userChecksSignInButtonVisibility() { return signInButton.isDisplayed(); }
    public void userClicksAsosHomeButton() { asosHome.click(); }

    public void userClicksJoinBar() { joinBar.click(); }
    public void userClicksJoinAsosButton() { joinAsosButton.click(); }
    public boolean userChecksEmailAddressToJoinErrorVisibility() { return emailAddressToJoinError.isDisplayed(); }
    public boolean userChecksFirstNameToJoinErrorVisibility() { return firstNameToJoinError.isDisplayed();  }
    public boolean userChecksLastNameToJoinErrorVisibility() { return lastNameToJoinError.isDisplayed();  }
    public boolean userChecksPasswordToJoinErrorVisibility() { return passwordToJoinError.isDisplayed();  }
    public boolean userChecksDateOfBirthToJoinErrorVisibility() { return dateOfBirthToJoinError.isDisplayed(); }
    public void userClicksOnDayField() { dayField.click();  }
    public void userEntersDayInDayField(final String day ) {  dayField.sendKeys(day); }
    public void userClicksOnMonthField() { monthField.click();  }
    public void userEntersLetterInMonthField(final String letter) {  monthField.sendKeys(letter); }
    public void userClicksOnYearField() { yearField.click();  }
    public void userEntersNumberInYearField(final String number) { yearField.sendKeys(number);  }
    public boolean userChecksDateOfBirthToJoinErrorMassageVisibility() { return dateOfBirthToJoinErrorMassage.isDisplayed();}

    public void userClicksSignInButton() { signInButton.click(); }
    public boolean userChecksEmailAddressToSignInErrorVisibility() { return emailAddressToSignInError.isDisplayed(); }
    public boolean userChecksPasswordToSignInErrorVisibility() { return passwordToSignInError.isDisplayed(); }
    public void userEntersEmailInEmailFieldToSignIn(final String email) { emailFieldToSignIn.sendKeys(email); }
    public void userEntersPasswordInPasswordFieldToSignIn(final String password) {passwordFieldToSignIn.sendKeys(password); }

    public void userEntersKeywordInSearchField(final String keyword) { searchField.sendKeys(keyword); }
    public void userClicksSearchButton() { searchButton.click(); }

    public void userClicksDeliveryAndReturnsButton() { deliveryAndReturnsButton.click(); }






}
