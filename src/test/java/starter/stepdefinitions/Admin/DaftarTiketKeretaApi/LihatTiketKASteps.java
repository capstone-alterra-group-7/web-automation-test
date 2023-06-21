package starter.stepdefinitions.Admin.DaftarTiketKeretaApi;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Admin.DaftarTiketKeretaApi.LihatTiketKAPage;

public class LihatTiketKASteps {
    @Steps
    LihatTiketKAPage LihatTiketKAPage;

    @Given("user on login page to see ticket ka")
    public void userOnLoginPage() {
        LihatTiketKAPage.onLoginPage();
    }

    @When("user input email to see ticket ka")
    public void userInputEmail() {
        LihatTiketKAPage.inputEmail("admin@gmail.com");
    }

    @And("user input password to see ticket ka")
    public void userInputPassword() {
        LihatTiketKAPage.inputPassword("qweqwe123");
    }

    @And("user click login to see ticket ka")
    public void userClickLogin() {
        LihatTiketKAPage.clickLoginButton();
    }

    @And("user on dashboard to see ticket ka")
    public void userOnDashboard() {
        LihatTiketKAPage.onDashboardPage();
    }
    @And("user click tiket kereta api to see ticket ka")
    public void userClickTiketKA() {
        LihatTiketKAPage.clickTiketKABT();
    }
    @Then("user on tiket kereta api page to see ticket ka")
    public void userOnTicketKAPage() {
        LihatTiketKAPage.onDaftarTiketKA();
    }


    ///////////////////////////////////////===FITUR 2===///////////////////////////////////////
    @Given("user on login page to see ticket ka2")
    public void userOnLoginPage2() {
        LihatTiketKAPage.onLoginPage();
    }

    @When("user input email to see ticket ka2")
    public void userInputEmail2() {
        LihatTiketKAPage.inputEmail("admin@gmail.com");
    }

    @And("user input password to see ticket ka2")
    public void userInputPassword2() {
        LihatTiketKAPage.inputPassword("qweqwe123");
    }

    @And("user click login to see ticket ka2")
    public void userClickLogin2() {
        LihatTiketKAPage.clickLoginButton();
    }

    @And("user on dashboard to see ticket ka2")
    public void userOnDashboard2() {
        LihatTiketKAPage.onDashboardPage();
    }
    @And("user click tiket kereta api to see ticket ka2")
    public void userClickTiketKA2() {
        LihatTiketKAPage.clickTiketKABT();
    }
    @And("user on tiket kereta api page to see ticket ka2")
    public void userOnTicketKAPage2() {
        LihatTiketKAPage.onDaftarTiketKA();
    }
    @And("user click search field and input name of ticket to see ticket ka2")
    public void userInputTicketOnSearchField() {
        LihatTiketKAPage.clickSearchFieldKA();
        LihatTiketKAPage.inputSearchTiketKA("MATAMARJA");
    }
    @And("user can see ticket ka2")
    public void userCanSeeTicketKA() {
        LihatTiketKAPage.seeTicket();
    }

    ///////////////////////////////////////===FITUR 3===///////////////////////////////////////
    @Given("user on login page to see ticket ka3")
    public void userOnLoginPage3() {
        LihatTiketKAPage.onLoginPage();
    }

    @When("user input email to see ticket ka3")
    public void userInputEmail3() {
        LihatTiketKAPage.inputEmail("admin@gmail.com");
    }

    @And("user input password to see ticket ka3")
    public void userInputPassword3() {
        LihatTiketKAPage.inputPassword("qweqwe123");
    }

    @And("user click login to see ticket ka3")
    public void userClickLogin3() {
        LihatTiketKAPage.clickLoginButton();
    }

    @And("user on dashboard to see ticket ka3")
    public void userOnDashboard3() {
        LihatTiketKAPage.onDashboardPage();
    }
    @And("user click tiket kereta api to see ticket ka3")
    public void userClickTiketKA3() {
        LihatTiketKAPage.clickTiketKABT();
    }
    @And("user on tiket kereta api page to see ticket ka3")
    public void userOnTicketKAPage3() {
        LihatTiketKAPage.onDaftarTiketKA();
    }
    @And("user input date from filter to see ticket ka3")
    public void userInputTanggalDariTicketKAPage3() {
        LihatTiketKAPage.clickTanggalDariKA();
        LihatTiketKAPage.inputTanggalDariTiketKA("30042023");
    }
    @And("user input up to date filter to see ticket ka3")
    public void userInputTanggalHinggaTicketKAPage3() {
        LihatTiketKAPage.clickTanggalHinggaKA();
        LihatTiketKAPage.inputTanggalHinggaTiketKA("31052023");
    }
    @Then("users can see the tickets they are looking for based on the date filter")
    public void userCanSeeTicketOfTanggalDariHinggaKA() {
        LihatTiketKAPage.seeTicket();
    }

    ///////////////////////////////////////===FITUR 4===///////////////////////////////////////
    @Given("user on login page to see ticket ka4")
    public void userOnLoginPage4() {
        LihatTiketKAPage.onLoginPage();
    }

    @When("user input email to see ticket ka4")
    public void userInputEmail4() {
        LihatTiketKAPage.inputEmail("admin@gmail.com");
    }

    @And("user input password to see ticket ka4")
    public void userInputPassword4() {
        LihatTiketKAPage.inputPassword("qweqwe123");
    }

    @And("user click login to see ticket ka4")
    public void userClickLogin4() {
        LihatTiketKAPage.clickLoginButton();
    }

    @And("user on dashboard to see ticket ka4")
    public void userOnDashboard4() {
        LihatTiketKAPage.onDashboardPage();
    }
    @And("user click tiket kereta api to see ticket ka4")
    public void userClickTiketKA4() {
        LihatTiketKAPage.clickTiketKABT();
    }
    @And("user on tiket kereta api page to see ticket ka4")
    public void userOnTicketKAPage4() {
        LihatTiketKAPage.onDaftarTiketKA();
    }
    @When("user choose filter sort A - Z to see ticket ka4")
    public void userChooseFilterAbjadA_ZTicketKAPage4() {
        LihatTiketKAPage.clickFilterSortAbjad();
        LihatTiketKAPage.chooseFilterSortAbjadA_ZTiketKA();
    }
    @Then("user can see the result of filter sort A -Z")
    public void userCanSeeTicketOfFilterAbjadA_ZKA4() {
        LihatTiketKAPage.seeTicket();
    }
    @When("user choose filter sort Z - A to see ticket ka4")
    public void userChooseFilterAbjadZ_AKAPage4() {

        LihatTiketKAPage.chooseFilterSortAbjadZ_ATiketKA();
    }
    @Then("user can see the result of filter sort Z - A")
    public void userCanSeeTicketOfFilterAbjadZ_AKA4() {
        LihatTiketKAPage.seeTicket();
    }
    ///////////////////////////////////////===FITUR 5===///////////////////////////////////////
    @Given("user on login page to see ticket ka5")
    public void userOnLoginPage5() {
        LihatTiketKAPage.onLoginPage();
    }

    @When("user input email to see ticket ka5")
    public void userInputEmail5() {
        LihatTiketKAPage.inputEmail("admin@gmail.com");
    }

    @And("user input password to see ticket ka5")
    public void userInputPassword5() {
        LihatTiketKAPage.inputPassword("qweqwe123");
    }

    @And("user click login to see ticket ka5")
    public void userClickLogin5() {
        LihatTiketKAPage.clickLoginButton();
    }

    @And("user on dashboard to see ticket ka5")
    public void userOnDashboard5() {
        LihatTiketKAPage.onDashboardPage();
    }
    @And("user click tiket kereta api to see ticket ka5")
    public void userClickTiketKA5() {
        LihatTiketKAPage.clickTiketKABT();
    }
    @And("user on tiket kereta api page to see ticket ka5")
    public void userOnTicketKAPage5() {
        LihatTiketKAPage.onDaftarTiketKA();
    }
    @And("user click and choose filter to see ticket ka5")
    public void userClickAndChooseFilterKeaktifanKA5() {
        LihatTiketKAPage.clickFilterKeaktifan();
        LihatTiketKAPage.clickFilterKeaktifanUnpaid();
        LihatTiketKAPage.clickTerapkanFilter();
    }
    @Then("user can see the result of filter")
    public void userCanSeeTicketOfUnpaidFilter5() {
        LihatTiketKAPage.seeTicket();
    }

///////////////////////////////////////===FITUR 6===///////////////////////////////////////

}
