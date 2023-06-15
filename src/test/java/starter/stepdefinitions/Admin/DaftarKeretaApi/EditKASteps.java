package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.pages.Admin.DaftarKeretaApi.EditKAPage;

public class EditKASteps {
    @Steps
    EditKAPage editKA;
    @And("user click data KA status active")
    public void userClickDataKAStatusActive() { editKA.clickDataKAactive();
    }

    @And("user click button Ubah KA")
    public void userClickButtonUbahKA() { editKA.klikButtonUbahKA();
    }

    @And("user click Ubah")
    public void userClickUbah() { editKA.klikUbah();
    }

    @And("user edit Nama Kereta Api")
    public void userEditNamaKeretaApi() { editKA.inputNamaKereta("Purwokerto");
    }

    @And("user click Simpan Perubahan KA")
    public void userClickSimpanPerubahanKA() { editKA.klikSimpanPerubahanKA();
    }

    @And("user click Simpan Perubahan")
    public void userClickSimpanPerubahan() { editKA.klikSimpanPerubahan();
    }

    @Then("user can see daftar KA page")
    public void userCanSeeDaftarKAPage() { editKA.seeDaftarKApage();
    }

    @And("user click Tambah Rute")
    public void userClickTambahRute() { editKA.ButtonTambahRute();
    }

    @And("user chosee Pilih Perjalanan")
    public void userChoseePilihPerjalanan() { editKA.ButtonPilihPerjalanan();
    }

    @And("user click Tambahkan")
    public void userClickTambahkan() { editKA.clickTambahkanRute();
    }

    @And("user input Jam Tiba")
    public void userInputJamTiba() { editKA.inputJamTiba("0800");
    }
}
