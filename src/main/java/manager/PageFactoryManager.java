package manager;

import org.openqa.selenium.WebDriver;
import pages.*;

public class PageFactoryManager {

    WebDriver driver;

    public PageFactoryManager(WebDriver driver) {
        this.driver = driver;
    }
    public HomePage getHomePage() {
        return new HomePage(driver);
    }
    public SearchResultsPage getSearchResultsPage() {
        return new SearchResultsPage(driver);
    }
    public ProductPage getProductPage() {
        return new ProductPage(driver);
    }
    public WishlistPage getWishlistPage() {
        return new WishlistPage(driver);
    }
    public DeliveryAndReturnsPage getDeliveryAndReturnsPage() { return new DeliveryAndReturnsPage (driver);}
    public ShoppingCartPage getShoppingCartPage () {
        return new ShoppingCartPage(driver);
    }


}
