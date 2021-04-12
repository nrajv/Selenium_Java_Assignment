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

    public WebDriver openBrowser() {
        this.driver = new ChromeDriver();
        return driver;
    }

    public void navigateToUrl(String s) {
        driver.navigate().to(s);
        driver.manage().window().maximize();
    }

    public void clickOnElement(By loc) {
        getElement(loc).click();
    }

    private WebElement getElement(By loc) {
        return driver.findElement(loc);
    }

    public void setText(By loc, String mess) {
        getElement(loc).sendKeys(mess);
    }
}
