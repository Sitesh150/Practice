package docker;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;

public class DockerWithChromeTest {

    @Test
    public void dockerWithChrome() throws MalformedURLException {
        ChromeOptions chromeOptions = new ChromeOptions();
        URI uri = URI.create("http://localhost:4444/wd/hub");
        RemoteWebDriver driver = new RemoteWebDriver(uri.toURL(), chromeOptions);
        driver.get("https://www.orangehrm.com/");
        String title = driver.getTitle();
        System.out.println(title);
    }

    @Test
    public void chrome() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.orangehrm.com/");
        String title = driver.getTitle();
        final String expectedTitle = "Human Resources Management Software | OrangeHRM";
        System.out.println("Page Title is : "+ title);
        Assert.assertEquals(title, expectedTitle);

    }

}
