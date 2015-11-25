package selenium_webdriver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Teste3 {

    @Test
    public void seletores() {

        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com.br");

        driver.findElement(By.id("usuariologin"));
        driver.findElement(By.name("usuariosenha"));
        driver.findElement(By.tagName(""));
        driver.findElement(By.cssSelector(".btn.btn-medium.btn-primary"));

        driver.quit();
    }
}

