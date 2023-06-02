package org.UnitTesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class StringTimesTest {

    @DisplayName("Test stringTimes() method")
    @Test
    public void testStringTimes() {
        // Test 1: Basic scenario
        StringTimes stringTimes = new StringTimes();
        String inputString = "Hi";
        int n = 2;
        String expected = "HiHi";
        String result = stringTimes.stringTimes(inputString, n);
        Assertions.assertEquals(expected, result);

        // Test 2: Empty string
        inputString = "";
        n = 5;
        expected = "";
        result = stringTimes.stringTimes(inputString, n);
        Assertions.assertEquals(expected, result);

        // Test 3: No repetition
        inputString = "Hello";
        n = 0;
        expected = "";
        result = stringTimes.stringTimes(inputString, n);
        Assertions.assertEquals(expected, result);

        // Test 4: Large number of repetitions
        inputString = "abc";
        n = 100;
        expected = "abc".repeat(100);
        result = stringTimes.stringTimes(inputString, n);
        Assertions.assertEquals(expected, result);

        // Test 5: Special characters and numbers
        inputString = "!!!!";
        n = 3;
        expected = "!!!!!!!!!!!!";
        result = stringTimes.stringTimes(inputString, n);
        Assertions.assertEquals(expected, result);
    }
}
