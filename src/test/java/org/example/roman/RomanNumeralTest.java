package org.example.roman;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralTest {

    RomanNumeral romanNumeral = new RomanNumeral();

    @Test
    void convertXIShouldReturnEleven() {
        int num = romanNumeral.convert("XI");

        assertEquals(11, num, "XI should return 11");
    }

    @Test
    void romanNumberMDCLXVIShouldReturn1666() {
        int result = romanNumeral.convert("MDCLXVI");

        assertEquals(1666, result, "Roman number MDCLXVI is 1666");
    }

    @DisplayName("Single character roman number")
    @ParameterizedTest(name = "{0} is {1}")
    @CsvSource({
            "I,1",
            "V,5",
            "X,10",
            "L,50",
            "C,100",
            "D,500",
            "M,1000"
    })
    void singleCharacter(String value, int expected) {
        int result = romanNumeral.convert(value);

        assertEquals(expected, result, "Roman number " + value + " should be " + expected);
    }

    @Test
    void romanNumberIVShouldReturnFour() {
        int result = romanNumeral.convert("IV");

        assertEquals(4, result, "Roman number IV is 4");
    }

    @Test
    void romanNumberxThrowsException() {
        assertThrows(NullPointerException.class, () -> romanNumeral.convert("x"));
    }
}
