package PageMethods;

import PageLocators.PageLoc;
import Utils.Library;
import org.openqa.selenium.WebDriver;

public class PageMethods implements PageLoc {
    Library lib = null;
    public PageMethods(WebDriver driver) {
        lib = new Library(driver);
    }

    public void searchOnGoogle(String val) {
        lib.setText(SearchBox,val);
    }

    public void clickOnSearch() {
        lib.clickOnElement(SearchButton);
    }

    public void getCurrentShare() {
        System.out.println("Current BPCL Share price --> "+lib.getText(CurrentShare));
    }

    public void get52_wk_HighPrice() {
        System.out.println("52 week high price -->  "+lib.getText(High));
    }

    public void get52_wk_LowPrice() {
        System.out.println("52 week Low price -->  "+lib.getText(Low));
    }
}
