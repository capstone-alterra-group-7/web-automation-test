package starter.stepdefinitions.Admin.DaftarPengguna;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import starter.pages.Admin.DaftarPengguna.TambahPenggunaPage;

public class TambahPenggunaSteps {
    @Steps
    TambahPenggunaPage tambahPengguna;
    @And("user click Pengguna menu")
    public void userClickPenggunaMenu() { tambahPengguna.clickMenuPengguna();
    }

    @And("user click button Tambah Pengguna")
    public void userClickButtonTambahPengguna() { tambahPengguna.clickBtnTambahPengguna();
    }

    @And("user click Iya, Tambahkan Pengguna")
    public void userClickIyaTambahkanPengguna() { tambahPengguna.clickBtnIyaTambahkanPengguna();
    }

    @And("user click Keaktifan Pengguna")
    public void userClickKeaktifanPengguna() { tambahPengguna.clickSliderKeaktifanPengguna();
    }

    @And("user input Email")
    public void userInputEmail() { tambahPengguna.userInputEmail("admin@gmail.comx");
    }

    @And("user input Password")
    public void userInputPassword() { tambahPengguna.userInputPasswd("12345678");
    }

    @And("user input Konfirmasi Password")
    public void userInputKonfirmasiPassword() { tambahPengguna.userInputKonfirmasiPasswd("12345678");
    }

    @And("user input Nama Pengguna")
    public void userInputNamaPengguna() { tambahPengguna.inputNamaPengguna("Aulia");
    }

    @And("user input Tanggal Lahir")
    public void userInputTanggalLahir() { tambahPengguna.inputTglLahir("02182001");
    }

    @And("user input Nomor Handphone")
    public void userInputNomorHandphone() { tambahPengguna.inputNomorHandphone("081387081174");
    }

    @And("user click Simpan Pengguna")
    public void userClickSimpanPengguna() { tambahPengguna.clickBtnSimpanPengguna();
    }

    @And("user click Iya, Simpan Data")
    public void userClickIyaSimpanData() { tambahPengguna.userCLickIyaSimpanData();
    }
}
