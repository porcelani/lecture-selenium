import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

import static org.junit.Assert.assertTrue;

public class AnymarketTester {

    static String to = "anymarketdev@db1.com.br";

    // Sender's email ID needs to be mentioned
    static String from = "marcio.scharam@db1.com.br";
    static String accountPassword = "yourpass";

    // Assuming you are sending email from localhost
    static String host = "smtp.db1.com.br";


    public static void main(String[] args) {

        while (true) {
            try {
                WebDriver driver = new FirefoxDriver();
                driver.manage().window().maximize();
                driver.get("http://app.anymarket.com.br");

                WebElement login = driver.findElement(By.id("username"));
                login.sendKeys("camila@example.com");

                WebElement senha = driver.findElement(By.name("password"));
                senha.sendKeys("123");

                login.submit();

                WebElement anymarket = driver.findElement(By.linkText("Anymarket"));
                assertTrue(anymarket.isDisplayed());

                WebElement aguarde = driver.findElement(By.xpath(".//*[@id='container']/div/div[2]/div[2]/div/ul/li[2]/span"));
                if (aguarde.getText().equals("Aguarde...")) {

                    waitTempo(5);
                    WebElement aguarde2 = driver.findElement(By.xpath(".//*[@id='container']/div/div[2]/div[2]/div/ul/li[2]/span"));
                    if (aguarde2.getText().equals("Aguarde...")) {
                        sendEmail("O sistema parece estar apresentando lentidão. Está demorando para responder...");
                    }
                }
                driver.quit();

            } catch (Exception e) {
                sendEmail("Não consegui logar na aplicação.");
            }

            waitTempo(10);
        }
    }

    private static void sendEmail(String s) {
        System.out.println(s);
        try {

            // Get system properties
            Properties properties = System.getProperties();

            // Setup mail server
            properties.setProperty("mail.smtp.host", host);
            properties.setProperty("mail.smtp.port", "587");
            properties.setProperty("mail.smtp.auth", "true");

            Authenticator authenticator = new Authenticator() {
                private PasswordAuthentication pa = new PasswordAuthentication(from, accountPassword);
                @Override
                public PasswordAuthentication getPasswordAuthentication() {
                    return pa;
                }
            };

            // Get the default Session object.
            Session session = Session.getDefaultInstance(properties, authenticator);
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Set Subject: header field
            message.setSubject("Problemas no servidor de produção do anymarket");

            // Now set the actual message
            message.setText(s);

            // Send message
            Transport.send(message);

        } catch (Exception mex) {
            mex.printStackTrace();
        }
    }

    private static void waitTempo(int i) {
        try {
            Thread.sleep(1000 * i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
