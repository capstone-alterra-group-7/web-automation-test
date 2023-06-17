Feature: As a user i want to success see detail data KA

  @DaftarKA-Page
  Scenario: as user i want to see Daftar KA Page
    Given user on home page
    When user click menu Daftar KA
    And user click data KA on Daftar KA page
    Then user see detail KA page

  @Delete-KA
  Scenario: as admin i want to can delete data kereta api
    Given admin input username
    And admin input password
    And click masuk
    And pilih Kereta Api
    And pilih gerbong
    Then Hapus gerbong


