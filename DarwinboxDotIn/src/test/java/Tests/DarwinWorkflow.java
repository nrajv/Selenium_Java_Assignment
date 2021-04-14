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
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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

//       method.clickOnAttendance();
       method.clickOnApply();

//       method.selectRequestType(1);
//       method.selectReason(4);
//       method.selectLocation(0);
       method.enterMessage("");

       method.clickOnSubmit();

    }


    @AfterSuite
    public void shutDown(){
        driver.close();
    }
}
