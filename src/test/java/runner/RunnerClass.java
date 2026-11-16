package runner;

//import com.base.Base_class;
import com.base.Base_class1;
import pageobjectmanager.PageObjectManager;

public class RunnerClass extends Base_class1 {
    public static void main(String[] args) throws InterruptedException {
        launchBrowser(PageObjectManager.getPageObjectManager().getFileReaderManager().getProperty("browser"));
        launchUrl(PageObjectManager.getPageObjectManager().getFileReaderManager().getProperty("url"));
        PageObjectManager.getPageObjectManager().getLoginPage().validLogin();
       PageObjectManager.getPageObjectManager().getSearchPage().searchPage();
       PageObjectManager.getPageObjectManager().getCartPage().cartPage();

    }
}
