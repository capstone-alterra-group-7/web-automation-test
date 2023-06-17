@DaftarKA
Feature: As a admin i want to see ticket of KA

  @seedaftarka
  Scenario: as admin i want to see list of ticket ka
    Given user on login page to see ticket ka
    When user input email to see ticket ka
    And user input password to see ticket ka
    And user click login to see ticket ka
    And user on dashboard to see ticket ka
    And user click tiket kereta api to see ticket ka
    Then user on tiket kereta api page to see ticket ka

  @seedaftarkaandsearchticket
  Scenario: as admin i want to see list of ticket ka and search ticket
    Given user on login page to see ticket ka2
    When user input email to see ticket ka2
    And user input password to see ticket ka2
    And user click login to see ticket ka2
    And user on dashboard to see ticket ka2
    And user click tiket kereta api to see ticket ka2
    And user on tiket kereta api page to see ticket ka2
    And user click search field and input name of ticket to see ticket ka2
    Then user can see ticket ka2

  @seeticketwithtanggaldarihinggaka
  Scenario: as admin i want to see list of ticket ka with date filter
    Given user on login page to see ticket ka3
    When user input email to see ticket ka3
    And user input password to see ticket ka3
    And user click login to see ticket ka3
    And user on dashboard to see ticket ka3
    And user click tiket kereta api to see ticket ka3
    And user on tiket kereta api page to see ticket ka3
    And user input date from filter to see ticket ka3
    And user input up to date filter to see ticket ka3
    Then users can see the tickets they are looking for based on the date filter

  @seeticketwithfiltersortabjadka
  Scenario: as admin i want to see list of ticket ka with date filter
    Given user on login page to see ticket ka4
    When user input email to see ticket ka4
    And user input password to see ticket ka4
    And user click login to see ticket ka4
    And user on dashboard to see ticket ka4
    And user click tiket kereta api to see ticket ka4
    And user on tiket kereta api page to see ticket ka4
    When user choose filter sort A - Z to see ticket ka4
    Then user can see the result of filter sort A -Z
    When user choose filter sort Z - A to see ticket ka4
    Then user can see the result of filter sort Z - A

  @seeticketwithfilterunpaid
  Scenario: as admin i want to see ticket with unpaid filter
    Given user on login page to see ticket ka5
    When user input email to see ticket ka5
    And user input password to see ticket ka5
    And user click login to see ticket ka5
    And user on dashboard to see ticket ka5
    And user click tiket kereta api to see ticket ka5
    And user on tiket kereta api page to see ticket ka5
    And user click and choose filter to see ticket ka5
    Then user can see the result of filter

