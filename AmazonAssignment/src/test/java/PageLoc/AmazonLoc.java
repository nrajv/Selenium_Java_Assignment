package PageLoc;

import org.openqa.selenium.By;

public interface AmazonLoc {

    public By SignIn = By.id("nav-link-accountList");
    public By SignInButton = By.xpath("(//span[text()='Sign in'])[1]");
    public By EmailBox = By.id("ap_email");
    public By ContinueButton = By.id("continue");
    public By PasswordBox = By.id("ap_password");
    public By SignInClick = By.id("signInSubmit");


}
