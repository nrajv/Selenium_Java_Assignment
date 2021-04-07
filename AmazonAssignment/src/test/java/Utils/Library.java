package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

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

    public WebElement getElement(By loc){
        return driver.findElement(loc);
    }

    public void navigateToUrl(String url) {
        driver.navigate().to(url);
        driver.manage().window().maximize();
    }

    public void mouseHover(By loc) {
        Actions act = new Actions(driver);
        act.moveToElement(getElement(loc)).build().perform();
    }

    public void clickOnElement(By signInButton) {
        getElement(signInButton).click();
    }

    public void setText(By emailBox, String txt) {
        getElement(emailBox).sendKeys(txt);
    }
}