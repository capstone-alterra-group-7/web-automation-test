Feature: as a admin, i want cek all information about station

  @DaftarStation
    Scenario: as admin  i want create a new station
    Given admin input admin username
    When admin input admin password
    And click masuk for admin
    And klik stasiun
    And klik tambah stasiun
    And klik tambahkan
    And tambahkan nama stasiun
    And tambahkan kode stasiun
    And tambahkan domisili
    And Klik tambah data stasiun
    And klik simpan
    Then Data stasiun terbaru berhasil ditambahkan

