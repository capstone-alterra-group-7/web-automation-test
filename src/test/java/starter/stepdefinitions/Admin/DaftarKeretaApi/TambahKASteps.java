package starter.stepdefinitions.Admin.DaftarKeretaApi;


import net.thucydides.core.annotations.Step;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.pages.Admin.DaftarKeretaApi.TambahKAPage;

public class TambahKASteps {
    @Steps
    TambahKAPage tambahKAPage;

    @Given("user on login page2")
    public void userOnLoginPage() {
        tambahKAPage.onLoginPage();
    }

    @When("user input email2")
    public void userInputEmail() {
        tambahKAPage.inputEmail("admin@gmail.com");
    }

    @And("user input password2")
    public void userInputPassword() {
        tambahKAPage.inputPassword("qweqwe123");
    }

    @And("user click login2")
    public void userClickLogin() {
        tambahKAPage.clickLoginButton();
    }

    @And("user on dashboard2")
    public void userOnDashboard() {
        tambahKAPage.onDashboardPage();
    }

    @And("user click Kereta Api menu2")
    public void userClickKeretaApiMenu() {
        tambahKAPage.clickMenuKA();
    }

    @And("user click tambah KA2")
    public void userClickTambahKA() {
        tambahKAPage.clickTambahKA();
        tambahKAPage.clickTambahkanStasiun();
    }

    @And("user set active KA2")
    public void userClickAktifKA() {
        tambahKAPage.clickKeaktifanKA();
    }

    @And("user input name of KA2")
    public void userInputNamaKA() {
        tambahKAPage.inputNamaKA("ajojingKA");
    }

    @And("User set rute2")
    public void userChecklistRute1() {
        tambahKAPage.clickTambahRute();
        tambahKAPage.clickRute1();
        tambahKAPage.clickTambahkanRute();
    }

    @And("User set arrived time of KA2")
    public void userInputJamTiba() {
        tambahKAPage.inputJamTiba("0811");
        tambahKAPage.clickLanjutkan();
        tambahKAPage.clickSimpanPerubahan();
    }

    @And("User set price")
    public void userInputHargaTiket1() {
        tambahKAPage.inputHargaTiket1("100.000");
        tambahKAPage.inputHargaTiket2("0");
        tambahKAPage.inputHargaTiket3("0");
    }

    @And("User add Gerbong and input name of gerbong")
    public void userChooseGerbongAndAddNameOfGerbong() {
        tambahKAPage.AddGerbong();
        tambahKAPage.chooseTipeGerbong();
        tambahKAPage.chooseTipeGerbongEkonomi();
        tambahKAPage.inputGerbongName("CahayaS");
    }

    @And("User save a new KA")
    public void userSaveKA() {
        tambahKAPage.clickSimpanKA();
        tambahKAPage.clickSimpanDataKA();
    }

    @Then("User has succesfully save a New KA and Return to Menu Daftar KA")
    public void ValidateSaveKAandReturnToMenuDaftarKA() {
        tambahKAPage.validateSaveANewKA();
        tambahKAPage.backToMenuDaftarKA();
    }

    ///////////////////////////////////////===FITUR 2===///////////////////////////////////////
    @Given("user on login page3")
    public void userOnLoginPage3() {
        tambahKAPage.onLoginPage();
    }

    @When("user input email3")
    public void userInputEmail3() {
        tambahKAPage.inputEmail("admin@gmail.com");
    }

    @And("user input password3")
    public void userInputPassword3() {
        tambahKAPage.inputPassword("qweqwe123");
    }

    @And("user click login3")
    public void userClickLogin3() {
        tambahKAPage.clickLoginButton();
    }

    @And("user on dashboard3")
    public void userOnDashboard3() {
        tambahKAPage.onDashboardPage();
    }

    @And("user click Kereta Api menu3")
    public void userClickKeretaApiMenu3() {
        tambahKAPage.clickMenuKA();
    }

    @And("user click tambah KA3")
    public void userClickTambahKA3() {
        tambahKAPage.clickTambahKA();
        tambahKAPage.clickTambahkanStasiun();
    }

    @And("user set active KA3")
    public void userClickAktifKA3() {
        tambahKAPage.clickKeaktifanKA();
    }

    @And("user input blank name of KA3")
    public void userInputNamaKA3() {
        tambahKAPage.inputNamaKA("");
    }

    @And("User set rute3")
    public void userChecklistRute1_3() {
        tambahKAPage.clickTambahRute();
        tambahKAPage.clickRute1();
        tambahKAPage.clickTambahkanRute();
    }

    @And("User set arrived time of KA3")
    public void userInputJamTiba3() {
        tambahKAPage.inputJamTiba("0811");

    }

    @And("User cant click Lanjutkan Button")
    public void userCantClickLanjutkanBT3() {
        tambahKAPage.validateCantLanjutkanAndSave();

    }

    @Then("User stay on Tambah KA Menu Dashboard")
    public void userStayOnKAMenuDashboard3() {
        tambahKAPage.validateUserStayOnPage1ofTambahKA();
    }

    ///////////////////////////////////////===FITUR 3===///////////////////////////////////////
    @Given("user on login page4")
    public void userOnLoginPage4() {
        tambahKAPage.onLoginPage();
    }

    @When("user input email4")
    public void userInputEmail4() {
        tambahKAPage.inputEmail("admin@gmail.com");
    }

    @And("user input password4")
    public void userInputPassword4() {
        tambahKAPage.inputPassword("qweqwe123");
    }

    @And("user click login4")
    public void userClickLogin4() {
        tambahKAPage.clickLoginButton();
    }

    @And("user on dashboard4")
    public void userOnDashboard4() {
        tambahKAPage.onDashboardPage();
    }

    @And("user click Kereta Api menu4")
    public void userClickKeretaApiMenu4() {
        tambahKAPage.clickMenuKA();
    }

    @And("user click tambah KA4")
    public void userClickTambahKA4() {
        tambahKAPage.clickTambahKA();
        tambahKAPage.clickTambahkanStasiun();
    }

    @And("user set active KA4")
    public void userClickAktifKA4() {
        tambahKAPage.clickKeaktifanKA();
    }

    @And("user input name of KA4")
    public void userInputNamaKA4() {
        tambahKAPage.inputNamaKA("ajojingKA");
    }

    @And("User set rute4")
    public void userChecklistRute1_4() {
        tambahKAPage.clickTambahRute();
        tambahKAPage.clickRute1();
        tambahKAPage.clickTambahkanRute();
    }

    @And("User set arrived time of KA4")
    public void userInputJamTiba4() {
        tambahKAPage.inputJamTiba("0811");
        tambahKAPage.clickLanjutkan();
        tambahKAPage.clickSimpanPerubahan();
    }

    @And("User set blank price4")
    public void userInputBlankHargaTiket1_4() {
        tambahKAPage.inputHargaTiket1("");
        tambahKAPage.inputHargaTiket2("");
        tambahKAPage.inputHargaTiket3("");
    }

    @And("User cant choose gerbong because blank price4")
    public void userCantChooseGerbongAndAddNameOfGerbong4() {
        tambahKAPage.validateUserMustInputPriceOfTrain();

    }

    @Then("User stay on Tambah KA Menu Dashboard4")
    public void userStayOnKAMenuDashboard4() {
        tambahKAPage.validateUserStayOnPage1ofTambahKA();
    }

    ///////////////////////////////////////===FITUR 5===///////////////////////////////////////
    @Given("user on login page5")
    public void userOnLoginPage5() {
        tambahKAPage.onLoginPage();
    }

    @When("user input email5")
    public void userInputEmail5() {
        tambahKAPage.inputEmail("admin@gmail.com");
    }

    @And("user input password5")
    public void userInputPassword5() {
        tambahKAPage.inputPassword("qweqwe123");
    }

    @And("user click login5")
    public void userClickLogin5() {
        tambahKAPage.clickLoginButton();
    }

    @And("user on dashboard5")
    public void userOnDashboard5() {
        tambahKAPage.onDashboardPage();
    }

    @And("user click Kereta Api menu5")
    public void userClickKeretaApiMenu5() {
        tambahKAPage.clickMenuKA();
    }

    @And("user click tambah KA5")
    public void userClickTambahKA5() {
        tambahKAPage.clickTambahKA();
        tambahKAPage.clickTambahkanStasiun();
    }

    @And("user set active KA5")
    public void userClickAktifKA5() {
        tambahKAPage.clickKeaktifanKA();
    }

    @And("user input name of KA5")
    public void userInputNamaKA5() {
        tambahKAPage.inputNamaKA("ajojingKA");
    }

    @And("User not selecting Destination Station5")
    public void userDontChecklistRute1_5() {
        tambahKAPage.clickTambahRute();
        tambahKAPage.clickTambahkanRute();
    }

    @Then("User cannot go to next step and stay on Tambah KA Menu Dashboard5")
    public void userStayOnKAMenuDashboard5() {
        tambahKAPage.validateUserStayOnPage1ofTambahKA();
    }
    ///////////////////////////////////////===FITUR 6===///////////////////////////////////////
    @Given("user on login page6")
    public void userOnLoginPage6() {
        tambahKAPage.onLoginPage();
    }

    @When("user input email6")
    public void userInputEmail6() {
        tambahKAPage.inputEmail("admin@gmail.com");
    }

    @And("user input password6")
    public void userInputPassword6() {
        tambahKAPage.inputPassword("qweqwe123");
    }

    @And("user click login6")
    public void userClickLogin6() {
        tambahKAPage.clickLoginButton();
    }

    @And("user on dashboard6")
    public void userOnDashboard6() {
        tambahKAPage.onDashboardPage();
    }

    @And("user click Kereta Api menu6")
    public void userClickKeretaApiMenu6() {
        tambahKAPage.clickMenuKA();
    }

    @And("user click tambah KA6")
    public void userClickTambahKA6() {
        tambahKAPage.clickTambahKA();
        tambahKAPage.clickTambahkanStasiun();
    }

    @And("user set active KA6")
    public void userClickAktifKA6() {
        tambahKAPage.clickKeaktifanKA();
    }

    @And("user input name of KA6")
    public void userInputNamaKA6() {
        tambahKAPage.inputNamaKA("ajojingKA");
    }

    @And("User set rute6")
    public void userChecklistRute1_6() {
        tambahKAPage.clickTambahRute();
        tambahKAPage.clickRute1();
        tambahKAPage.clickTambahkanRute();
    }

    @And("User not filling in Arrival Time of new KA6")
    public void userDontInputJamTiba6() {
        tambahKAPage.inputJamTiba("");

    }
    @Then("User cannot go to next step and stay on Tambah KA Menu Dashboard6")
    public void userStayOnKAMenuDashboard6() {
        tambahKAPage.validateUserStayOnPage1ofTambahKA();
    }
///////////////////////////////////////===FITUR 6===///////////////////////////////////////
@Given("user on login page7")
public void userOnLoginPage7() {
    tambahKAPage.onLoginPage();
}

    @When("user input email7")
    public void userInputEmail7() {
        tambahKAPage.inputEmail("admin@gmail.com");
    }

    @And("user input password7")
    public void userInputPassword7() {
        tambahKAPage.inputPassword("qweqwe123");
    }

    @And("user click login7")
    public void userClickLogin7() {
        tambahKAPage.clickLoginButton();
    }

    @And("user on dashboard7")
    public void userOnDashboard7() {
        tambahKAPage.onDashboardPage();
    }

    @And("user click Kereta Api menu7")
    public void userClickKeretaApiMenu7() {
        tambahKAPage.clickMenuKA();
    }

    @And("user click tambah KA7")
    public void userClickTambahKA7() {
        tambahKAPage.clickTambahKA();
        tambahKAPage.clickTambahkanStasiun();
    }

    @And("user set active KA7")
    public void userClickInactiveKA7() {
        tambahKAPage.clickKeaktifanKA();
    }

    @And("user input name of KA7")
    public void userInputNamaKA7() {
        tambahKAPage.inputNamaKA("ajojingKA");
    }

    @And("User set rute7")
    public void userChecklistRute1_7() {
        tambahKAPage.clickTambahRute();
        tambahKAPage.clickRute1();
        tambahKAPage.clickTambahkanRute();
    }

    @And("User set arrived time of KA7")
    public void userInputJamTiba7() {
        tambahKAPage.inputJamTiba("0811");
        tambahKAPage.clickLanjutkan();
        tambahKAPage.clickSimpanPerubahan();
    }

    @And("User set price7")
    public void userInputHargaTiket1_7() {
        tambahKAPage.inputHargaTiket1("100.000");
        tambahKAPage.inputHargaTiket2("0");
        tambahKAPage.inputHargaTiket3("0");
    }

    @And("User add Gerbong and input name of gerbong7")
    public void userChooseGerbongAndAddNameOfGerbong7() {
        tambahKAPage.AddGerbong();
        tambahKAPage.chooseTipeGerbong();
        tambahKAPage.chooseTipeGerbongEkonomi();
        tambahKAPage.inputGerbongName("CahayaSelatan");
    }

    @And("User save a new KA7")
    public void userSaveKA7() {
        tambahKAPage.clickSimpanKA();
        tambahKAPage.clickSimpanDataKA();
    }

    @And("User has succesfully save a New KA and Return to Menu Daftar KA7")
    public void ValidateSaveKAandReturnToMenuDaftarKA7() {
        tambahKAPage.validateSaveANewKA();
        tambahKAPage.backToMenuDaftarKA();
    }
    @And("User can see the newly added ka data in the list of inactive train7")
    public void ValidateInactiveDataKA7() {
        tambahKAPage.chooseFilterKA();
        tambahKAPage.chooseInactiveKAFilter();
        tambahKAPage.clickTetapkanFilterKABT();
        tambahKAPage.validateInactiveKAOnPage();

    }
}
