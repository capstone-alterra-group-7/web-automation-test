package starter.pages.Admin.DaftarKeretaApi;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class TambahKAPage extends PageObject {

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
    private By TambahKaBT() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div/div[2]/button");}
    private By TambahKaBT2() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[3]/div/div/button[2]");}
    private By tambahKADashboard() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]");}
    private By filterKADashboard() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div/div[2]");}
    private By filterInactiveKADashboard() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[3]/div/div[2]/div/div[2]/input");}
    private By TetapkanFilterInactiveKADashboardBT() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[3]/div/div[1]/div[2]/button");}
    private By PageOfListInactiveKA() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div");}
    private By KeakktifKABT() {
        return By.xpath("//*[@id=\"flexSwitchCheckDefault01\"]");}
    private By NamaKAField() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div[1]/div[2]/div/input");}
    private By TambahRuteBT() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div[2]/div/button");}
    private By TambahRute1Check() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div[4]/div/div[1]/div[2]/div[7]/input");}
    private By ClickRute2(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div[4]/div/div[1]/div[2]/div[6]/input");
    }
    private By TambahkanRuteBT() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div[4]/div/div[2]/button[2]");}
    private By JamTibaField1() {
        return By.xpath("//*[@id=\"waktu-tiba\"]/input");}

    private By LanjutkanBT() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div/button");}
    private By SimpanPerubahanBT() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[3]/div/div/button[2]");}
    private By hargaTiket1Field() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[1]/div[2]/div[1]/div/input");}
    private By hargaTiket2Field() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div/input");}
    private By hargaTiket3Field() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div/input");}
    private By TambahGerbongBT(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[2]/div/div/button");
    }
    private By TipeGerbongSelect(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div[1]/div[1]/div/select");
    }
//    private By TipeGerbongField(){
//        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[2]/div/div/button");
//    }
    private By TipeGerbongEkonomiSelect(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div[1]/div[1]/div/select/option[1]");
    }
    private By TipeGerbongBisnisSelect(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div[1]/div[1]/div/select/option[2]");
    }
    private By TipeGerbongEksekutifSelect(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div[1]/div[1]/div/select/option[3]");
    }
    private By NamaGerbongField(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div[1]/div[2]/input");
    }
    private By SimpanKABT(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div/button");
    }
    private By SimpanDataKABT(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[3]/div/div/button[2]");
    }
    private By succesSaveKaValidate(){
        return By.xpath("//*[@id=\"swal2-html-container\"]/div/img");
    }
    private By LanjutkanButton(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div/button");
    }

    private By SimpanPerubahanBtn(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[3]/div/div/button[2]");
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
    public void clickMenuKA() {
        $(menuKA()).click();
    }
    @Step
    public void clickTambahKA(){
        $(TambahKaBT()).click();
    }
    @Step
    public void clickTambahkanStasiun(){
        $(TambahKaBT2()).click();
    }
    @Step
    public void clickKeaktifanKA(){
        $(KeakktifKABT()).click();
    }
    @Step
    public void inputNamaKA(String namaKA){
        $(NamaKAField()).type(namaKA);
    }
    @Step
    public void clickTambahRute(){
        $(TambahRuteBT()).click();
    }
    @Step
    public void clickRute1(){
        $(TambahRute1Check()).click();
    }
    @Step
    public void clickTambahkanRute(){
        $(TambahkanRuteBT()).click();
    }
    @Step
    public void inputJamTiba(String jamtiba){
        $(JamTibaField1()).type(jamtiba);
    }
    @Step
    public void clickLanjutkan(){
        $(LanjutkanBT()).click();
    }
    @Step
    public void clickSimpanPerubahan(){
        $(SimpanPerubahanBT()).click();
    }
    @Step
    public void inputHargaTiket1(String hargaTiket){
        $(hargaTiket1Field()).type(hargaTiket);
    }
    @Step
    public void inputHargaTiket2(String hargaTiket2){
        $(hargaTiket2Field()).type(hargaTiket2);
    }
    @Step
    public void inputHargaTiket3(String hargaTiket3){
        $(hargaTiket3Field()).type(hargaTiket3);
    }
    @Step
    public void AddGerbong(){
        $(TambahGerbongBT()).click();
    }
    @Step
    public void chooseTipeGerbong(){
        $(TipeGerbongSelect()).click();
    }
    @Step
    public void chooseTipeGerbongEkonomi(){
        $(TipeGerbongEkonomiSelect()).click();
    }
    @Step
    public void inputGerbongName(String namaGerbong){
        $(NamaGerbongField()).type(namaGerbong);
    }
    @Step
    public void clickSimpanKA(){
        $(SimpanKABT()).click();
    }
    @Step
    public void clickSimpanDataKA(){
        $(SimpanDataKABT()).click();
    }
    @Step
    public void validateSaveANewKA(){
        $(succesSaveKaValidate()).isDisplayed();
    }
    @Step
    public void backToMenuDaftarKA(){
        $(menuKA()).isDisplayed();
    }
    @Step
    public void validateCantLanjutkanAndSave(){
        $(LanjutkanBT()).isDisabled();
    }
    @Step
    public void validateUserStayOnPage1ofTambahKA(){
        $(tambahKADashboard()).isDisplayed();
    }
    @Step
    public void validateUserMustInputPriceOfTrain(){
        $(hargaTiket1Field()).isDisplayed();
    }
    @Step
    public void chooseFilterKA(){
        $(filterKADashboard()).click();
    }
    @Step
    public void chooseInactiveKAFilter(){
        $(filterInactiveKADashboard()).click();
    }
    @Step
    public void clickTetapkanFilterKABT(){
        $(TetapkanFilterInactiveKADashboardBT()).click();
    }
    @Step
    public void validateInactiveKAOnPage(){
        $(PageOfListInactiveKA()).isDisplayed();
    }
    @Step
    public void clickRute2() {
        $(ClickRute2()).click();
    }
    @Step
    public void inputJamTiba2(String jamtiba) {
        $(JamTibaField1()).type(jamtiba);
    }

    public void ClickLanjutkan() {
        $(LanjutkanButton()).click();
    }

    public void ClickSimpanPerubahan() {
        $(SimpanPerubahanBtn()).click();
    }
}
