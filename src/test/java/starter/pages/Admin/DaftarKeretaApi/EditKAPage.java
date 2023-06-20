package starter.pages.Admin.DaftarKeretaApi;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class EditKAPage extends PageObject {

    // =============================== Locator ===============================
    private By dataKAactive() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[4]");}

    private By clickButtonUbahKA() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[1]/div/div/button[1]");}

    private By clickUbah() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[3]/div/div/button[2]");}

    private By NamaKeretaField() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div[1]/div[2]/div/input");}

    private By clickSimpanPerubahanKA() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div/button");}

    private By clickSimpanPerubahan() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[3]/div/div/button[2]");}

    private By titleDaftarKA() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]");}
    private By tambahRuteBtn() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div[2]/div/button");}

    private By pilihPerjalanan() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div[4]/div/div[1]/div[2]/div[2]/input");}

    private By tambahkanRuteButton() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div[4]/div/div[2]/button[2]");}
    private By clickJamTiba() {
        return By.xpath("/html/body/div/div/div[2]/div/div[2]/div[2]/div[3]/div/div/div[2]/input");}

    //=============================================== Functional ======================================================

    public void clickDataKAactive() {
        $(dataKAactive()).click();
    }

    public void klikButtonUbahKA() {
        $(clickButtonUbahKA()).click();
    }

    public void klikUbah() {
        $(clickUbah()).click();
    }

    public void inputNamaKereta(String NamaKereta) {
        $(NamaKeretaField()).type(NamaKereta);
    }

    public void klikSimpanPerubahanKA() {
        $(clickSimpanPerubahanKA()).click();
    }

    public void klikSimpanPerubahan() {
        $(clickSimpanPerubahan()).click();
    }

    public void seeDaftarKApage() {
        $(titleDaftarKA()).shouldBeVisible();
    }

    public void ButtonTambahRute() {
        $(tambahRuteBtn()).click();
    }

    public void ButtonPilihPerjalanan() {
        $(pilihPerjalanan()).click();
    }

    public void clickTambahkanRute() {
        $(tambahkanRuteButton()).click();
    }

    public void inputJamTiba(String JamTiba) {
        $(clickJamTiba()).type(JamTiba);
    }
}
