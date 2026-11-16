package pageobjectmodel;

import com.base.Base_class1;
import interfaceelements.SearchPageInterfaceElements;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.base.Base_class1.getAlertMessage;

public class SearchPage extends Base_class1 implements SearchPageInterfaceElements {
    @FindBy(xpath = SearchPageInterfaceElements.linktext)
    private WebElement searchResultLink;

    @FindBy(xpath = SearchPageInterfaceElements.productlinktext)
    private WebElement productLink;

    @FindBy(xpath = SearchPageInterfaceElements.addtocart_xpath)
    private WebElement addToCartButton;

    public SearchPage() {
        PageFactory.initElements(driver, this);
    }

    public void searchPage() {
        elementClick(searchResultLink);
        waitForElementClickable(searchResultLink);

     //   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       // wait.until(ExpectedConditions.elementToBeClickable(productLink));

        elementClick(productLink);
        waitForElementClickable(addToCartButton);
       // WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
       // wait1.until(ExpectedConditions.elementToBeClickable(addToCartButton));

        elementClick(addToCartButton);
        waitForElementClickable(addToCartButton);
      //  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       // wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
// Handling alert
        waitForAlert();
       String  alertMessage= getAlertMessage();
        System.out.println("Alert message:" +alertMessage);
        acceptAlert();
    }
}
