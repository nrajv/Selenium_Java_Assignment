package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Library {
    WebDriver driver = null ;

    public Library(WebDriver driver) {
        this.driver = driver;
    }

    public Library() {

    }

    public WebDriver openBrowser() {
        driver = new ChromeDriver();
        return driver;
    }

    public void navigateToUrl(WebDriver driver, String url) {
        driver.navigate().to(url);
        driver.manage().window().maximize();
    }

    public void clickOnElement(WebDriver driver, By loc) {
        getElement(driver, loc).click();
    }

    private WebElement getElement(WebDriver driver, By loc) {
        return driver.findElement(loc);
    }

    public void setText(WebDriver driver, By loc, String msg) {
        getElement(driver,loc).sendKeys(msg);
    }

    public void selectOption(WebDriver driver, By loc, int i) {
        Select sel = new Select(getElement(driver,loc));
        sel.selectByIndex(i);
    }
    public void selectOption(WebDriver driver, By loc, String val) {
        Select sel = new Select(getElement(driver,loc));
        sel.selectByValue(val);
    }
}
