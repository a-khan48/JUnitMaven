package org.UnitTesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;


public class DoubleXTest {
    @DisplayName("Test doubleX() method")
    @Test
    void testDoubleX() {
        DoubleX doubleX = new DoubleX();

        // Test cases where 'x' is followed by another 'x'
        Assertions.assertTrue(doubleX.doubleX("axxbb"));
        Assertions.assertFalse(doubleX.doubleX("axaxax"));
        Assertions.assertTrue(doubleX.doubleX("xxxxx"));

        // Test cases where 'x' is not followed by another 'x'
        Assertions.assertFalse(doubleX.doubleX("axbxbb"));
        Assertions.assertFalse(doubleX.doubleX("axaxbx"));
        Assertions.assertFalse(doubleX.doubleX("xaxxx"));

        // Test cases where 'x' is not present in the string
        Assertions.assertFalse(doubleX.doubleX("abcde"));
        Assertions.assertFalse(doubleX.doubleX("xylophone"));
    }

}
