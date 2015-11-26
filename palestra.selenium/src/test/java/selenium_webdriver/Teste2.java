package selenium_webdriver;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Teste2 {

    @Test
    public void abrindoChrome() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com.br");

        driver.quit();
        //https://sites.google.com/a/chromium.org/chromedriver/home
    }

    @Test
    public void abrindoHtmlUnit() {
        WebDriver driver = new HtmlUnitDriver();
        driver.get("http://www.google.com.br");

        driver.quit();
        //https://code.google.com/p/selenium/wiki/HtmlUnitDriver
    }
}

