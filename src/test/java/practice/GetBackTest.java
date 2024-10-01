package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Collections;

public class GetBackTest {

    @Test
    public void runTest() throws InterruptedException {
        String base_url = "https://www.google.com/";
        String input_texts = "India";

        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        webDriver.navigate().to(base_url);

        WebElement value = webDriver.findElement(By.id("APjFqb"));
        value.sendKeys("india" + Keys.ENTER);

        webDriver.navigate().back();

        String url = webDriver.getCurrentUrl();
        System.out.println(url);

        webDriver.navigate().forward();
        Assert.assertEquals(base_url, url);


        String text = webDriver.findElement(By.xpath("//div[text()='India']")).getText();
        System.out.println(text);
        Assert.assertEquals(input_texts, text);

        webDriver.quit();
    }
}
