package PageMetheds;

import PageLoc.AmazonLoc;
import Utils.Library;
import org.openqa.selenium.WebDriver;

public class PageMethod implements AmazonLoc {

    Library lib =null;

    public PageMethod(WebDriver driver) {

        lib = new Library(driver);

    }

    public void clickOnSignIn() {
        lib.mouseHover(SignIn);
        lib.clickOnElement(SignInButton);
    }

    public void enterEmailOrPhoneNo(String no) {
        lib.setText(EmailBox, no);
    }

    public void clickOnContinue() {
        lib.clickOnElement(ContinueButton);
    }

    public void enterPassword(String wrongPassword) {
        lib.setText(PasswordBox,wrongPassword);
    }

    public void clickOnSignInOne() {
        lib.clickOnElement(SignInClick);
    }
}
