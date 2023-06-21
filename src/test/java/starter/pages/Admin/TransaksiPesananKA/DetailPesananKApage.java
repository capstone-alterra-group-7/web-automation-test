package starter.pages.Admin.TransaksiPesananKA;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DetailPesananKApage  extends PageObject {
    // =============================== Locator ===============================
    private By BtnPesananKA() {
        return By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div[4]/div/a[1]");
    }

    private By PesananKAPage() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[1]/div/h1");
    }

    private By btnDataPesananKA() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]");
    }

    private By WaitingDataPesananKA() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]");
    }

    private By DetailPesananKAPage() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/h1");
    }
    //=============================================== Functional ======================================================

    @Step
    public void clickMenuPesananKA() {
        $(BtnPesananKA()).click();
    }

    @Step
    public void onPesananKApage() {
        $(PesananKAPage()).shouldBeVisible();
    }

    @Step
    public void clickDataPesananKA() {
        $(btnDataPesananKA()).click();
    }
    @Step
    public void seeDetailKApage() {
        $(DetailPesananKAPage()).shouldBeVisible();
    }
    @Step
    public void waitingDataPesananKA() {
        open();
        $(WaitingDataPesananKA()).shouldBeVisible();
    }
}
