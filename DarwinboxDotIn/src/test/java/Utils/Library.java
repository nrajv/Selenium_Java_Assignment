package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Library {

    WebDriver driver = null;

    public Library(WebDriver driver) {
        this.driver = driver;
    }

    public Library() {

    }

    public WebDriver openBrowser() {
        driver = new ChromeDriver();
        return driver;
    }

    public void navigateToUrl(String s) {
        driver.navigate().to(s);
        driver.manage().window().maximize();
    }

    public void setTextOnElement(By loc, String s) {
        getElement(loc).sendKeys(s);
    }

    private WebElement getElement(By loc) {
        return driver.findElement(loc);
    }


    public void clickOnElement(By loc) {
        getElement(loc).click();
    }

    public void dropDownSelect(By attendance, int no) {
        Select sel = new Select(getElement(attendance));
        System.out.println("s2");
        sel.selectByIndex(no);
    }

    public void switchToFrame(int i) {
        driver.switchTo().frame(i);
    }
}
