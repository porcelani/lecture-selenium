package selenium_webdriver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertTrue;

public class Teste1 {

    @Test
    public void abrindoFirefox() {

        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com.br");

        WebElement logo = driver.findElement(By.id("lst-ib"));

        assertTrue(logo.isEnabled());

        driver.quit();       //Fecha o browser mesmo que existam diversas janelas
//      driver.close();      //Fecha a janela atual.Se for a ultima janela, fecha também o browser.

    }
}

