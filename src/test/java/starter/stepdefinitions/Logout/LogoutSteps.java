package starter.stepdefinitions.Logout;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import starter.pages.Logout.LogoutPage;

public class LogoutSteps {
    @Steps
    LogoutPage logout;
    @And("user click button Logout")
    public void userClickButtonLogout() { logout.clickButtonLogout();
    }

    @And("click button Tetap Logout")
    public void clickButtonTetapLogout() { logout.clickButtonTetapLogout();
    }
}
