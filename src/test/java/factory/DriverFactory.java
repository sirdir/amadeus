package factory;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.EdgeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by sirdir on 23.04.17.
 */
public class DriverFactory {

    public WebDriver getBrowser(Browser chrome) {
        switch (chrome){
            default:
            case CHROME:
                return initChrome();
            case FIREFOX:
                return initFirefox();
            case EDGE:
                return initFirefox();
            case IE:
                return initFirefox();
        }
    }

    private ChromeDriver initChrome() {
        ChromeDriverManager.getInstance().setup();
        return new ChromeDriver();
    }

    private FirefoxDriver initFirefox() {
        FirefoxDriverManager.getInstance().setup();
        return new FirefoxDriver();
    }

    private EdgeDriver initEdge() {
        EdgeDriverManager.getInstance().setup();
        return new EdgeDriver();
    }

    private InternetExplorerDriver initIe() {
        InternetExplorerDriverManager.getInstance().setup();
        return new InternetExplorerDriver();
    }
}