import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

public class GooglePage {
    private final String url = "https://www.google.com/";

    public GooglePage() {
        Selenide.open(url);
    }

    private final SelenideElement winSearch= $x("//input[@class='gLFyf gsfi' and @name='q']");

    public void clickOnSearch(String massage){
        winSearch.sendKeys(massage, Keys.ENTER);
    }
}