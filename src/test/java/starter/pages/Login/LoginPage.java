package starter.pages.Login;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    private By btnLogin() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/button");
    }
    public void clickBtnLogin() {
        $(btnLogin()).click();
    }
}
