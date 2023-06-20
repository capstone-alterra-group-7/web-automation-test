Feature: As a user i want to create a new user

  @CreateUSer
  Scenario: as user i want to create a new user
    Given user on login page
    When user input email
    And user input password
    And user click login
    And user on dashboard
    And user click Pengguna menu
    And user click button Tambah Pengguna
    And user click Iya, Tambahkan Pengguna
    And user click Keaktifan Pengguna
    And user input Email
    And user input Password
    And user input Konfirmasi Password
    And user input Nama Pengguna
    And user input Tanggal Lahir
    And user input Nomor Handphone
    And user click Simpan Pengguna
    And user click Iya, Simpan Data
