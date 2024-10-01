package utils;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.awt.print.Printable;
import java.io.File;
import java.io.IOException;
import java.util.Date;

public class CommonUtils {
    public String dateAndTime() {
        Date date = new Date();
        return date.toString().replace(" ", "_")
                .replace(":", "_");
    }

    public static Logger getLog() {
        return LogManager.getLogger(Thread.currentThread()
                .getStackTrace()[2].getClassName());
    }

    public void ts(Scenario scenario) throws IOException {
        WebDriver driver = new ChromeDriver();
        if(scenario.isFailed()){
            TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
            File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
            scenario.attach(String.valueOf(source), "target/test.png", source.getName());
        }
    }
}


