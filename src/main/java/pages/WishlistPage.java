package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WishlistPage extends BasePage {

    @FindBy (xpath = "//section[@class='productTiles_140vM']//div[contains(@class,'customerItemsProduct')]")
    private List<WebElement> getAmountOfProductsInWishlistListText;

    //@FindBy (xpath = "//img[@src='//images.asos-media.com/products/naanaa-pu-trench-coat-in-black/201140405-1-black?$n_480w$&wid=476&fit=constrain']")
    @FindBy (xpath = "//div[@class='productImageWrapper_2_b9d']")
    private WebElement firstProductImage;
    @FindBy (xpath = "//button[@class='deleteButton_2paeG deleteButton_19vSt']")
    private WebElement deleteFromWishlistButtonFirstProduct;

    @FindBy (xpath = "//h2[@class='noItemsPrompt_25w6n']")
    private WebElement emptyWishlistMassage;

    @FindBy(xpath = "//span[@class='noItemsIcon_24gx4 unrecognisedIcon_1dBi0']")
    private WebElement noItemIcon;

    public WishlistPage (WebDriver driver) {
        super(driver);
    }

    public int getAmountOfProductsInWishlistCount() { return getAmountOfProductsInWishlistList().size();}
    public List<WebElement> getAmountOfProductsInWishlistList() { return getAmountOfProductsInWishlistListText; }
    public WebElement getFirstProductImage () {return firstProductImage;}
    public void userClicksOnDeleteFromWishlistButtonFirstProduct() { deleteFromWishlistButtonFirstProduct.click(); }

    public boolean userChecksThatWishlistIsEmpty() { return emptyWishlistMassage.isDisplayed();  }
    public WebElement getNoItemIcon () {return noItemIcon;}

}
