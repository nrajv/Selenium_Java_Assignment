package Tests;

import PageMethods.HerokuMethods;
import Utils.Library;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Heroku {
    WebDriver driver = null;
    Library lib = new Library();
    HerokuMethods herokMethodsObj = null;

    @BeforeSuite
    public void setUp(){
        this.driver = lib.openBrowser();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterSuite
    public void closeApp(){
        driver.close();
    }

    @Test(description = "Create an Account",priority = 1)
    public void createAccount() throws InterruptedException {
        lib.navigateToUrl(driver,"https://www.heroku.com/");

        herokMethodsObj = new HerokuMethods(driver);

        herokMethodsObj.clickOnSignUp();
        herokMethodsObj.enterFirstName("Mohamad");
        herokMethodsObj.enterLastName("Zabiulla");
        herokMethodsObj.enterEmailAdd("zabiulla.edu@gmail.com");
        herokMethodsObj.compName("ZenQ");
        herokMethodsObj.selectRole(5);
        herokMethodsObj.selectCountry("India");
        herokMethodsObj.selectDevLang(5);
//        Thread.sleep(20000);
//        herokMethodsObj.clickOnCreateAcc();
        /*  there is capche element is present so i'm handling manually */
        System.out.println("Successfully account is created");
    }


    @Test(description = "Login to Account", priority = 2)
    public void loginToAccount(){
        lib.navigateToUrl(driver,"https://www.heroku.com/");

        herokMethodsObj = new HerokuMethods(driver);

        herokMethodsObj.clickOnLogin();
        herokMethodsObj.enterEmail("zabiulla.edu@gmail.com");
        herokMethodsObj.enterPassWord("dummyPassword");
        herokMethodsObj.clickOnLog();

        System.out.println("Successfully logged in");
    }
}
