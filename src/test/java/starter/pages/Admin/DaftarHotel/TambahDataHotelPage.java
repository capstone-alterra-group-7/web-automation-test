package starter.pages.Admin.DaftarHotel;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.net.URL;

public class TambahDataHotelPage extends PageObject {


    // ================================================ LOCATOR ============================================
    private By BtnDaftarHotel() {
        return By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div[3]/div/a[4]");
    }
    private By BtnTambahHotel() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div/div/button");
    }
    private By BtnTambahkanHotel() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[5]/div/div/button[2]");
    }

    private By uploadImageHotell() {
        return By.xpath("//*[@id=\"imageInput\"]");
    }

    private By namaHotelField() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[3]/div[2]/input");
    }

    private By KelasHotel() {
        return By.xpath("/html/body/div[4]/div/div/div/div[6]/span");
    }

  /*  private By DivKelasHotel() {
        return By.xpath("//*[@id=\"select-wrapper-384257\"]/div/input");
    } */

    private By deskripsiHotelField() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[3]/div[4]/textarea");
    }

    private By nomorTeleponField() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[3]/div[5]/div/div[1]/input");
    }

    private By emailField() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[3]/div[5]/div/div[2]/input");
    }

    private By AlamatHotelField() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[3]/div[6]/textarea");
    }

    private By clickTambahFasilitas() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[3]/div[7]/button");
    }

    private By NamaFasilitasField() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[3]/div[7]/div/input");
    }

    private By ClickTabKebijakanHotel() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[2]");
    }

    private By ClickTabDaftarKamar() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[3]");
    }

    private By ClickTambahKamar() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[3]/div/button");
    }

    private By NamaKamarField() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[4]/div[2]/div/div[2]/div[2]/input");
    }

    private By UkuranKamarField() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[4]/div[2]/div/div[2]/div[3]/div[1]/div/input");
    }

    private By JumlahKamarField() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[4]/div[2]/div/div[2]/div[3]/div[2]/input");
    }
    private By DeskripsiKamarField() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[4]/div[2]/div/div[2]/div[4]/textarea");
    }

    private By ClickTambahFasilitasKamar() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[4]/div[2]/div/div[2]/div[5]/button");
    }
    private By namaFasilitasKamarField() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[4]/div[2]/div/div[2]/div[5]/div/input");
    }

    private By ClickPenawaranKamar() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[4]/div[2]/div/div[1]/div/div[2]");
    }

    private By HargaKamarMalamField() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[4]/div[2]/div/div[2]/div[1]/div[1]/div/input");
    }

    private By jumlahTamu() {
        return By.xpath("/html/body/div[1]/div/div[2]/div/div[4]/div[2]/div/div[2]/div[1]/div[2]/div/select/option[2]");
    }

    private By tipeKasur() {
        return By.xpath("/html/body/div[1]/div/div[2]/div/div[4]/div[2]/div/div[2]/div[1]/div[3]/div/select/option[2]");
    }

    private By ClickTambahDataKamar() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[4]/div[1]/div/button");
    }

    private By ClickSimpanBtn() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[4]/div[1]/div[2]/div/div/button[2]");
    }

    private By ClickSimpanDataHotel() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div/button");
    }

    private By btnSimpan() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[4]/div/div/button[2]");
    }

    private By hotelPage() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/h1");
    }
    // ================================================ FUNCTIONAL ============================================
    public void clickMenuDaftarHotel() {
        $(BtnDaftarHotel()).click();
    }
    public void clickButtonTambahHotel() {
        $(BtnTambahHotel()).click();
    }

    public void clickBtnTambahkanHotel() {
        $(BtnTambahkanHotel()).click();
    }

    public void uploadImageHotel() {
        $(uploadImageHotell()).sendKeys("D:\\D\\QE_Alta\\capstone\\web-automation-test\\image\\JHL Collection.jpg");
    }

    public void inputNamaHotel(String NamaHotel) {
        $(namaHotelField()).type(NamaHotel);
    }

    public void chooseKelasHotel() {
        $(KelasHotel()).click();
    }

   /* public void clickDivKelasHotel() {
        $(DivKelasHotel()).click();
    } */

    public void inputDeskripsiHotel(String DeskripsiHotel) {
        $(deskripsiHotelField()).type(DeskripsiHotel);
    }


    public void inputNomorTelepon(String NomorTelepon) {
        $(nomorTeleponField()).type(NomorTelepon);
    }


    public void inputEmailHotel(String Email) {
        $(emailField()).type(Email);
    }

    public void inputAlamatHotel(String alamatHotel) {
        $(AlamatHotelField()).type(alamatHotel);
    }


    public void clickTambahkanFasilitas() {
        $(clickTambahFasilitas()).click();
    }

    public void inputNamaFasilitas(String NamaFasilitas) {
        $(NamaFasilitasField()).type(NamaFasilitas);
    }

    public void clickTabKebijakanHotel() {
        $(ClickTabKebijakanHotel()).click();
    }

    public void clickTabDaftarKamar() {
        $(ClickTabDaftarKamar()).click();
    }


    public void clickTambahKamar() {
        $(ClickTambahKamar()).click();
    }

    public void uploadImageKamar() {
        $(uploadImageHotell()).sendKeys("D:\\D\\QE_Alta\\capstone\\web-automation-test\\image\\kamar1.jpg");
    }

    public void inputNamaKamar(String NamaKamar) {
        $(NamaKamarField()).type(NamaKamar);
    }

    public void inputUkuranKamar(String UkuranKamar) {
        $(UkuranKamarField()).type(UkuranKamar);
    }

    public void inputJumlahKamar(String JumlahKamar) {
        $(JumlahKamarField()).type(JumlahKamar);
    }


    public void inputDeskripsiKamar(String DeskripsiKamar   ) {
        $(DeskripsiKamarField()).type(DeskripsiKamar);
    }


    public void clickTambahFasilitasKamar() {
        $(ClickTambahFasilitasKamar()).click();
    }

    public void InputNamaFasilitasKamar(String DeskripsiKamar) {
        $(namaFasilitasKamarField()).type(DeskripsiKamar);
    }

    public void clickTabPenawaranKamar() {
        $(ClickPenawaranKamar()).click();
    }

    public void InputHargaKamarMalam(String HargaKamar) {
        $(HargaKamarMalamField()).type(HargaKamar);
    }
   /* public void clickfieldHargaKamar( ) {
        $(HargaKamarMalamField())
                .click();
    } */

    public void chooseJumlahTamu() {
        $(jumlahTamu()).click();
    }

    public void chooseTipeKasur() {
        $(tipeKasur()).click();
    }

    public void clickTambahDataKamar() {
        $(ClickTambahDataKamar()).click();
    }

    public void clickSimpanBtn() {
        $(ClickSimpanBtn()).click();
    }

    public void clickSimpanDataHotel() {
        $(ClickSimpanDataHotel()).click();
    }

    public void clickSimpan() {
        $(btnSimpan()).click();
    }

    public void dataHotelSuccessAndSeeHotelPage() {
        $(hotelPage()).shouldBeVisible();
    }
}
