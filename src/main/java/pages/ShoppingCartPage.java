package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage {

    @FindBy(xpath = "//h2[@class='empty-bag-title']")
    private WebElement cartEmptinessMassage;

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    public boolean isCartEmptinessMassage () { return cartEmptinessMassage.isDisplayed(); }
    public WebElement getCartEmptinessMassage () {return cartEmptinessMassage;}
}
