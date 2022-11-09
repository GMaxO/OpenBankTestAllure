import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$x;

public class OpenPage{

    private final WebElement usdBuy = $x("//span[contains(@class, 'ant-typography open-ui-text open-ui-text-theme-default largeText main-page-exchange__currency-name') and text() = 'USD']/../../following-sibling::td[1]");
    private final WebElement usdSale = $x("//span[contains(@class, 'ant-typography open-ui-text open-ui-text-theme-default largeText main-page-exchange__currency-name') and text() = 'USD']/../../following-sibling::td[3]");
    private final WebElement eurBuy = $x("//span[contains(@class, 'main-page-exchange__currency-name') and text() = 'EUR']/../../following-sibling::td[1]//span");
    private final WebElement eurSale = $x("//span[contains(@class, 'main-page-exchange__currency-name') and text() = 'EUR']/../../following-sibling::td[3]//span");

    public boolean compareUSD(){
        float x = Float.parseFloat(usdSale.getText().replace(',', '.'));
        float v = Float.parseFloat(usdBuy.getText().replace(',', '.'));
        if (x > v) {
            return true;
        } else {
            return false;
        }
    }
    public boolean compareEUR(){
        float x = Float.parseFloat(eurSale.getText().replace(',', '.'));
        float v = Float.parseFloat(eurBuy.getText().replace(',', '.'));
        if (x > v) {
            return true;
        } else {
            return false;
        }
    }
}