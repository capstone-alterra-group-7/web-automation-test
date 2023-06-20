Feature: As a user i want to edit user

  @EditUSer
  Scenario: as user i want to edit user
    Given user on login page
    When user input email
    And user input password
    And user click login
    And user on dashboard
    And user click Pengguna menu
    And user click button Data Pengguna
    And user on Detail Pengguna
    And user click Edit Pengguna
    And user edit Email
    And user edit Password
    And user edit Konfirmasi Password
    And user edit Nama Pengguna
    And user edit Tanggal Lahir
    And user edit Nomor Handphone
    And user click Simpan Pengguna
    And user click Iya, Simpan Data
