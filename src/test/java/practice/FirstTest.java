package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstTest {

    @Test
    public void runParallel() {
        String base_url = "https://www.google.com/";
            WebDriver webDriver = new ChromeDriver();
            webDriver.manage().window().maximize();
            webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            webDriver.navigate().to(base_url);
    }
}
