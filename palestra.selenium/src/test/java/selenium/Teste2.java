package selenium;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Teste2 {

    @Test
    public void abrindoChrome() {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com.br");

        driver.quit();
    }

    //  Palavras chaves: chromedriver
    //  https://sites.google.com/a/chromium.org/chromedriver/home

}

