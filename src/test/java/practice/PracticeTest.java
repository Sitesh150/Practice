package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class PracticeTest {

    @Test
    public void runTest() {
        String input = "ABCDEFJHIJK";
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        webDriver.get("https://www.google.com/");
        WebElement value = webDriver.findElement(By.id("APjFqb"));
        value.sendKeys(input);
        String text = value.getAttribute("value");
        System.out.println(text);
        Assert.assertEquals(input, text);
        webDriver.quit();
    }
}
