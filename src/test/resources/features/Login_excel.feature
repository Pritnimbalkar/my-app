Feature: Login in DemoQA website

  Scenario: Login using Excel data
    Given user is on DemoQA homepage
    When user navigates to login page
    And user enters login credentials from excel
    Then user should see login result
