package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class EditKAPage extends PageObject {

    // =============================== Locator ===============================
    private By dataKAactive() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[6]");}

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
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/h1");}
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
}
