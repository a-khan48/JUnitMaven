package org.UnitTesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class FirstLastSixTest {
    @DisplayName("Test firstLastSix() method")
    @Test
    void test1FirstLastSix() {
        FirstLastSix firstLastSix = new FirstLastSix();
        int[] nums = {1,2,6};
        boolean result = firstLastSix.firstLastSix(nums);
        Assertions.assertTrue(result);

    }
    @Test
    void test2FirstLastSix() {
        FirstLastSix firstLastSix = new FirstLastSix();
        int[] nums = {6,1,2,3};
        boolean result = firstLastSix.firstLastSix(nums);
        Assertions.assertTrue(result);

    }
    @Test
    void test3FirstLastSix() {
        FirstLastSix firstLastSix = new FirstLastSix();
        int[] nums = {13,6,1,2,3};
        boolean result = firstLastSix.firstLastSix(nums);
        Assertions.assertFalse(result);

    }
    @Test
    void test4FirstLastSix() {
        FirstLastSix firstLastSix = new FirstLastSix();
        int[] nums = {13, 6, 1, 2, 6};
        boolean result = firstLastSix.firstLastSix(nums);
        Assertions.assertTrue(result);

    }
    @Test
    void test5FirstLastSix() {
        FirstLastSix firstLastSix = new FirstLastSix();
        int[] nums = {3, 2, 1};
        boolean result = firstLastSix.firstLastSix(nums);
        Assertions.assertFalse(result);

    }
    @Test
    void test6FirstLastSix() {
        FirstLastSix firstLastSix = new FirstLastSix();
        int[] nums = {3, 6, 1};
        boolean result = firstLastSix.firstLastSix(nums);
        Assertions.assertFalse(result);

    }
    @Test
    void test7FirstLastSix() {
        FirstLastSix firstLastSix = new FirstLastSix();
        int[] nums = {3, 6};
        boolean result = firstLastSix.firstLastSix(nums);
        Assertions.assertTrue(result);

    }
    @Test
    void test8FirstLastSix() {
        FirstLastSix firstLastSix = new FirstLastSix();
        int[] nums = {6};
        boolean result = firstLastSix.firstLastSix(nums);
        Assertions.assertTrue(result);

    }
    @Test
    void test9FirstLastSix() {
        FirstLastSix firstLastSix = new FirstLastSix();
        int[] nums = {3};
        boolean result = firstLastSix.firstLastSix(nums);
        Assertions.assertFalse(result);

    }
    @Test
    void test10FirstLastSix() {
        FirstLastSix firstLastSix = new FirstLastSix();
        int[] nums = {5,6};
        boolean result = firstLastSix.firstLastSix(nums);
        Assertions.assertTrue(result);

    }
    @Test
    void test11FirstLastSix() {
        FirstLastSix firstLastSix = new FirstLastSix();
        int[] nums = {5,5};
        boolean result = firstLastSix.firstLastSix(nums);
        Assertions.assertFalse(result);

    }
    @Test
    void test12FirstLastSix() {
        FirstLastSix firstLastSix = new FirstLastSix();
        int[] nums = {1,2,3,4,6};
        boolean result = firstLastSix.firstLastSix(nums);
        Assertions.assertTrue(result);

    }
}
