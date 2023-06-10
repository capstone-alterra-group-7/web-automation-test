package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DetailKAPage extends PageObject {

    // =============================== Locator ===============================
    private By LoginPage() {
        return By.xpath("//h1[text()='Login']");}

    private By emailField() {
        return By.name("email");}

    private By passwordField() {
        return By.name("password");}

    private By loginButton() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/button");}

    private By titleDashboard() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/h1");}

    private By menuKA() {
        return By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div[3]/div/a[2]");}

    private By dataKA() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]");}

    private By titleDetailDataKA() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[1]/h1");}
    //=============================================== Functional ======================================================
    

    @Step
    public void onLoginPage() {
        open();
        $(LoginPage()).shouldBeVisible();
    }
    @Step
    public void inputEmail(String email) { 
        $(emailField()).type(email);
    }
    @Step
    public void inputPassword(String password) {
        $(passwordField()).type(password);
    }
    @Step
    public void clickLoginButton() {
        $(loginButton()).click();
    }

    @Step
    public void onDashboardPage() {
        $(titleDashboard()).shouldBeVisible();
    }

    @Step
    public void clickMenuKA() {
        $(menuKA()).click();
    }

    public void clickdataKA() {
        $(dataKA()).click();
    }

    public void seeDetailKA() {
        $(titleDetailDataKA()).shouldBeVisible();
    }
}
