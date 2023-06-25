Feature: As a user i want to create a new data hotel

  @CreateHotel
  Scenario: as user i want to create a new data hotel
    Given user on login page
    When user input email
    And user input password
    And user click login
    And user on dashboard
    And user click Daftar Hotel menu
    And user click button Tambah Hotel
    And user click Tambahkan Hotel
    And user upload image Hotel
    And user input Nama Hotel
    And user chosee Kelas Hotel
    And user input Deskripsi Hotel
    And user input Nomor Telepon
    And user input Email Hotel
    And user input Alamat Hotel
    And user click Tambahkan Fasilitas
    And user input Nama Fasilitas
    And user click tab Kebijakan Hotel
    And user click tab Daftar Kamar
    And user click Tambah Kamar
    And user upload image Kamar
    And user input Nama Kamar
    And user input Ukuran Kamar
    And user input Jumlah Kamar
    And user input Deskripsi Kamar
    And user click Tambah Fasilitas Kamar
    And user input nama fasilitas kamar
    And user click tab Penawaran Kamar
    And user input Harga Kamar Malam
    And user choose Jumlah Tamu
    And user choose Tipe Kasur
    And user click Tambah data Kamar
    And user click Simpan button
    And user click Simpan Data Hotel
    And user click Simpan
    Then data hotel success created and user see hotel page

