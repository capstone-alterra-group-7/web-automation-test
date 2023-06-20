package starter.stepdefinitions.Admin.DaftarPengguna;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import starter.pages.Admin.DaftarPengguna.EditPenggunaPage;

public class EditPenggunaSteps {

    @Steps
    EditPenggunaPage editPengguna;
    @And("user click button Data Pengguna")
    public void userClickButtonDataPengguna() { editPengguna.userClickBtnDataPengguna();
    }

    @And("user on Detail Pengguna")
    public void userOnDetailPengguna() { editPengguna.userOnDetailPengguna();
    }

    @And("user click Edit Pengguna")
    public void userClickEditPengguna() { editPengguna.clickBtnEdit();
    }

    @And("user edit Email")
    public void userEditEmail() { editPengguna.EditEmailField("aulia@dummy.com");
    }

    @And("user edit Password")
    public void userEditPassword() { editPengguna.EditPasswordField("12345678");
    }

    @And("user edit Konfirmasi Password")
    public void userEditKonfirmasiPassword() { editPengguna.EditKonfirmasiPasswordField("12345678");
    }

    @And("user edit Nama Pengguna")
    public void userEditNamaPengguna() { editPengguna.EditNamaPengguna("Aulia Claudia Rahma");
    }

    @And("user edit Tanggal Lahir")
    public void userEditTanggalLahir() { editPengguna.EditTanggalLahir("02182001");
    }

    @And("user edit Nomor Handphone")
    public void userEditNomorHandphone() { editPengguna.EditNomorHandphone("081387081174");
    }
}
