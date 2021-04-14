package Tests;

import PageMethods.PageMethods;
import Utils.Library;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DarwinWorkflow {

    WebDriver driver = null;
    Library lib = new Library();

    @BeforeSuite
    public void setUp(){
        this.driver = lib.openBrowser();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }

    @Test
    public void attendance() throws InterruptedException {
        PageMethods method = new PageMethods(driver);
       lib.navigateToUrl("https://zenq.darwinbox.in/user/login");


       method.enterEmployeeId("2455");
//       method.enterPassword("");
        Thread.sleep(10000); // for to enter password
        method.selectAttendance(3);
       method.clickOnSignIn();

       method.clickOnApply();

       method.selectRequestType();
       method.selectReason();
       method.pickFromDate();
       method.pickToDate();
       method.selectLocation();
       method.enterMessage("");

       method.clickOnSubmit();

    }


    @AfterSuite
    public void shutDown(){
        driver.close();
    }
}
