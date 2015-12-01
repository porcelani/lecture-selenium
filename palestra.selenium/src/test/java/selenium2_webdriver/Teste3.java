package selenium2_webdriver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Teste3 {

    @Test
    public void seletores() {

        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com.br");

        WebElement usuariologin = driver.findElement(By.id("usuariologin"));
        driver.findElement(By.name("usuariosenha"));
        driver.findElement(By.className(""));
        driver.findElement(By.linkText(""));
        driver.findElement(By.cssSelector(".btn.btn-medium.btn-primary"));

        driver.findElement(By.tagName("iframe"));

        driver.quit();
        //http://www.seleniumhq.org/docs/03_webdriver.jsp
    }
}

