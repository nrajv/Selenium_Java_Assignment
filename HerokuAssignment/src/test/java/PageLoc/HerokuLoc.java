package PageLoc;

import org.openqa.selenium.By;

public interface HerokuLoc {

    //signUp locators

    public By SignUpButton = By.xpath("//a[text()='Sign up']");
    public By FirName = By.id("first_name");
    public By LastNAme = By.id("last_name");
    public By EmailAdd = By.id("email");
    public By CompName = By.id("company");
    public By Role = By.id("role");
    public By Country = By.id("self_declared_country");
    public By DevLang = By.id("main_programming_language");
    public By CreateAcc = By.xpath("//input[@name='commit']");

    // login locators

    public By LoginButton = By.xpath("//a[text()='Log in']");
    public By Email = By.id("email");
    public By PassWord = By.id("password");
    public By LogInButton = By.xpath("//button[normalize-space()='Log In']");

}
