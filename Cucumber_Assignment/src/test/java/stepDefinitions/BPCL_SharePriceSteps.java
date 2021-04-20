package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BPCL_SharePriceSteps {
    WebDriver driver = null;

    public By SearchBox = By.name("q");
    public By SearchButton = By.name("btnK");
    public By CurrentShare = By.xpath("//span[@class='IsqQVc NprOob XcVN5d wT3VGc']");
    public By High = By.xpath("(//td[@class='iyjjgb'])[8]");
    public By Low = By.xpath("(//td[@class='iyjjgb'])[9]");

    @Given("I launch Chrome browser")
    public void i_launch_chrome_browser() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Then("I print the current Share price")
    public void i_print_the_current_share_price() {
        System.out.println("Current BPCL Share price --> "+driver.findElement(CurrentShare).getText());
    }

    @Then("I print the '52' week High Share price")
    public void i_print_the_week_high_share_price() {
        System.out.println("52 week high price -->  "+driver.findElement(High).getText());
    }

    @Then("I print the '52' week Low Share price")
    public void i_print_the_week_low_share_price() {
        System.out.println("52 week Low price -->  "driver.findElement(Low).getText());
    }

    @Then("close the browser")
    public void close_the_browser() {
        driver.close();
    }

    @When("I open Google home page")
    public void iOpenGoogleHomePage() {
        driver.navigate().to("https://www.google.com/");
    }

    @When("I enter {string} in Google search box")
    public void iEnterInGoogleSearchBox(String val) {
        driver.findElement(SearchBox).sendKeys(val);
        driver.findElement(SearchButton).click();

    }
}
