Feature: Login functionality

  Scenario: Login with multiple credentials

    Given User is on login page
    When User enters credentials
      | student  | Password123 |
      | wrong    | wrongpass   |
    Then User should see login result