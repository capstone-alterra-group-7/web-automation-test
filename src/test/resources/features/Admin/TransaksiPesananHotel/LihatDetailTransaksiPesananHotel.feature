Feature: As a admin i want to see detail transaction hotel order

  @seedetailpesananhotel
  Scenario: as admin i want to see detail transaction hotel order
    Given user on login page to see detail transaction hotel order
    When user input email to see detail transaction hotel order
    And user input password to detail transaction hotel order
    And user click login button to see detail transaction hotel order
    And user on dashboard to see detail transaction hotel order
    And user click menu Pesanan Hotel
    And user on Pesanan Hotel page
    And user click data Pesanan Hotel
    Then user can see Detail Pesanan Hotel Page
