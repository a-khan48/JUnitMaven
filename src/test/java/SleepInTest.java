package org.UnitTesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class SleepInTest {

    @DisplayName("Test sleepIn() method")
    @Test
    public void testSleepIn_NotWeekdayAndNotVacation() {
        SleepIn sleepIn = new SleepIn();
        boolean result = sleepIn.sleepIn(false, false);
        Assertions.assertTrue(result);
    }

    @Test
    public void testSleepIn_NotWeekdayAndVacation() {
        SleepIn sleepIn = new SleepIn();
        boolean result = sleepIn.sleepIn(false, true);
        Assertions.assertTrue(result);
    }

    @Test
    public void testSleepIn_WeekdayAndVacation() {
        SleepIn sleepIn = new SleepIn();
        boolean result = sleepIn.sleepIn(true, true);
        Assertions.assertTrue(result);
    }
}
