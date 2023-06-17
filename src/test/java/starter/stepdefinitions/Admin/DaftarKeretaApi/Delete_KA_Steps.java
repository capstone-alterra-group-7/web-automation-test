package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Delete_KA;

public class Delete_KA_Steps {

    @Steps
    Delete_KA deleteKa;



    @Given("admin input username")
    public void adminInputUsername() throws InterruptedException {
        deleteKa.AdminInputUsername("Admin@gmail.com");
    }

    @When("admin input password")
    public void adminInputPassword() throws InterruptedException {
        deleteKa.AdminInputPassword("qweqwe123");
    }

    @And("click masuk")
    public void clickMasuk() throws InterruptedException {
        deleteKa.ClickMasuk();
    }

    @And("pilih Kereta Api")
    public void pilihKeretaApi() throws InterruptedException {
        deleteKa.PilihKeretaApi();
    }

    @And("pilih gerbong")
    public void pilihGerbong() throws InterruptedException {
        deleteKa.PilihGerbong();
    }

    @Then("Hapus gerbong")
    public void hapusGerbong() throws InterruptedException {
        deleteKa.HapusGerbong();
    }











}
