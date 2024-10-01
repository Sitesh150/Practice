package cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class OperaRunTest {

    @Test
    public void runOpera(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
