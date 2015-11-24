package selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Teste3 {

    @Test
    public void seletores() {

        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com.br");

        driver.findElement(By.id("usuariologin"));
        driver.findElement(By.name("usuariosenha"));
        driver.findElement(By.cssSelector(".btn.btn-medium.btn-primary"));

        driver.quit();
    }

//    @Test
//    public void abrindoFindElement() {
//        WebDriver driver = new FirefoxDriver();
//        driver.get("http://planned.by/quickloja");
//
//        driver.findElement(By.id("usuariologin"));
//        driver.findElement(By.name("usuariosenha"));
//        driver.findElement(By.cssSelector(".btn.btn-medium.btn-primary"));
//
//        driver.quit();
//    }
//
//    @Test
//    public void testeLogin() {
//        WebDriver driver = new FirefoxDriver();
//        driver.get("http://planned.by/quickloja");
//
//        WebElement login = driver.findElement(By.id("usuariologin"));
//        login.sendKeys("admin");
//
//        WebElement botao = driver.findElement(By.cssSelector(".btn.btn-medium.btn-primary"));
//        botao.click();
//
//        WebElement error = driver.findElement(By.cssSelector(".alert.alert-error"));
//        Assert.assertEquals("Usuário ou senha incorretos", error.getText());
//        driver.quit();
//    }
//
//    @Test
//    public void testeLoginSucesso() {
//        WebDriver driver = new FirefoxDriver();
//        driver.manage().window().maximize();
//        driver.get("http://planned.by/quickloja");
//
//        WebElement login = driver.findElement(By.id("usuariologin"));
//        login.sendKeys("teste");
//
//        WebElement senha = driver.findElement(By.name("usuariosenha"));
//        senha.sendKeys("123");
//
//        WebElement botao = driver.findElement(By.cssSelector(".btn.btn-medium.btn-primary"));
//        botao.click();
//
//        driver.get("http://www.planned.by/quickloja/movimentacao");
//
//        WebElement novaMovimentacao = driver.findElement(By.linkText("Nova movimentação"));
//        novaMovimentacao.click();
//
//        WebElement combo = driver.findElement(By.cssSelector(".mandatory"));
//        Select select = new Select(combo);
//        select.selectByVisibleText("Saída");
//
//        WebElement movimentacaovalor = driver.findElement(By.name("movimentacaovalor"));
//        movimentacaovalor.sendKeys("3000");
//
//        WebElement movimentacaoitens = driver.findElement(By.name("movimentacaoitens"));
//        movimentacaoitens.sendKeys("bapsfasfa  asflçnapfs aspfafpsa");
//
//        WebElement gravar = driver.findElement(By.cssSelector(".btn.btn-primary"));
//        gravar.click();
//
//        WebElement sucesso = driver.findElement(By.cssSelector(".alert.alert-success"));
//        Assert.assertEquals("Sucesso ao inserir a movimentação", sucesso.getText());
//
//        driver.quit();
//    }
//
//    @Test
//    public void testePedidoSucesso() {
//        WebDriver driver = new FirefoxDriver();
//        driver.manage().window().maximize();
//        WebDriverWait wait = new WebDriverWait(driver, 30);
//        driver.get("http://planned.by/quickloja");
//
//        WebElement login = driver.findElement(By.id("usuariologin"));
//        login.sendKeys("teste");
//
//        WebElement senha = driver.findElement(By.name("usuariosenha"));
//        senha.sendKeys("123");
//
//        WebElement botao = driver.findElement(By.cssSelector(".btn.btn-medium.btn-primary"));
//        botao.click();
//
//        driver.get("http://www.planned.by/quickloja/pedido/novopedido");
//
//        WebElement novaMovimentacao = driver.findElement(By.linkText("Itens do pedido"));
//        novaMovimentacao.click();
//
//
//        WebElement produto = driver.findElement(By.id("produtonome"));
//        produto.sendKeys("Camisa");
//
//        By cssSelector = By.cssSelector("li[data-value='Camisa Gant The Banker Rosa']");
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(cssSelector));
//
//        WebElement findElement = driver.findElement(cssSelector);
//        findElement.click();
//
//        driver.quit();
//    }


    //PO  - Page Object onde pesquisar
    //slade share - Abstract lawer By: Evil Tester
    //Google code, wiki com os @FindBy e PageFactory

}

