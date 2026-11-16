package pageobjectmanager;

import pageobjectmodel.CartPage;
import pageobjectmodel.LoginPage;
import pageobjectmodel.SearchPage;
import utility.FileReaderManager;

public  class PageObjectManager {
    private FileReaderManager fileReaderManager;
    private static PageObjectManager pageObjectManager;
    private LoginPage loginPage;
    private SearchPage searchPage;
    private CartPage cartPage;

    public FileReaderManager getFileReaderManager() {
        if(fileReaderManager==null){
            fileReaderManager=new FileReaderManager();
        }
        return fileReaderManager;
    }

    public static PageObjectManager getPageObjectManager() {
        if(pageObjectManager==null){
            pageObjectManager=new PageObjectManager();
        }
        return pageObjectManager;
    }

    public LoginPage getLoginPage() {
        if(loginPage==null){
            loginPage=new LoginPage();
        }
        return loginPage;
    }

    public SearchPage getSearchPage() {
        if(searchPage==null){
    searchPage=new SearchPage();
        }
        return searchPage;
    }
    public CartPage getCartPage(){
        if(cartPage==null){
            cartPage= new CartPage();
        }
        return cartPage;
    }
}

