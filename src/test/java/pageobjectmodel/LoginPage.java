package pageobjectmodel;
import com.base.Base_class1;
import interfaceelements.LoginInterfaceElements;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjectmanager.PageObjectManager;

import java.time.Duration;
import java.time.Instant;

//import static com.base.Alert_BaseClass.driver;
//import static com.base.Base_class.passInput;

public class LoginPage extends Base_class1 implements LoginInterfaceElements {
    @FindBy(xpath = loginXpath)
    private static WebElement login;
    @FindBy(css = username_css)
    private static WebElement username;
    @FindBy(xpath=password_xpath)
    private static WebElement password;
    @FindBy(xpath = signin_xpath)
    private static WebElement signin;
    @FindBy(id = title_id)
    private static WebElement title;
   // private static Object
    // wait;

    public LoginPage() {
        PageFactory.initElements(driver, this);

    }
    public static void validLogin()  throws InterruptedException{
        elementClick(login);
        waitForElementClickable(username);
        Thread.sleep(3000);
       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
     //   wait.until(ExpectedConditions.elementToBeClickable(username));
        passInput(username, PageObjectManager.getPageObjectManager().getFileReaderManager().getProperty("username"));
      waitForElementClickable(password);
      //Thread.sleep(10000);

        passInput(password,PageObjectManager.getPageObjectManager().getFileReaderManager().getProperty("password"));
        System.out.println("[" + username +"] ["+ password + "]");
        elementClick(signin);
        waitForElementClickable(title);
        //Thread.sleep(5000);
        getText(title);
    }
}


