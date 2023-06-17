package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Delete_KA extends PageObject {

    private By email() {
        return By.xpath("/html/body/div/div/div[2]/input");
    }
    private By  password() {
        return By.xpath("/html/body/div/div/div[2]/div/input");
    }

    public By klikmasuk() {
        return By.xpath("/html/body/div/div/div[2]/button");
    }
    private By KAMenu() {
        return By.xpath("/html/body/div/div/div[1]/div/div/div/div[3]/div/a[2]/h1");
    }

    private By Gerbong() {
        return By.xpath("/html/body/div/div/div[2]/div/div[2]/div[11]/h1[1]");
    }

    private By HapusMenu() {
        return By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/div/div/button[2]/span");
    }


    @Step("admin input username")
    public void AdminInputUsername(String email) throws InterruptedException {
        open();
        $(email()).type(email);
        Thread.sleep(1000);
    }

    @Step("admin input password")
    public void AdminInputPassword(String password) throws InterruptedException {
        $(password()).type(password);
        Thread.sleep(1000);
    }


    @Step("click masuk")
    public void ClickMasuk() throws InterruptedException {
        $(klikmasuk()).click();
        Thread.sleep(1000);
    }

    @Step("pilih Kereta Api")
    public void PilihKeretaApi() throws InterruptedException {
        $(KAMenu()).click();
        Thread.sleep(1000);
    }


    @Step("pilih gerbong")
    public void PilihGerbong() throws InterruptedException {
        $(this::Gerbong).click();
        Thread.sleep(1000);
    }

    @Step("Hapus gerbong")
    public void HapusGerbong() throws InterruptedException {
        $(this::HapusMenu).click();
        Thread.sleep(1000);
    }





}
