package PageMethods;

import PageLoc.PageLocators;
import Utils.Library;
import org.openqa.selenium.WebDriver;


public class PageMethods implements PageLocators {

    Library lib = null;


    public PageMethods(WebDriver driver) {
        lib = new Library(driver);
    }

    public void clickOnIcon() {
        lib.clickOnElement(Icon);
    }

    public void clickOnLoginRegiterButton() {
        lib.clickOnElement(LoginOrRegister);
    }

    public void clickOnRegister() {
        lib.clickOnElement(Register);
    }

    public void enterName(String my_name) {
        lib.setText(Name,my_name);
    }

    public void enterEmail(String s) {
        lib.setText(Email,s);
    }

    public void enterPassword(String s) {
        lib.setText(PassWord,s);
    }

    public void enterMobNo(String s) {
        lib.setText(Phone,s);
    }

    public void clickOnRegisterButton() {
        lib.clickOnElement(RegisterButton);
    }
}
