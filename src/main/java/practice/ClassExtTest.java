package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class ClassExtTest extends AbstractClassTest {
    @Test
    public void fromClass() {
        ClassExtTest ClassExtTest = new ClassExtTest();
        ClassExtTest.interfaceMethod();
        System.out.println("FromClass");
    }

    @Test
    public void check(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        List<WebElement> ALL = driver.findElements(By.xpath("//td/ancestor::tr/td"));
        for (WebElement webElement : ALL) {
            System.out.print(webElement.getText() + "\n");
        }
    }
}
