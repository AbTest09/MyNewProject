Feature: Login with Valid Credentials


Scenario: Successful Login with Valid Credentials

    Given User Launch browser
    And opens URL "https://tutorialsninja.com/demo/"
    When User navigate to MyAccount menu
    And click on Login
    And Email "demo.abhinav@gmail.com" and password "Demo@1234"
    And Click on Login button
    Then User navigates to MyAccount Page