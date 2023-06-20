package starter.pages.Admin.DaftarPengguna;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class EditPenggunaPage extends PageObject {
    // =============================== Locator ===============================
    private By dataPengguna() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div/div/table/tbody[2]/tr");}

    private By titleDetailPengguna() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/h1");}

    private By BtnEdit() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div/div[2]/button[1]");}

    private By editEmail() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div[1]/input");}

    private By editPassword() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div[2]/input");}

    private By editKonfirmasiPassword() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div[3]/input");}

    private By editNamaPengguna() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[3]/div[1]/input");}

    private By editTanggalLahir() {
        return By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[3]/div[2]/input");}

    private By editNomorHandphone() {
        return By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[3]/div[3]/input");}

    //=============================================== Functional ======================================================
    public void userClickBtnDataPengguna() {
        $(dataPengguna()).click();
    }

    public void userOnDetailPengguna() {
        $(titleDetailPengguna()).shouldBeVisible();
    }

    public void clickBtnEdit() {
        $(BtnEdit()).click();
    }

    public void EditEmailField(String editEmailField) {
        $(editEmail()).type(editEmailField);
    }

    public void EditPasswordField(String editPasswordField) {
        $(editPassword()).type(editPasswordField);
    }

    public void EditKonfirmasiPasswordField(String editKonfirmasiPasswordField) {
        $(editKonfirmasiPassword()).type(editKonfirmasiPasswordField);
    }

    public void EditNamaPengguna(String editNamaPenggunaField) {
        $(editNamaPengguna()).type(editNamaPenggunaField);
    }

    public void EditTanggalLahir(String editTanggalLahirField) {
        $(editTanggalLahir()).type(editTanggalLahirField);
    }

    public void EditNomorHandphone(String editNomorHandphoneField) {
        $(editNomorHandphone()).type(editNomorHandphoneField);
    }
}
