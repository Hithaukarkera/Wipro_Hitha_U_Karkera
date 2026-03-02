Feature: Login Functionality

  Scenario: Login using Data Table
    Given User is on login page
    When User enters credentials
      | admin  | admin123 |
      | user1  | pass123  |
    Then User should see login result