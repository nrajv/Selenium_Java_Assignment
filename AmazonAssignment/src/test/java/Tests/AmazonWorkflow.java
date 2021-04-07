package Tests;

import PageMetheds.PageMethod;
import Utils.Library;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AmazonWorkflow {

    WebDriver driver = null;
    Library lib = new Library();

    @BeforeSuite
    public void setUp(){
        this.driver = lib.openBrowser();
    }

    @Test
    public void amazonProduct()
    {
        lib.navigateToUrl("https://www.amazon.in/");

        PageMethod pageMethodObj = new PageMethod(driver);

        pageMethodObj.clickOnSignIn();
        pageMethodObj.enterEmailOrPhoneNo("7899247646");
        pageMethodObj.clickOnContinue();
        pageMethodObj.enterPassword("wrongPassword");
        pageMethodObj.clickOnSignInOne();

    }

    @AfterSuite
    public void tearDown()
    {
        driver.close();
    }
}
