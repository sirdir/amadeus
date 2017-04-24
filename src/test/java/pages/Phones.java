package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by sirdir on 23.04.17.
 */
public class Phones {

    @FindBy(css = "ul#menu_categories_left a[href$='filter/preset=smartfon/']")
    private WebElement listSmartTel;


    public void navigateToSideMenu() {
        listSmartTel.click();
    }
}