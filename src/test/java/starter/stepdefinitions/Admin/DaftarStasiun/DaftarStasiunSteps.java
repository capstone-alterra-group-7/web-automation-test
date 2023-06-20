package starter.stepdefinitions.Admin.DaftarStasiun;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Admin.DaftarStasiun.DaftarStasiun;

public class DaftarStasiunSteps {

    @Steps
    DaftarStasiun daftarStasiun;


    @Given("admin input admin username")
    public void AdminInputAdminUsername() throws InterruptedException {
        daftarStasiun.InputAdminUsername("Admin@gmail.com");
    }

    @When("admin input admin password")
    public void AdminInputAdminPassword() throws InterruptedException {
        daftarStasiun.AdminInputPassword("qweqwe123");
    }

    @And("click masuk for admin")
    public void ClickMasukFORAdmin() throws InterruptedException{
        daftarStasiun.ClickMasukForAdmin();
    }

    @And("klik stasiun")
    public void KlikStasiun() throws InterruptedException{
        daftarStasiun.KlikMenuStasiun();
    }

    @And("klik tambah stasiun")
    public void KlikTambahStasiun() throws InterruptedException {
        daftarStasiun.KlikTambahStasiun();
    }

    @And("klik tambahkan")
    public void KlikTambahkan() throws InterruptedException {
        daftarStasiun.KlikMenuTambahkanlagi();
    }


    @And("tambahkan nama stasiun")
    public void TambahkanNamaStasiun() throws InterruptedException {
        daftarStasiun.IsiNamaStasiun("OnePiece");
    }


    @And("tambahkan kode stasiun")
    public void TambahkanKodeStasiun() throws InterruptedException {
        daftarStasiun.InputKodeStasiun("OP-1");
    }

    @And("tambahkan domisili")
    public void TambahkanDomisili() throws InterruptedException {
        daftarStasiun.InputDomisili("RedLine");
    }

    @And("Klik tambah data stasiun")
    public void KlikTambahDataStasiun() throws InterruptedException {
        daftarStasiun.LanjutTambah();
    }

    @And("klik simpan")
    public void KlikSimpan() throws InterruptedException {
        daftarStasiun.LanjutSimpan();
    }

    @Then("Data stasiun terbaru berhasil ditambahkan")
    public void DataStasiunTerbaruBerhasilDitambahkan() throws InterruptedException {
        daftarStasiun.BerhasilTambahStasiun();
    }
}
