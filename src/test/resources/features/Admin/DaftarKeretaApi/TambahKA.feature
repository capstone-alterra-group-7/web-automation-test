@TambahKA
Feature: As a user i want to add a new KA

  @TambahKAALL
  Scenario: as user i want to adding KA data with complete data
    Given user on login page2
    When user input email2
    And user input password2
    And user click login2
    And user on dashboard2
    And user click Kereta Api menu2
    And user click tambah KA2
    And user set active KA2
    And user input name of KA2
    And User set rute2
    And User set arrived time of KA2
    And User set price
    And User add Gerbong and input name of gerbong
    And User save a new KA
    Then User has succesfully save a New KA and Return to Menu Daftar KA

  @TambahKAwithoutInputTrainName
  Scenario: Add train data by leaving the Train name field blank
    Given user on login page3
    When user input email3
    And user input password3
    And user click login3
    And user on dashboard3
    And user click Kereta Api menu3
    And user click tambah KA3
    And user set active KA3
    And user input blank name of KA3
    And User set rute3
    And User set arrived time of KA3
    And User cant click Lanjutkan Button
    Then User stay on Tambah KA Menu Dashboard

  @TambahKAwithoutInputTicketPrice
  Scenario: as user i want to adding KA data without input Ticket Price
    Given user on login page4
    When user input email4
    And user input password4
    And user click login4
    And user on dashboard4
    And user click Kereta Api menu4
    And user click tambah KA4
    And user set active KA4
    And user input name of KA4
    And User set rute4
    And User set arrived time of KA4
    And User set blank price4
    And User cant choose gerbong because blank price4
    Then User stay on Tambah KA Menu Dashboard4

  @TambahKAwithoutChooseTrainStationDestination
  Scenario: as user i want to adding KA data without choose train station destination
    Given user on login page5
    When user input email5
    And user input password5
    And user click login5
    And user on dashboard5
    And user click Kereta Api menu5
    And user click tambah KA5
    And user set active KA5
    And user input name of KA5
    And User not selecting Destination Station5
    Then User cannot go to next step and stay on Tambah KA Menu Dashboard5

  @TambahKAWithoutChooseArrivalTime
  Scenario: as user i want to Add train data by not filling in Arrival Time
    Given user on login page6
    When user input email6
    And user input password6
    And user click login6
    And user on dashboard6
    And user click Kereta Api menu6
    And user click tambah KA6
    And user set active KA6
    And user input name of KA6
    And User set rute6
    And User not filling in Arrival Time of new KA6
    Then User cannot go to next step and stay on Tambah KA Menu Dashboard6

  @TambahInactiveKA
  Scenario: as user i want to adding Inactive KA data with complete data
    Given user on login page7
    When user input email7
    And user input password7
    And user click login7
    And user on dashboard7
    And user click Kereta Api menu7
    And user click tambah KA7
    And user set active KA7
    And user input name of KA7
    And User set rute7
    And User set arrived time of KA7
    And User set price7
    And User add Gerbong and input name of gerbong7
    And User save a new KA7
    And User has succesfully save a New KA and Return to Menu Daftar KA7
    And User can see the newly added ka data in the list of inactive train7