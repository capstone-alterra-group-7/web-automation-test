Feature: As a user i want to success see detail data KA

  @DaftarKA-Page
  Scenario: as user i want to see Daftar KA Page
    Given user on login page
    When user input email
    And user input password
    And user click login
    And user on dashboard
    And user click Kereta Api menu
    And user click data KA
    Then user see detail KA page