package starter.pages.Admin.DaftarTiketKeretaApi;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LihatTiketKAPage extends PageObject {

    // =============================== Locator ===============================
    private By LoginPage() {
        return By.xpath("//h1[text()='Login']");
    }

    private By emailField() {
        return By.name("email");
    }

    private By passwordField() {
        return By.name("password");
    }

    private By loginButton() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/button");
    }

    private By titleDashboard() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/h1");
    }

    private By tiketKeretaApiBT() {
        return By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div[3]/div/a[3]");
    }

    private By titleDaftarTiket() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[1]/div/h1");
    }

    private By searchTiketKeretaApiField() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/input");
    }

    private By tanggalTiketDariField() {
        return By.xpath("//*[@id=\"dari\"]");
    }

    private By tanggalTiketHinggaField() {
        return By.xpath("//*[@id=\"dari\"]");
    }

    private By filterSortAbjadField() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[2]/div[3]/div");
    }

    private By filterSortAbjadA_ZField() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/input");
    }

    private By filterSortAbjadZ_AField() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[2]/div[3]/div[2]/div[2]/input");
    }

    private By filterKeaktifanKAField() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]");
    }

    private By filterKeaktifanKABorder() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[9]/div");
    }

    private By filterUnpaidField() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[6]/div/div[2]/div/div[1]/div[2]/input");
    }

    private By filterPaidField() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[9]/div/div[2]/div[1]/div[2]/input");
    }

    private By filterDoneField() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[9]/div/div[2]/div[1]/div[3]/input");
    }

    private By filterCanceledField() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[9]/div/div[2]/div[2]/div[1]/input");
    }

    private By filterRefundField() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[9]/div/div[2]/div[2]/div[2]/input");
    }

    private By filterReset() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[9]/div/div[1]/div[2]/h5");
    }

    private By filterTetapkanBT() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[4]/div/div[1]/div[2]/button");
    }

    private By filterKembaliBT() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[9]/div/div[1]/div[1]/h5");
    }

    private By listTiketBox() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div");
    }

    private By detailTiketPage() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/h1");
    }

    private By detailSelanjutnyaBT() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[3]/div[1]/button[2]");
    }

    private By detailSebelumnyaBT() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[3]/div[1]/button[1]");
    }

    private By detailKembaliBT() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div/div[1]/button");
    }

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
    public void onDaftarTiketKA() {
        $(titleDaftarTiket()).shouldBeVisible();
    }

    @Step
    public void seeTicket() {
        $(listTiketBox()).shouldBeVisible();
    }

    @Step
    public void clickSearchFieldKA() {
        $(searchTiketKeretaApiField()).click();
    }

    @Step
    public void clickTiketKABT() {
        $(tiketKeretaApiBT()).click();
    }

    @Step
    public void inputSearchTiketKA(String tiketka) {
        $(searchTiketKeretaApiField()).type(tiketka);
    }

    @Step
    public void clickTanggalDariKA() {
        $(tanggalTiketDariField()).click();
    }

    @Step
    public void inputTanggalDariTiketKA(String tanggaldari) {
        $(tanggalTiketDariField()).type(tanggaldari);
    }

    @Step
    public void clickTanggalHinggaKA() {
        $(tanggalTiketHinggaField()).click();
    }

    @Step
    public void inputTanggalHinggaTiketKA(String tanggalhingga) {
        $(tanggalTiketHinggaField()).type(tanggalhingga);
    }

    @Step
    public void clickFilterSortAbjad() {
        $(filterSortAbjadField()).click();
    }
    @Step
    public void chooseFilterSortAbjadA_ZTiketKA() {
        $(filterSortAbjadA_ZField()).click();
    }
    @Step
    public void chooseFilterSortAbjadZ_ATiketKA() {
        $(filterSortAbjadZ_AField()).click();
    }
    @Step
    public void clickFilterKeaktifan() {
        $(filterKeaktifanKAField()).click();
    }
    @Step
    public void clickFilterKeaktifanUnpaid() {
        $(filterUnpaidField()).click();
    }
    @Step
    public void validateFilterKeaktifanShow() {
        $(filterKeaktifanKABorder()).isDisplayed();
    }
    @Step
    public void clickTerapkanFilter() {
        $(filterTetapkanBT()).click();
    }
}

