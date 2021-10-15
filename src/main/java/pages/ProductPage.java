package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

    @FindBy(xpath = "//button[@class='catwalk']")
    private WebElement videoIcon;
    @FindBy(xpath = "//span[@data-id='current-price']")
    private WebElement priceIcon;
    @FindBy(xpath = "//select[@data-id='sizeSelect']")
    private WebElement sizeField;
    @FindBy(xpath = "//button[@data-test-id='add-button']")
    private WebElement addToBagButton;
    @FindBy(xpath = "//button[@id='fit-upper']")
    private WebElement fitAssistantSizeButton;
    @FindBy (xpath = "//div[@class='uclw_whitebox_container']")
    private WebElement fitAssistantSizePopup;
    @FindBy (xpath = "//input[@id='uclw_form_height'][@maxlength='3']")
    private WebElement heightField;
    @FindBy (xpath = "//input[@id='uclw_form_weight'][@maxlength='3']")
    private WebElement weightField;
    @FindBy (xpath = "//button[@data-ref='submit']")
    private WebElement continueButton;
    @FindBy (xpath = "//span[@class='no-recommendation']")
    private WebElement fitAssistantIcon;
    @FindBy (xpath = "//li[@class='uclw_item uclw_key_1 ']")
    private WebElement flatterTummyShapeButton;
    @FindBy (xpath = "//span[@aria-label='Belly Shape Selection button - Flatter. Click to advance to next section.']")
    private WebElement flatterTummyShapeButtonIcon;
    @FindBy (xpath = "//li[@class='uclw_item uclw_key_1 ']")
    private WebElement straighterHipShapeButton;
    @FindBy (xpath = "//span[@aria-label='Hip Shape Selection button - Straighter. Click to advance to next section.']")
    private WebElement straighterHipShapeButtonIcon;
    @FindBy (xpath = "//span[@aria-label='Bust - 75']")
    private WebElement bustSizeButton;
    @FindBy (xpath = "//span[text()='Bust']")
    private WebElement braLabel;
    @FindBy (xpath = "//span[@aria-label='Cup - A']")
    private WebElement cupSizeButton;
    @FindBy (xpath = "//input[@class='uclw_input_text'][@maxlength='2']")
    private WebElement ageField;
    @FindBy (xpath = "//div[@class='uclw_age_input ']")
    private WebElement ageFieldVisible;
    @FindBy (xpath = "//button[@data-ref='skip1']")
    private WebElement skipQuestionButton;
    @FindBy (xpath = "//div[@data-ref='button.tighter']")
    private WebElement tighterFitPreferenceButton;
    @FindBy (xpath = "//div[@class='uclw_fit_indicators']")
    private WebElement fitPreferenceSlider;
    @FindBy (xpath = "//div[@id='uclw_brand_select']")
    private WebElement brandYouNormallyWearIcons;
    @FindBy (xpath = "//div[@class='uclw_size']")
    private WebElement sSizeIcon;
    @FindBy (xpath = "//div[@class='size-section']//div[@class='colour-size-select']//option[contains(text(),'S')][2]")
    private WebElement sSize;
    @FindBy (xpath = "//button[@aria-label='Bag 1 item']//span[@class='_1z5n7CN']")
    private WebElement amountOfProductsInCart;
    @FindBy (xpath = "//div[@data-testid='minibag-dropdown']")
    private WebElement cartPopup;
    @FindBy (xpath = "//a[@data-test-id='checkout-link']")
    private WebElement checkoutButton;
    @FindBy (xpath = "//button[@aria-label='Delete this item']")
    private WebElement deleteFromCartButton;
    @FindBy (xpath = "//a[@href='https://www.asos.com/bag?nlid=nav header']")
    private WebElement cartIcon;
    @FindBy (xpath = "//div[@class='empty-bag-contents-holder']//h2[@class='empty-bag-title']")
    private WebElement textOfBagEmptiness;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void userChecksVideoIconVisibility() {videoIcon.isDisplayed();}
    public void userChecksPriceVisibility() { priceIcon.isDisplayed(); }
    public void userChecksSizeFieldVisibility() { sizeField.isDisplayed(); }
    public void userChecksAddToBagButtonVisibility() { addToBagButton.isDisplayed(); }
    public void userClicksOnFitAssistantSizeButton() { fitAssistantSizeButton.click(); }
    public WebElement getFitAssistantSizePopup () {return fitAssistantSizePopup;}
    public boolean userChecksFitAssistantSizePopupVisibility() {return fitAssistantSizePopup.isDisplayed(); }

    public void userEntersHeightOnHeightField(final String height) { heightField.sendKeys(height); }
    public WebElement getHeightField() {return heightField; }
    public void userClicksOnWeightField() { weightField.click(); }
    public void userEntersWeightOnWeightField(final String weight) { weightField.sendKeys(weight); }
    public void userClicksOnContinueButton() { continueButton.click(); }
    public WebElement getFitAssistantIcon() {return fitAssistantIcon; }
    public void userClicksOnFlatterTummyShapeButton() { flatterTummyShapeButton.click(); }
    public WebElement getFlatterTummyShapeButtonIcon() {return flatterTummyShapeButtonIcon; }
    public void userClicksOnStraighterHipShapeButton() { straighterHipShapeButton.click();  }
    public WebElement getStraighterHipShapeButtonIcon () {return straighterHipShapeButtonIcon; }
    public void userClicksOnBustSizeButton() { bustSizeButton.click();  }
    public WebElement getBraLabel() {return braLabel;}
    public void userClicksOnACupSizeButton() { cupSizeButton.click(); }

    public void userClicksOnAgeField() { ageField.click(); }
    public void userEntersAgeOnAgeField(final String age) { ageField.sendKeys(age); }
    public WebElement getAgeFieldVisible () {return ageFieldVisible; }
    public void userClicksOnSkipQuestionButton() { skipQuestionButton.click(); }
    public WebElement getBrandYouNormallyWearIcons() {return brandYouNormallyWearIcons;}
    public void userClicksOnTighterFitPreferenceButton() { tighterFitPreferenceButton.click(); }
    public WebElement getFitPreferenceSlider () {return fitPreferenceSlider; }
    public boolean userChecksFitSizeAssistantFindSSize () { return sSizeIcon.isDisplayed();}
    public WebElement getsSizeIcon() {return sSizeIcon;}

    public void clicksOnSizeField() {sizeField.click();}
    public void userClicksOnSSize() {sSize.click(); }
    public void userClicksOnAddToBagButton() {addToBagButton.click(); }
    public WebElement getCartPopup() {return cartPopup; }

    public String getTextOfAmountProductsInCart() { return amountOfProductsInCart.getText();  }
    public boolean userChecksCheckoutButtonVisibility() { return checkoutButton.isDisplayed(); }
    public void userClicksOnDeleteFromCartButton() {  deleteFromCartButton.click(); }
    public void userClicksOnCartButton () {cartIcon.click();}
    public WebElement getCartIcon () {return cartIcon;}



}
