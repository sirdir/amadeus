package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RozetkaMain {

    @FindBy(css = "li[menu_id='3361']>a")
    private WebElement listTelTvEl;

    public void navigateToSideMenu() {
        listTelTvEl.click();
    }

}