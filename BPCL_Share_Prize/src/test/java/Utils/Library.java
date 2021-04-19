package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Library {
    WebDriver driver = null;

    public Library(WebDriver driver) {
        this.driver = driver;
    }

    public Library() {

    }

    public WebDriver launchBrowser() {
        driver = new ChromeDriver();
        return driver;
    }

    public void navigateToUrl(String s) {
        driver.navigate().to(s);
    }

    public void setText(By loc, String val) {
        getElement(loc).sendKeys(val);
    }

    private WebElement getElement(By loc) {
        return driver.findElement(loc);
    }

    public void clickOnElement(By loc) {
        getElement(loc).click();
    }

    public String getText(By loc) {
        return getElement(loc).getText();
    }
}
