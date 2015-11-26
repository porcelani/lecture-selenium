import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertTrue;

public class AnymarketTester {
    public static void main(String[] args) {

        while (true) {
            try {
                WebDriver driver = new FirefoxDriver();
                driver.manage().window().maximize();
                driver.get("http://192.168.170.248:8080");

                WebElement login = driver.findElement(By.id("username"));
                login.sendKeys("camila@example.com");

                WebElement senha = driver.findElement(By.name("password"));
                senha.sendKeys("123");

                login.submit();

                WebElement anymarket = driver.findElement(By.linkText("Anymarket"));
                assertTrue(anymarket.isDisplayed());

                WebElement aguarde = driver.findElement(By.xpath(".//*[@id='container']/div/div[2]/div[2]/div/ul/li[2]/span"));
                if (aguarde.getText().equals("Aguarde...")) {

                    waitTempo(3);
                    WebElement aguarde2 = driver.findElement(By.xpath(".//*[@id='container']/div/div[2]/div[2]/div/ul/li[2]/span"));
                    if (aguarde2.getText().equals("Aguarde...")) {
                        sendEmail("Erro no Aguarde");
                    }

                    driver.quit();
                }

            } catch (Exception e) {
                sendEmail("Erro no Login");
            }

            waitTempo(10);
        }
    }

    private static void sendEmail(String s) {
        System.out.println(s);
    }

    private static void waitTempo(int i) {
        try {
            Thread.sleep(1000*i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
