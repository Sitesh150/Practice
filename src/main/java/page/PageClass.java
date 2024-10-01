package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageClass {

    public PageClass(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(id = "APjFqb")
    private WebElement search;

    @FindBy(xpath = "//h3[text()='WhatsApp Web']...")
    private WebElement whatsapp;

    public WebElement getSearch() {
        return search;
    }

    public WebElement getWhatsapp() {
        return whatsapp;
    }

    public void enterText() {
        getSearch().sendKeys("whatsApp" + Keys.ENTER);
        getWhatsapp().click();
    }
}
