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

    public void selectRequestType(int i) throws InterruptedException {
//        lib.switchToFrame(0);
//        System.out.println("s1");
//        Thread.sleep(3000);

        lib.dropDownSelect(RequestType,i);
    }

    public void selectReason(int i) {
        lib.dropDownSelect(Reason,i);
    }

    public void selectLocation(int i) {
        lib.dropDownSelect(Location,i);
    }

    public void enterMessage(String s) {
        lib.setTextOnElement(Message,s);
    }

    public void clickOnSubmit() {
        lib.clickOnElement(Submit);
    }
}
