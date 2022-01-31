package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalcDemoTest {

    @Test
    void addTwoAndThreeReturnsFive() {
        //Arrange
        CalcDemo calcDemo = new CalcDemo();
        //Act
        int result = calcDemo.add(2, 3);
        //Assert
        assertEquals(5, result, "2+3 should be 5");
    }

    @Test
    void isEvenReturnsTrueForValueTwo() {
        CalcDemo calcDemo = new CalcDemo();

        boolean result = calcDemo.isEven(2);

        assertTrue(result);
    }

    @Test
    void isEvenReturnsFalseForValueOne() {
        CalcDemo calcDemo = new CalcDemo();

        boolean result = calcDemo.isEven(1);

        assertFalse(result);
    }

    @Test
    void positiveNumbersOnlyThrowsExceptionForNegativeValue() {
        CalcDemo calcDemo = new CalcDemo();

        assertThrows(IllegalArgumentException.class,
                () -> calcDemo.positiveNumbersOnly(-1));
    }

    @Test
    void greetingReturnsGodMorgonBeforeTen() {
        TimeProvider timeProvider = new TimeProvider() {
            @Override
            public int getHourOfTheDay() {
                return 9;
            }
        };
        CalcDemo calcDemo = new CalcDemo(timeProvider);

        String result = calcDemo.greeting();

        assertEquals("God morgon", result);
    }


}
