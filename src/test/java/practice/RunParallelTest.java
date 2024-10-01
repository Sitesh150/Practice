package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class RunParallelTest {

    @Parameters("browser")
    @Test
    public void runParallel(String browser){
        String base_url = "https://www.google.com/";
        if(browser.equalsIgnoreCase("chrome")) {
            WebDriver webDriver = new ChromeDriver();
            webDriver.manage().window().maximize();
            webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            webDriver.navigate().to(base_url);
        }
        else if (browser.equalsIgnoreCase("firefox")){
            WebDriver webDriver = new FirefoxDriver();
            webDriver.manage().window().maximize();
            webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            webDriver.navigate().to(base_url);
        }
    }
}
