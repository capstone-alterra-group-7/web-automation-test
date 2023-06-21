package starter.stepdefinitions.Admin.TransaksiPesananHotel;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.pages.Admin.TransaksiPesananHotel.DetailTransaksiPesananHotelPage;

public class DetailTransaksiPesananHotelSteps {

    DetailTransaksiPesananHotelPage detailPesananHotel;
    @Given("user on login page to see detail transaction hotel order")
    public void userOnLoginPageToSeeDetailTransactionHotelOrder() { detailPesananHotel.loginPage();
    }

    @When("user input email to see detail transaction hotel order")
    public void userInputEmailToSeeDetailTransactionHotelOrder() { detailPesananHotel.inputEmailField("admin@gmail.com");
    }

    @And("user input password to detail transaction hotel order")
    public void userInputPasswordToDetailTransactionHotelOrder() { detailPesananHotel.inputPasswordField("qweqwe123");
    }

    @And("user click login button to see detail transaction hotel order")
    public void userClickLoginButtonToSeeDetailTransactionHotelOrder() { detailPesananHotel.btnLogin();
    }

    @And("user on dashboard to see detail transaction hotel order")
    public void userOnDashboardToSeeDetailTransactionHotelOrder() { detailPesananHotel.dashboardPage();
    }

    @And("user click menu Pesanan Hotel")
    public void userClickMenuPesananHotel() { detailPesananHotel.menuPesananHotel();
    }

    @And("user on Pesanan Hotel page")
    public void userOnPesananHotelPage() { detailPesananHotel.pesananHotelPage();
    }

    @And("user click data Pesanan Hotel")
    public void userClickDataPesananHotel() { detailPesananHotel.dataPesananHotel();
    }

    @Then("user can see Detail Pesanan Hotel Page")
    public void userCanSeeDetailPesananHotelPage() { detailPesananHotel.detailPesananHotel();
    }
}
