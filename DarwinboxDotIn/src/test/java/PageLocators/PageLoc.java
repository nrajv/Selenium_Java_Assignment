package PageLocators;

import org.openqa.selenium.By;

public interface PageLoc {
    public By EmpId = By.id("UserLogin_username");
    public By Pass = By.id("UserLogin_password");
    public By SignIn = By.id("login-submit");
    public By Attendance = By.id("UserLogin_redirectpage");
    public By AttendanceIcon = By.xpath("//a[@href='/attendance']//div[@class='module-icon-wrapper']//img");
    public By ApplyButton = By.id("attendance_request");

    public By RequestType = By.xpath("(//input[@class='search'])[1]");
    public By SelectReq = By.xpath("(//div[text() = 'Attendance Request'])[1]");
    public By Reason = By.xpath("(//input[@class='search'])[2]");
    public By SelectReason = By.xpath("(//div[text()='Working From Home'])[1]");
    public By FromDate = By.id("punchin-date");
    public By PickFromDate = By.xpath("//a[text()='7']");
    public By ToDate = By.id("punchin-date-to");
    public By PickToDate = By.xpath("//a[text()='8']");
    public By Location = By.xpath("(//input[@class='search'])[3]");
    public By PickLoc = By.xpath("//div[text() ='Home']");
    public By Message = By.id("AttendanceRequestForm_message");
    public By Submit = By.id("add_request_btn");

}
