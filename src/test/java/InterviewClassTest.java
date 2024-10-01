import org.testng.annotations.Test;


public class InterviewClassTest {

    @Test
    public void sortTheList() {

        int[] arr = {4, 5, 6, 1, 9};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp;
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int j : arr) {
            System.out.println(j);
        }
    }

    @Test
    public void readFile() throws InterruptedException {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException interruptedException) {
            throw new InterruptedException(interruptedException.toString());
        }
    }

    @Test
    public void readFi() throws RuntimeException {
        try {
            int a = 5 / 2;
            System.out.println(a);
        }
       catch (RuntimeException runtimeException){
            runtimeException.printStackTrace();
       }
    }
}
