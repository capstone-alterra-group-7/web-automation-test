package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.DetailKAPage;

public class DetailKASteps {
    @Steps
    DetailKAPage detailKA;
    @Given("user on home page")
    public void userOnHomePage() {
        detailKA.onHomePage();
    }

    @When("user click menu Daftar KA")
    public void userClickMenuDaftarKA() {
        detailKA.clickMenuDaftarKA();
    }

    @And("user click data KA on Daftar KA page")
    public void userClickDataKAOnDaftarKAPage() {
        detailKA.clickDataKA();
    }

    @Then("user see detail KA page")
    public void userSeeDetailKAPage() {
        detailKA.seeDetailKA();
    }
}
