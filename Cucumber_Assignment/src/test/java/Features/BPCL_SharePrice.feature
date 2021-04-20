Feature: BPCL Share Price Details

  Background:
    Given I launch Chrome browser
    When I open Google home page

  Scenario: Get the Share Price
    When I enter "BPCL Share Price" in Google search box
    Then I print the current Share price
    And I print the '52' week High Share price
    And I print the '52' week Low Share price
    And close the browser

  Scenario: Regularize the DarwinBox attendance
    When I navigate to url "https://zenq.darwinbox.in/user/login"
    And I enter Emp Id  as "2455"
    And I enter password as "*7899#Zabiulla"
    And Select a DashBoard as "Attendance"
    And I click on SignIn button
    And I click on Apply button
    And I select Request type as "Attendance Request"
    And I select Reason for attendance request as "Working From Home"
    And I pick Shift date From
    And I pick Shift date TO
    And I select a location as "Home"
    And I enter "" message in Message area box
    And I click on submit
