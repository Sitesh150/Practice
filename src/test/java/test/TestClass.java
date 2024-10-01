package test;

import base.BaseClass;
import base.DriverManager;
import org.testng.annotations.Test;
import page.PageClass;
import utils.RetryTestImplement;

public class TestClass extends BaseClass {

    PageClass pageClass;

    @Test()
    public void runTest(){
        pageClass = new PageClass(DriverManager.driverInstance().getDriver());
        pageClass.enterText();
        System.out.println("Started!!");
    }
}
