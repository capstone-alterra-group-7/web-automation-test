Feature: As a user i want to success edit data KA

  @EditKA-EditNamaKereta
  Scenario: as user i want to edit Nama Kereta Api
    Given user on login page
    When user input email
    And user input password
    And user click login
    And user on dashboard
    And user click Kereta Api menu
    And user click data KA status active
    And user click button Ubah KA
    And user click Ubah
    And user edit Nama Kereta Api
    And user click Simpan Perubahan KA
    And user click Simpan Perubahan
    Then user can see daftar KA page

  @EditKA-EditTambahRutePerjalanan
  Scenario: as user i want to edit data KA
    Given user on login page
    When user input email
    And user input password
    And user click login
    And user on dashboard
    And user click Kereta Api menu
    And user click data KA status active
    And user click button Ubah KA
    And user click Ubah
    And user click Tambah Rute
    And user chosee Pilih Perjalanan
    And user click Tambahkan
    And user input Jam Tiba
    And user click Simpan Perubahan KA
    And user click Simpan Perubahan
    Then user can see daftar KA page