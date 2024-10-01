package playwright;

import com.microsoft.playwright.*;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class MaximizeWindowsTest {

    @Test
    public void maxWindow(){

        Playwright playwright = Playwright.create();
        ArrayList<String> arguments = new ArrayList<>();
        arguments.add("--start-maximized");
        Browser browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false).setArgs(arguments));
        BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));

        Page page = context.newPage();

        page.navigate("http://way2automation.com");
        System.out.println(page.title());
    }
}
