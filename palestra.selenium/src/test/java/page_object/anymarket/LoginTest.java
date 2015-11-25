package page_object.anymarket;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import page_object.anymarket.page.LoginPage;

public class LoginTest {

    @Test
    public void should_login() {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://hom.anymarket.com.br:8071/");

        LoginPage page = PageFactory.initElements(driver, LoginPage.class);

        page.login("danilo@example.com","123");
    }

//    https://code.google.com/p/selenium/wiki/PageFactory
}