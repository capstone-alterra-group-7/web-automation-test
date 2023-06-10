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

    @Given("user on login page")
    public void userOnLoginPage() { detailKA.onLoginPage();
    }

    @When("user input email")
    public void userInputEmail() { detailKA.inputEmail("admin@gmail.com");
    }

    @And("user input password")
    public void userInputPassword() { detailKA.inputPassword("qweqwe123");
    }

    @And("user click login")
    public void userClickLogin() { detailKA.clickLoginButton();
    }

    @And("user on dashboard")
    public void userOnDashboard() { detailKA.onDashboardPage();
    }

    @And("user click Kereta Api menu")
    public void userClickKeretaApiMenu() { detailKA.clickMenuKA();
    }

    @And("user click data KA")
    public void userClickDataKA() { detailKA.clickdataKA();
    }

    @Then("user see detail KA page")
    public void userSeeDetailKAPage() {
        detailKA.seeDetailKA();
    }
}
