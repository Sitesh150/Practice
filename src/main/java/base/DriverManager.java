package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManager {

    private static volatile DriverManager browserManager;

    public static DriverManager driverInstance() {
        if (browserManager == null) {
            synchronized (DriverManager.class) {
                if (browserManager == null) {
                    browserManager = new DriverManager();
                }
            }
        }
        return browserManager;
    }

    public WebDriver getDriver() {
        return webdriver.get();
    }

    private static final ThreadLocal<WebDriver> webdriver = new ThreadLocal<>();


    public void openBrowser() {
        if (webdriver.get() == null) {
            webdriver.set(new ChromeDriver());
        }

        webdriver.get().manage().window().maximize();
        webdriver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        webdriver.get().get("https://www.google.co.in/");
    }

    public void closeBrowser() {
        if (webdriver.get() != null) {
            webdriver.get().quit();
            webdriver.remove();
        }
    }
}
