package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeliveryAndReturnsPage extends BasePage {

    @FindBy(xpath = "//a[@class='dr-tabs_tab is-active']")
    private WebElement deliveryTab;
    @FindBy(xpath = "//a[@class='dr-tabs_tab ']")
    private WebElement returnsTab;
    @FindBy(xpath = "//article[@data-optionid='1']")
    private WebElement standardDeliveryInfoBar;
    @FindBy(xpath = "//article[@data-optionid='5']")
    private WebElement expressDeliveryInfoBar;
    @FindBy (xpath = "//a[text()='Download Returns.pdf']")
    private WebElement downloadReturnsPdfInfo;

    public DeliveryAndReturnsPage (WebDriver driver) { super(driver); }

    public boolean userChecksDeliveryTabVisibility () { return deliveryTab.isDisplayed();}
    public boolean userChecksReturnsTabVisibility() { return returnsTab.isDisplayed();  }
    public void userChecksStandardDeliveryInfoBarVisibility() { standardDeliveryInfoBar.isDisplayed();}
    public void userChecksExpressDeliveryInfoBarVisibility() { expressDeliveryInfoBar.isDisplayed(); }
    public void userClicksOnReturnsTab() {  returnsTab.click(); }
    public boolean userChecksDownloadReturnsPdfInfoVisibility() {  return downloadReturnsPdfInfo.isDisplayed(); }
}
