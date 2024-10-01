package practice;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.LinkedList;


public class MultiTest {

    private MultiTest(){

    }

    @Parameters({"firstname"})
    @Test()
    public void run_3(@Optional("name") String firstName) {
        System.out.println(firstName);
    }

    @Test
    public void text() {
        String string = "https://designportalstage.apc.com/sol/reports/page/pricingReport.htm?solutionId=95D6DA72-A581-4B42-84C8-0D95C82F1886&priceType=ERP&lineItem=0&weightDimension=1&distyId=distyId&reportType=DQR&exportType=PDF";
        String[] value = string.split("=");
        String[] actValue = value[1].split("&");
        System.out.println(actValue[0].trim());
    }

    public void run() {
        String input = "Ashish Pandit";
        String[] names = input.split(" ");
        String reversedName = names[1] + " " + names[0];

        System.out.println("Input: " + input);
        System.out.println("Output: " + reversedName);
    }

    @Test
    public void runDouble() {
        LinkedList<String> ll = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            ll.add("5");
            ll.add("1");
            ll.add("0");
            ll.add("9");
        }
        ll.remove(2);
        System.out.println(ll.get(2));
    }

    @Test
    public void ill(){
        MultiTest multiTest = new MultiTest();
        multiTest.run();
    }
}

