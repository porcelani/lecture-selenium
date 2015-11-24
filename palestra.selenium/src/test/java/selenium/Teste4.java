package selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Teste4 {


    @Test
    public void testeLoginSucesso() {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://planned.by/quickloja");

        WebElement login = driver.findElement(By.id("usuariologin"));
        login.sendKeys("teste");

        WebElement senha = driver.findElement(By.name("usuariosenha"));
        senha.sendKeys("123");

        WebElement botao = driver.findElement(By.cssSelector(".btn.btn-medium.btn-primary"));
        botao.click();

        driver.get("http://www.planned.by/quickloja/movimentacao");

        WebElement novaMovimentacao = driver.findElement(By.linkText("Nova movimentação"));
        novaMovimentacao.click();

        WebElement combo = driver.findElement(By.cssSelector(".mandatory"));
        Select select = new Select(combo);
        select.selectByVisibleText("Saída");

        WebElement movimentacaovalor = driver.findElement(By.name("movimentacaovalor"));
        movimentacaovalor.sendKeys("3000");

        WebElement movimentacaoitens = driver.findElement(By.name("movimentacaoitens"));
        movimentacaoitens.sendKeys("bapsfasfa  asflçnapfs aspfafpsa");

        WebElement gravar = driver.findElement(By.cssSelector(".btn.btn-primary"));
        gravar.click();

        WebElement sucesso = driver.findElement(By.cssSelector(".alert.alert-success"));
        Assert.assertEquals("Sucesso ao inserir a movimentação", sucesso.getText());

        driver.quit();
    }

}

