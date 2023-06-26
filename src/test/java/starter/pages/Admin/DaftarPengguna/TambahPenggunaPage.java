package starter.pages.Admin.DaftarPengguna;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class TambahPenggunaPage extends PageObject {

    // =============================== Locator ===============================
    private By menuPengguna() {
        return By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div[3]/div/a[5]");}

    private By BtnTambahPengguna() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div/div[2]/button");}

    private By BtnIyaTambahkanPengguna() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[3]/div/div/button[2]");}

    private By SliderKeaktifan() {
        return By.xpath("//*[@id=\"flexSwitchCheckDefault01\"]");}

    private By InputEmailUser() {
        return By.xpath("//*[@id=\"email\"]");}

    private By InputPasswordUser() {
        return By.xpath("//*[@id=\"password\"]");}

    private By InputConfirmPasswordUser() {
        return By.xpath("//*[@id=\"confirm_password\"]");}

    private By InputNamaPengguna() {
        return By.xpath("//*[@id=\"full_name\"]");}

    private By InputTglLahir() {
        return By.xpath("//*[@id=\"birth_date\"]");}

    private By InputNoHP() {
        return By.xpath("//*[@id=\"phone_number\"]");}

    private By BtnSimpanPengguna() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div/div/button");}

    private By BtnIyaSimpanData() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[3]/div/div/button[2]");}

    //=============================================== Functional ======================================================
    public void clickMenuPengguna() {
        $(menuPengguna()).click();
    }

    public void clickBtnTambahPengguna() {
        $(BtnTambahPengguna()).click();
    }

    public void clickBtnIyaTambahkanPengguna() {
        $(BtnIyaTambahkanPengguna()).click();
    }


    public void clickSliderKeaktifanPengguna() {
        $(SliderKeaktifan()).click();
    }

    public void userInputEmail(String fieldEmail) {
        $(InputEmailUser()).type(fieldEmail);
    }

    public void userInputPasswd(String fieldPasswd) {
        $(InputPasswordUser()).type(fieldPasswd);
    }


    public void userInputKonfirmasiPasswd(String fieldConfirmPasswd) {
        $(InputConfirmPasswordUser()).type(fieldConfirmPasswd);
    }

    public void inputNamaPengguna(String NamaPenggunaField) {
        $(InputNamaPengguna()).type(NamaPenggunaField);
    }


    public void inputTglLahir(String TglLahir) {
        $(InputTglLahir()).type(TglLahir);
    }

    public void inputNomorHandphone(String NoHP) {
        $(InputNoHP()).type(NoHP);
    }

    public void clickBtnSimpanPengguna() {
        $(BtnSimpanPengguna()).click();
    }

    public void userCLickIyaSimpanData() {
        $(BtnIyaSimpanData()).click();
    }
}
