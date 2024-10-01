package practice;

import org.testng.annotations.Test;

public class RunInterFaceTest implements NewInterface{

    @Test
    public void getFromInterface(){
        NewInterface RunInterFaceTest = new RunInterFaceTest();
        RunInterFaceTest.inf();
    }
}
