package tc;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.Phones;
import pages.PhonesTVTech;
import pages.RozetkaMain;
import pages.SmartPhones;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sirdir on 23.04.17.
 */
public class TestRozetka extends BaseTest{

    @Test
    public Map<String, String> topSales(){
        driver.get("http://rozetka.com.ua/");
        RozetkaMain rozetkaMain = PageFactory.initElements(driver, RozetkaMain.class);
        rozetkaMain.navigateToSideMenu();
        PhonesTVTech phonesTVTech = PageFactory.initElements(driver, PhonesTVTech.class);
        phonesTVTech.navigateToSideMenu();
        Phones phones = PageFactory.initElements(driver, Phones.class);
        phones.navigateToSideMenu();
        SmartPhones smartPhones = PageFactory.initElements(driver, SmartPhones.class);
        Map<String, String> ropSales = new HashMap<>();
        ropSales.putAll(smartPhones.getAllTopSales());
        smartPhones.nextPage();
        ropSales.putAll(smartPhones.getAllTopSales());
        smartPhones.nextPage();
        ropSales.putAll(smartPhones.getAllTopSales());
        //collect top sales
        return ropSales;
    }

}