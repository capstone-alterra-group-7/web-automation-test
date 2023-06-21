package starter.stepdefinitions.Login;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import starter.pages.Login.LoginPage;

public class LoginSteps {
    @Steps
    LoginPage login;
    @And("user click login button")
    public void userClickLoginButton() { login.clickBtnLogin();
    }
}
