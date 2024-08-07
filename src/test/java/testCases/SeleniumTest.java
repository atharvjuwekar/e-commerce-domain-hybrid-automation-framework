package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.Platform;
import java.net.URL;

public class SeleniumTest {
    public static void main(String[] args) throws Exception {
        URL remoteUrl = new URL("http://192.168.0.139:4444/wd/hub");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setPlatform(Platform.WINDOWS);

        WebDriver driver = new RemoteWebDriver(remoteUrl, capabilities);
        driver.get("http://www.google.com");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
