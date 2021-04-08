package PageMethods;

import PageLoc.HerokuLoc;
import Utils.Library;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HerokuMethods implements HerokuLoc {
    WebDriver driver = null;
    Library lib;
    public HerokuMethods(WebDriver driver) {
        this.lib = new Library(driver);
        this.driver = driver;
    }

    public void clickOnSignUp() {
        lib.clickOnElement(driver,SignUpButton);
    }

    public void enterFirstName(String fname) {
        lib.setText(driver,FirName,fname);
    }

    public void enterLastName(String lname) {
        lib.setText(driver,LastNAme,lname);
    }

    public void enterEmailAdd(String s) {
        lib.setText(driver,EmailAdd,s);
    }

    public void compName(String com) {
        lib.setText(driver,CompName,com);
    }


    public void selectRole(int i) {
        lib.selectOption(driver,Role,i);
    }

    public void selectCountry(String cou) {
        lib.selectOption(driver,Country,cou);
    }

    public void selectDevLang(int lang) {
        lib.selectOption(driver,DevLang,lang);
    }

    public void clickOnCreateAcc() {
        lib.clickOnElement(driver,CreateAcc);
    }

    public void clickOnLogin() {
        lib.clickOnElement(driver,LoginButton);
    }

    public void enterEmail(String s) {
        lib.setText(driver,Email,s);
    }

    public void enterPassWord(String pass) {
        lib.setText(driver,PassWord,pass);
    }

    public void clickOnLog() {
        lib.clickOnElement(driver,LogInButton);
    }
}
