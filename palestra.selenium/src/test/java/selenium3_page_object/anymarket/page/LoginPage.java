package selenium3_page_object.anymarket.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(name = "email")
    private WebElement email;

    @FindBy(name = "password")
    private WebElement password;

    public void login(String usuario, String senha) {
        email.sendKeys(usuario);
        password.sendKeys(senha);
        email.submit();
    }
}
