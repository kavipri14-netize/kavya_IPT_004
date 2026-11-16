package pageobjectmodel;

import com.base.Base_class1;
import interfaceelements.CartInterfaceElements;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends Base_class1 implements CartInterfaceElements {
 @FindBy (xpath =CartInterfaceElements.cartlinktext)
    private WebElement cartLink;
    public CartPage() {
        PageFactory.initElements(driver, this);
    }
    public void cartPage(){
        elementClick(cartLink);
        waitForElementClickable(cartLink);
    }
}
