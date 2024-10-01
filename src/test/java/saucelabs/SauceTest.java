package saucelabs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.time.Duration;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class SauceTest {

    @Test
    public void runSauceLabsTest() throws MalformedURLException {
        ChromeOptions browserOptions = getChromeOptions();

        URI uri = URI.create("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
        RemoteWebDriver remoteWebDriver = new RemoteWebDriver(uri.toURL(), browserOptions);

        remoteWebDriver.get("https://www.orangehrm.com/");
        remoteWebDriver.manage().window().maximize();
        remoteWebDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }

    private static ChromeOptions getChromeOptions() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPlatformName("Windows 11");
        chromeOptions.setBrowserVersion("latest");
        Map<String, Object> sauceOptions = new HashMap<>();
        sauceOptions.put("username", "oauth-spvishwakarma964-593f1");
        sauceOptions.put("accessKey", "566272ca-d9e7-497e-908c-d240f813e063");
        sauceOptions.put("build", "selenium-build-47FV0");
        sauceOptions.put("name", "First1_Test");
        chromeOptions.setCapability("sauce:options", sauceOptions);
        return chromeOptions;
    }

    @Test
    public void runGet(){
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        webDriver.get("https://www.google.com/");
        webDriver.get("https://www.flipkart.com/");
    }

    @Test
    public void runNavigate(){
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        webDriver.navigate().to("https://www.google.com/");
        webDriver.navigate().back();
        webDriver.navigate().to("https://www.flipkart.com/");
    }

    @Test
    public void AlertHandle(){
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Alert alert = webDriver.switchTo().alert();
        alert.accept();
        alert.sendKeys("");
    }

    @Test
    public void systemDate() {
        Date date = new Date();
        String completeDateAndTime = date.toString();
        String dayAndMonth = completeDateAndTime.substring(0, 19);
        String dateCorrect = dayAndMonth.replaceAll(" ", "_").replaceAll(":", "_");
        System.out.println(dateCorrect);
    }

    public static String[] multiStrings(String... string){
        return string;
    }

    @Test
    public void getMultiString(){
        String[] string  = multiStrings("Aashish", "Deepak", "Sachin", "Rahul", "Shyam", "Vishal");
        for (String strings : string) {
            System.out.println(strings);
        }
    }
}
