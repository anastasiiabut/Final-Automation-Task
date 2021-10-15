package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends BasePage {

    @FindBy (xpath = "//div[@data-auto-id='productList']//article")
    private List<WebElement> amountOfProductsInSearchPageListText;

    @FindBy (xpath = "//li[@data-dropdown-id='floor']")
    private WebElement genderTab;
    @FindBy (xpath = "//div[text()='Women']")
    private WebElement woman;
    @FindBy (xpath = "//li[@data-dropdown-id='range']")
    private WebElement saleNewSeasonTab;
    @FindBy (xpath = "//div[text()='Sale']")
    private WebElement sale;
    @FindBy (xpath = "//li[@data-dropdown-id='discount_band']")
    private WebElement discountTab;
    @FindBy (xpath = "//div[text()='Up to 20%']")
    private WebElement upTo20;
    @FindBy (xpath = "//div[@data-auto-id='productList']//article")
    private List<WebElement> amountOfProductsInSearchWithFiltersPageListText;
    @FindBy (xpath = "//article[@id='product-23634091']//button[@data-auto-id='saveForLater']")
    private WebElement clicksWishlistOnFirstProduct;
    @FindBy (xpath = "//article[@id='product-201140405']//button[@data-auto-id='saveForLater']")
    private WebElement clicksWishlistOnSecondProduct;
    @FindBy (xpath = "//a[@data-testid='savedItemsIcon']")
    private WebElement wishlistIcon;
    @FindBy(xpath = "//article[@id='product-23634091']")
    private WebElement firstProduct;
    @FindBy (xpath = "//article[@id='product-201140405']")
    private WebElement secondProduct;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public int getAmountOfProductsInSearchPageCount() {  return getAmountOfProductsInSearchPageList().size(); }
    public List<WebElement> getAmountOfProductsInSearchPageList() { return amountOfProductsInSearchPageListText; }

    public void userClicksOnGenderTab() { genderTab.click(); }
    public void userChoosesWomen() { woman.click();   }
    public void userClicksOnSaleNewSeasonTab() { saleNewSeasonTab.click(); }
    public void userChoosesSale() { sale.click();  }
    public void userClicksOnDiscountTab() { discountTab.click(); }
    public void userChoosesUpTo20() { upTo20.click(); }
    public int getAmountOfProductsInSearchPageWithFiltersCount() {
        return getAmountOfProductsInSearchWithFiltersPageList().size();}
    public List<WebElement> getAmountOfProductsInSearchWithFiltersPageList () {
        return amountOfProductsInSearchWithFiltersPageListText; }

    public void userClicksWishlistOnFirstProduct() { clicksWishlistOnFirstProduct.click(); }
    public void userClicksWishlistOnSecondProduct() { clicksWishlistOnSecondProduct.click(); }
    public void userClicksOnWishlist() { wishlistIcon.click(); }
    public void userClicksOnFirstProduct() { firstProduct.click(); }
    public void userClicksOnSecondProduct() {  secondProduct.click(); }

}
