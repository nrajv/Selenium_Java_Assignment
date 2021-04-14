package PageLocators;

import org.openqa.selenium.By;

public interface PageLoc {
    public By EmpId = By.id("UserLogin_username");
    public By Pass = By.id("UserLogin_password");
    public By SignIn = By.id("login-submit");
    public By Attendance = By.id("UserLogin_redirectpage");
    public By AttendanceIcon = By.xpath("//a[@href='/attendance']//div[@class='module-icon-wrapper']//img");
    public By ApplyButton = By.id("attendance_request");

    public By RequestType = By.xpath("//div[@class='text'][normalize-space()='Attendance Request']");
    public By Reason = By.xpath("//div[@class='ui searchabledropdown db-dropdown search selection active visible']//input[@class='search']");
    public By Location = By.xpath("//div[@class='ui searchabledropdown db-dropdown search selection active visible']//input[@class='search']");
    public By DateFrom = By.id("punchin-date");
    public By DateTo = By.id("punchin-date-to");
    public By Message = By.id("AttendanceRequestForm_message");
    public By Submit = By.id("add_request_btn");



}
