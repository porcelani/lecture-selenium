package page_object.google;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import page_object.google.page.GoogleSearchPage;

public class GoogleSearchTest {

    @Test
    public void should_search() {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com/");

        GoogleSearchPage page = PageFactory.initElements(driver, GoogleSearchPage.class);

        page.searchFor("coxinha");
    }

//    https://code.google.com/p/selenium/wiki/PageFactory
}