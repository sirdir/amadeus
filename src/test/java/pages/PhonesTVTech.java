package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by sirdir on 23.04.17.
 */
public class PhonesTVTech {

    @FindBy(css = "ul#menu_categories_left a[href*='/telefony/']")
    private WebElement listTel;

    public void navigateToSideMenu() {
        listTel.click();
    }
}