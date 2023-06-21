package starter.pages.Admin.TransaksiPesananHotel;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DetailTransaksiPesananHotelPage extends PageObject {
    // =============================== Locator ===============================
    private By Loginpage() {
        return By.xpath("//h1[text()='Login']");
    }

    private By EmailField() {
        return By.name("email");
    }

    private By PasswordField() {
        return By.name("password");
    }

    private By BtnLogin() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/button");
    }

    private By DashboardPage() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/h1");
    }

    private By BtnPesananHotel() {
        return By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div[4]/div/a[2]");
    }

    private By PesananHotelPage() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[1]/div/h1");
    }

    private By BtnDataPesananHotel() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div");
    }

    private By DetailPesananHotelPage() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[3]/div");
    }

    //=============================================== Functional ======================================================
    @Step
    public void loginPage() {
        open();
        $(Loginpage()).shouldBeVisible();
    }
    @Step
    public void inputEmailField(String emailField) {
        $(EmailField()).type(emailField);
    }

    @Step
    public void inputPasswordField(String passwordField) {
        $(PasswordField()).type(passwordField);
    }

    @Step
    public void btnLogin() {
        $(BtnLogin()).click();
    }

    @Step
    public void dashboardPage() {
        $(DashboardPage()).shouldBeVisible();
    }

    @Step
    public void menuPesananHotel() {
        $(BtnPesananHotel()).click();
    }

    @Step
    public void pesananHotelPage() {
        $(PesananHotelPage()).shouldBeVisible();
    }

    @Step
    public void dataPesananHotel() {
        $(BtnDataPesananHotel()).click();
    }

    @Step
    public void detailPesananHotel() {
        $(DetailPesananHotelPage()).shouldBeVisible();
    }
}
