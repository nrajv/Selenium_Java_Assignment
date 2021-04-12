package PageLoc;

import org.openqa.selenium.By;

public interface PageLocators {
    public By Icon = By.xpath("//i[@class='iconS ham-Icon']");
    public By LoginOrRegister = By.xpath("//a[normalize-space()='Login / Register']");
    public By Register = By.xpath("//a[normalize-space()='Register']");
    public By Name = By.xpath("//input[@name='name']");
    public By Email = By.xpath("//input[@name='email']");
    public By PassWord = By.xpath("//input[@name='password']");
    public By Phone = By.xpath("//input[@id='mobileNumberField']");
    public By RegisterButton = By.xpath("//a[@class='component__loginRegiterBtn component__ripple component__colorWhite']");


}
