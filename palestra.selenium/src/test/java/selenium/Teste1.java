package selenium;

import org.junit.Test;
import org.openqa.jetty.html.Element;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Teste1 {

    @Test
    public void abrindoFirefox() {

        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com.br");

        driver.quit();       //Fecha o browser mesmo que existam diversas janelas
//      driver.close();      //Fecha a janela atual.Se for a ultima janela, fecha também o browser.

    }
}

