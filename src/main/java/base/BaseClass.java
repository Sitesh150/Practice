package base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.CommonUtils;


public class BaseClass {

    @BeforeClass
    public void openBrowser() {
        CommonUtils.getLog().info("Open the browser");
        DriverManager.driverInstance().openBrowser();
        CommonUtils.getLog().info("Browser is Launched Successfully!");
    }

    @AfterClass
    public void closeBrowser() {
        CommonUtils.getLog().info("Closing the browser");
        DriverManager.driverInstance().closeBrowser();
        CommonUtils.getLog().info("Browser is Closed Successfully!");
    }
}
