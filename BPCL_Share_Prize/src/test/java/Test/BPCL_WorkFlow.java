package Test;

import PageMethods.PageMethods;
import Utils.Library;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BPCL_WorkFlow {
    Library lib = new Library();
    WebDriver driver = null;

    @BeforeSuite
    public void setUp()
    {
        this.driver = lib.launchBrowser();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test
    public void googleSearch()
    {
        PageMethods methods = new PageMethods(driver);
        lib.navigateToUrl("https://www.google.com/");

        methods.searchOnGoogle("BPCL share price");
        methods.clickOnSearch();
        methods.getCurrentShare();
        methods.get52_wk_HighPrice();
        methods.get52_wk_LowPrice();
    }

}
