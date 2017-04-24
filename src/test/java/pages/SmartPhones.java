package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sirdir on 23.04.17.
 */
public class SmartPhones {

    @FindBy(css = "div.g-i-tile.g-i-tile-catalog[data-split='1']")
    private List<WebElement> listBox;

    @FindBy(css = "li.paginator-catalog-l-i.active ~ li.paginator-catalog-l-i")
    private WebElement btnNextPage;

    public Map<String, String> getAllTopSales() {
        Map<String, String> list = new HashMap<>();
        for (WebElement el : listBox) {
            By topSalesLocator = By.cssSelector("i.g-tag-icon-middle-popularity");
            if (el.findElements(topSalesLocator).size()>0){
                String name = el.findElement(By.cssSelector("div.g-i-tile-i-title")).getText();
                String price = el.findElement(By.cssSelector("div.g-price-uah")).getText();
                list.put(name, price);
            }
        }
        return list;
    }

    public void nextPage() {
        btnNextPage.click();
    }
}