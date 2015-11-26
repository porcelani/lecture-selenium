package selenium_webdriver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class Teste4 {


    @Test
    public void testeLoginSucesso() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://hom.anymarket.com.br:8072");

        WebElement login = driver.findElement(By.id("username"));
        login.sendKeys("camila@example.com");

        WebElement senha = driver.findElement(By.name("password"));
        senha.sendKeys("123");

        login.submit();

        WebElement anymarket = driver.findElement(By.linkText("Anymarket"));
        assertTrue(anymarket.isDisplayed());

        driver.quit();

        //Espera Implicita
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Espera Explicita(Thread s)
        // WebDriverWait wait = new WebDriverWait(driver, 10);
        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("botaoOk")));

        //http://stefanteixeira.com.br/2014/04/29/entendendo-os-tipos-de-esperas-no-selenium-webdriver/
    }

}

