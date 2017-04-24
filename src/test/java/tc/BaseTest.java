package tc;

import factory.Browser;
import factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * Created by sirdir on 23.04.17.
 */
public class BaseTest {

    protected WebDriver driver;

    @BeforeSuite(alwaysRun = true)
    public void setup(){
        //init db, docker??
    }

    @BeforeTest(alwaysRun = true)
    public void testSetup(){
        DriverFactory df = new DriverFactory();
        driver = df.getBrowser(Browser.CHROME);
    }

    @AfterTest(alwaysRun = true)
    public void cleanUp(){
        driver.quit();
    }

    @AfterSuite(alwaysRun = true)
    public void tearDown(){
        //db clean?? docker ??
    }
}