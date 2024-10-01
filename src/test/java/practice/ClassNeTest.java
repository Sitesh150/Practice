package practice;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class ClassNeTest {

    @Test
    public static void myTest() {
        Map<Character, Integer> charFrequency = new HashMap<>();
        charFrequency.put('t', 4);
        charFrequency.put('e', 3);
        charFrequency.put('r', 2);
        charFrequency.put('b', 2);
        System.out.println("Duplicate Elements and their Counts:");
        charFrequency.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

    }

    @Test
    public void countTest() {
        char[] chars = {'t', 't', 't', 't', 'e', 'e', 'e', 'r', 'r', 'B', 'B'};
        Map<Character, Integer> charFrequency = new HashMap<>();
        for (char c : chars) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
