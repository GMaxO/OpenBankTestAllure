import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SearchPage{

    private final SelenideElement openSateOpenBank = $x("//a[@href = 'https://www.open.ru/']");

    public String getTextOpenLink() {
        return openSateOpenBank.getAttribute("href");
    }

    public void clickSateOpenBank() {
        openSateOpenBank.click();
    }
}