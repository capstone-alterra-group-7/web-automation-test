package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.pages.Admin.DaftarHotel.TambahDataHotelPage;

public class TambahDataHotelSteps {
    @Steps
    TambahDataHotelPage tambahDataHotelPage;
    @And("user click Daftar Hotel menu")
    public void userClickDaftarHotelMenu() { tambahDataHotelPage.clickMenuDaftarHotel();
    }

    @And("user click button Tambah Hotel")
    public void userClickButtonTambahHotel() { tambahDataHotelPage.clickButtonTambahHotel();
    }

    @And("user click Tambahkan Hotel")
    public void userClickTambahkanHotel() { tambahDataHotelPage.clickBtnTambahkanHotel();
    }

    @And("user upload image Hotel")
    public void userUploadImageHotel() { tambahDataHotelPage
            .uploadImageHotel();
    }

    @And("user input Nama Hotel")
    public void userInputNamaHotel() { tambahDataHotelPage.inputNamaHotel("Hotel Gran Mahakam");
    }

    @And("user chosee Kelas Hotel")
    public void userChoseeKelasHotel() {
     //   tambahDataHotelPage.clickDivKelasHotel();
        tambahDataHotelPage.chooseKelasHotel();
    }

    @And("user input Deskripsi Hotel")
    public void userInputDeskripsiHotel() { tambahDataHotelPage.inputDeskripsiHotel("Hotel Gran Mahakam is a 5-star boutique hotel in Jakarta Selatan with distinctly European architecture and beautifully appointed rooms in addition to attentive and friendly service. These are some of the key hallmarks of Hotel Gran Mahakam, one of best located Jakarta luxury hotels, conveniently situated at the crossroads of the business and commercial district in the heart of widely popular South Jakarta, where world-class shopping, dining and entertainment await.");
    }

    @And("user input Nomor Telepon")
    public void userInputNomorTelepon() { tambahDataHotelPage.inputNomorTelepon("081387081174");
    }

    @And("user input Email Hotel")
    public void userInputEmailHotel() { tambahDataHotelPage.inputEmailHotel("auliacr2746@gmail.com");
    }

    @And("user input Alamat Hotel")
    public void userInputAlamatHotel() { tambahDataHotelPage.inputAlamatHotel("Jalan Mahakam 1 No.6, Kebayoran Baru,\n" +
            "Jakarta Selatan, DKI Jakarta 12130");
    }

    @And("user click Tambahkan Fasilitas")
    public void userClickTambahkanFasilitas() { tambahDataHotelPage.clickTambahkanFasilitas();
    }

    @And("user input Nama Fasilitas")
    public void userInputNamaFasilitas() { tambahDataHotelPage.inputNamaFasilitas("Swimming Pool");
    }

    @And("user click tab Kebijakan Hotel")
    public void userClickTabKebijakanHotel() { tambahDataHotelPage.clickTabKebijakanHotel();
    }

    @And("user click tab Daftar Kamar")
    public void userClickTabDaftarKamar() { tambahDataHotelPage.clickTabDaftarKamar();
    }

    @And("user click Tambah Kamar")
    public void userClickTambahKamar() { tambahDataHotelPage.clickTambahKamar();
    }

    @And("user upload image Kamar")
    public void userUploadImageKamar() { tambahDataHotelPage.uploadImageKamar();
    }

    @And("user input Nama Kamar")
    public void userInputNamaKamar() { tambahDataHotelPage.inputNamaKamar("Deluxe Room");
    }

    @And("user input Ukuran Kamar")
    public void userInputUkuranKamar() { tambahDataHotelPage.inputUkuranKamar("60");
    }

    @And("user input Jumlah Kamar")
    public void userInputJumlahKamar() { tambahDataHotelPage.inputJumlahKamar("10");
    }

    @And("user input Deskripsi Kamar")
    public void userInputDeskripsiKamar() { tambahDataHotelPage.inputDeskripsiKamar("Designed with uniqueness and comfort, the semi classic yet modern interior of this room creates a feel of warmth and ease that puts you immediately at home. ");
    }

    @And("user click Tambah Fasilitas Kamar")
    public void userClickTambahFasilitasKamar() { tambahDataHotelPage.clickTambahFasilitasKamar();
    }

    @And("user input nama fasilitas kamar")
    public void userInputNamaFasilitasKamar() { tambahDataHotelPage.InputNamaFasilitasKamar("In-room coffee/tea facilities");
    }

    @And("user click tab Penawaran Kamar")
    public void userClickTabPenawaranKamar() { tambahDataHotelPage.clickTabPenawaranKamar();
    }

    @And("user choose Jumlah Tamu")
    public void userChooseJumlahTamu() { tambahDataHotelPage.chooseJumlahTamu();
    }

    @And("user choose Tipe Kasur")
    public void userChooseTipeKasur() { tambahDataHotelPage.chooseTipeKasur();
    }

    @And("user click Tambah data Kamar")
    public void userClickTambahDataKamar() { tambahDataHotelPage.clickTambahDataKamar();
    }

    @And("user click Simpan button")
    public void userClickSimpanButton() { tambahDataHotelPage.clickSimpanBtn();
    }

    @And("user click Simpan Data Hotel")
    public void userClickSimpanDataHotel() { tambahDataHotelPage.clickSimpanDataHotel();
    }

    @And("user click Simpan")
    public void userClickSimpan() { tambahDataHotelPage.clickSimpan();
    }

    @Then("data hotel success created and user see hotel page")
    public void dataHotelSuccessCreatedAndUserSeeHotelPage() { tambahDataHotelPage.dataHotelSuccessAndSeeHotelPage();
    }

    @And("user input Harga Kamar Malam")
    public void userInputHargaKamarMalam() {
        tambahDataHotelPage.InputHargaKamarMalam("1800000");
    }
}
