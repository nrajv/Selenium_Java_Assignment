package PageMethods;

import PageLocators.PageLoc;
import Utils.Library;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageMethods implements PageLoc {
    Library lib = null;
    public PageMethods(WebDriver driver) {
        lib = new Library(driver);
    }

    public void enterEmployeeId(String s) {
        lib.setTextOnElement(EmpId,s);
    }

    public void clickOnSignIn() {
        lib.clickOnElement(SignIn);
    }

    public void enterPassword(String s) {
        lib.setTextOnElement(Pass,s);
    }

    public void selectAttendance(int no) {
        lib.dropDownSelect(Attendance,no);
    }

    public void clickOnAttendance() {
        lib.clickOnElement(AttendanceIcon);
    }

    public void clickOnApply() {
        lib.clickOnElement(ApplyButton);
    }

    public void selectRequestType() {
        lib.clickOnElement(RequestType);
        lib.clickOnElement(SelectReq);
    }

    public void selectReason() throws InterruptedException {
        lib.clickOnElement(Reason);
        Thread.sleep(2000);
        lib.clickOnElement(SelectReason);
    }

    public void selectLocation() {
        lib.clickOnElement(Location);
        lib.clickOnElement(PickLoc);
    }

    public void enterMessage(String s) {
        lib.setTextOnElement(Message,s);
    }

    public void clickOnSubmit() {
        lib.clickOnElement(Submit);
    }

    public void pickFromDate() {
        lib.clickOnElement(FromDate);
        lib.clickOnElement(PickFromDate);
    }

    public void pickToDate() {
        lib.clickOnElement(ToDate);
        lib.clickOnElement(PickToDate);
    }
}
