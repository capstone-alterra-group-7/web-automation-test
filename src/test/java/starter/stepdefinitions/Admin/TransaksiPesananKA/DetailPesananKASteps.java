package starter.stepdefinitions.Admin.TransaksiPesananKA;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.pages.Admin.TransaksiPesananKA.DetailPesananKApage;

public class DetailPesananKASteps {
    @Steps
    DetailPesananKApage detailpesananKA;
    @And("user click menu Pesanan KA")
    public void userClickMenuPesananKA() { detailpesananKA.clickMenuPesananKA();
    }

    @And("user on Pesanan KA page")
    public void userOnPesananKAPage() { detailpesananKA.onPesananKApage();
    }

    @And("user click data Pesanan KA")
    public void userClickDataPesananKA() {detailpesananKA.clickDataPesananKA();
    }

    @Then("user can see Detail Pesanan KA Page")
    public void userCanSeeDetailPesananKAPage() { detailpesananKA.seeDetailKApage();
    }

    @And("waiting data pesanan KA")
    public void waitingDataPesananKA() { detailpesananKA.waitingDataPesananKA();
    }
}
