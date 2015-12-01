package selenium3_page_object.google.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearchPage {

    @FindBy(name = "q")
    private WebElement searchBox;

    public void searchFor(String text) {
        searchBox.sendKeys(text);
        searchBox.submit();
    }
}