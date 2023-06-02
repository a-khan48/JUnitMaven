package org.UnitTesting;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloNameTest {

    @DisplayName("Test HelloName() method")
    @Test
    public void helloNameTest() {
        HelloName helloName = new HelloName();
        String name = "Ahmad";
        String expected = "Hello Ahmad!";
        // Act
        String result = helloName.helloName(name);
        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void helloNameTest_NoName() {
        //arrange
        HelloName helloName = new HelloName();
        String name = "";
        String expected = "Hello !";
        //act
        String result = helloName.helloName(name);
        //assert
        assertEquals(expected, result);
    }

}
