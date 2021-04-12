package Tests;

import PageMethods.PageMethods;
import Utils.Library;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WorkFlow {
    WebDriver driver = null;
    Library lib = new Library();

    @BeforeSuite
    public void setUp(){
        this.driver = lib.openBrowser();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test
    public void registerPage(){
        lib.navigateToUrl("https://www.99acres.com/");

        PageMethods methods = new PageMethods(driver);

        methods.clickOnIcon();
        methods.clickOnLoginRegiterButton();
        methods.clickOnRegister();
        methods.enterName("My Name");
        methods.enterEmail("MyEmailId@dummy.com");
        methods.enterPassword("*123455ASfggf#");
        methods.enterMobNo("1234567891");
        methods.clickOnRegisterButton();

        System.out.println("Successfully Registered");
    }

    @AfterSuite
    public void shutDown(){
        driver.close();
    }
}
