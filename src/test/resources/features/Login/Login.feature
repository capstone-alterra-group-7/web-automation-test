Feature: As a admin i can login so that i can see dashboard page

  @Login
  Scenario: as admin i can login so that i can see dashboard page
    Given user on login page
    When user input email
    And user input password
    And user click login button
    And user on dashboard
