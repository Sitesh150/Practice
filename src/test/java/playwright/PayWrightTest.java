package playwright;

import com.microsoft.playwright.*;
import org.testng.annotations.Test;

public class PayWrightTest {

    @Test
    public void runPlayWright() {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext browserContext = browser.newContext(new Browser.NewContextOptions().setViewportSize(1920, 1080));
        Page page = browserContext.newPage();
        page.navigate("https://www.google.com");
        System.out.println(page.title());
        playwright.close();
    }
}
