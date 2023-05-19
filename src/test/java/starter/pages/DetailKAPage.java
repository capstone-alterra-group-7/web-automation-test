package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DetailKAPage extends PageObject {

    // =============================== Locator ===============================
    private By dashboardText() {
        return By.xpath("//div[class()='space-y-10']");}

    private By daftarKAButton() {
        return By.xpath("//h1[class()='Daftar KA']");}

    private By dataKAButton() {
        return By.xpath("//div[class()='w-[230px]']");}

    private By detailKAButton(){
        return By.xpath("//div[class()='p-4']");
    }

    //=============================================== Functional ======================================================
    @Step
    public void onHomePage() {
        open();
        $(dashboardText()).shouldBeVisible();
    }

    @Step
    public void clickMenuDaftarKA() {
    $(daftarKAButton()).click();
    }

    @Step
    public void clickDataKA() {
        $(dataKAButton()).click();
    }

    @Step
    public void seeDetailKA() {
        $(detailKAButton()).shouldBeVisible();
    }
}
