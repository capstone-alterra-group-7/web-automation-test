Feature: As a admin i want to see detail transaction KA order

  @seedetailpesananKA
  Scenario: as admin i want to see detail transaction KA order
    Given user on login page to see detail transaction hotel order
    When user input email to see detail transaction hotel order
    And user input password to detail transaction hotel order
    And user click login button to see detail transaction hotel order
    And user on dashboard to see detail transaction hotel order
    And user click menu Pesanan KA
    And user on Pesanan KA page
    And waiting data pesanan KA
    And user click data Pesanan KA
    Then user can see Detail Pesanan KA Page
