package starter.pages.Admin.DaftarStasiun;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class DaftarStasiun extends PageObject {

    private By email() {
        return By.xpath("/html/body/div/div/div[2]/input");
    }

    @Step("admin input admin username")
    public void InputAdminUsername(String email) throws InterruptedException {

        open();
        $(email()).type(email);
        Thread.sleep(1500);

    }

    private By password() {
        return By.xpath("/html/body/div/div/div[2]/div/input");
    }

    @Step("admin input admin password")
    public void AdminInputPassword(String password) throws InterruptedException {
        $(password()).type(password);
        Thread.sleep(1500);

    }

    private By Klikmasukbutoon() {
        return By.xpath("/html/body/div/div/div[2]/button");
    }

    @Step("click masuk for admin")
    public void ClickMasukForAdmin() throws InterruptedException {
        $(Klikmasukbutoon()).click();
        Thread.sleep(1500);
    }

    private By MenuStasiun() {
        return By.xpath("/html/body/div/div/div[1]/div/div/div/div[3]/div/a[1]/h1");
    }

    @Step("Klik stasiun")
    public void KlikMenuStasiun() throws InterruptedException {
        $(MenuStasiun()).click();
        Thread.sleep(1500);
    }

    private By TambahStasiunMenu() {
        return By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/button");
    }

    @Step("KlikTambahStasiun")
    public void KlikTambahStasiun() throws InterruptedException {
        $(TambahStasiunMenu()).click();
        Thread.sleep(1500);
    }


    private By MenuLanjutanTambahkan() {
        return By.xpath("/html/body/div/div/div[2]/div/div[3]/div/div/button[2]");
    }

    @Step("Klik tambahkan")
    public void KlikMenuTambahkanlagi() throws InterruptedException {
        $(MenuLanjutanTambahkan()).click();
        Thread.sleep(1500);
    }

    private By TambahkanNamaStasiun() {
        return By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[1]/div/input");
    }

    @Step("tambahkan nama stasiun")
    public void IsiNamaStasiun(String Isi) throws InterruptedException {
        $(TambahkanNamaStasiun()).type(Isi);
        Thread.sleep(1500);

    }


    private By TambahkanKodeStasiun() {
        return By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[2]/div[1]/div/input");
    }
    @Step("tambahkan kode stasiun")
    public void InputKodeStasiun(String Kode_Stasiun) throws InterruptedException {
        $(TambahkanKodeStasiun()).type(Kode_Stasiun);
        Thread.sleep(1500);
    }


    private By TambahkanDomisili() {
        return By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[2]/div[2]/div/input");
    }

    @Step("tambahkan domisili")
    public void InputDomisili(String Dom) throws InterruptedException {
        $(TambahkanDomisili()).type(Dom);
        Thread.sleep(1500);
    }


    private By ButtonnTambahStasiun() {
        return By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/button[2]");
    }
    @Step("Klik tambah data stasiun")
    public void LanjutTambah() throws InterruptedException{
     $(ButtonnTambahStasiun()).click();
        Thread.sleep(1500);
    }


    private By SimpanData() {
        return By.xpath("/html/body/div/div/div[2]/div/div[3]/div/div/button[2]");
    }

    @Step("klik simpan")
    public void LanjutSimpan() throws InterruptedException {
        $(SimpanData()).click();
        Thread.sleep(1500);
    }

    private By HalamanMenu() {
        return  By.xpath("/html");
    }

    @Step("Data stasiun terbaru berhasil ditambahkan")
    public void BerhasilTambahStasiun() throws InterruptedException {
        $(HalamanMenu()).shouldBeVisible();
        Thread.sleep(1500);
    }



}