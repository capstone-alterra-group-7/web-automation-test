package starter.pages.Logout;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class LogoutPage extends PageObject {

    private By BtnLogout() {
        return By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/button");
    }

    private By clickBtnTetapLogout() {
        return By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[2]/div/div/button[2]");
    }
    public void clickButtonLogout() {
        $(BtnLogout()).click();
    }

    public void clickButtonTetapLogout() {
        $(clickBtnTetapLogout()).click();
    }
}
