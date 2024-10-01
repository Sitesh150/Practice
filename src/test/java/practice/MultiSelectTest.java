package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class MultiSelectTest {

    @Test(groups = "@smoke")
    public void run_9(){
        System.out.println("From @Test-9");
    }

    @Test()
    public void run_10(){
        System.out.println("From @Test-10");
    }

    @Test(groups = "@smoke")
    public void run_11(){
        System.out.println("From @Test-11");
    }

    @Test
    public void fileUpload() throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        webDriver.get("https://tus.io/demo");
        WebElement uploadFile = webDriver.findElement(By.xpath("//input[@type='file']"));
        Thread.sleep(2000);
        uploadFile.sendKeys("C:\\Schneider\\Sudha_Gudagi.pdf");
    }
}
