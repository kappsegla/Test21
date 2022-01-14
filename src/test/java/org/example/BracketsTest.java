package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BracketsTest {

    @Test
    void emptyStringShouldBeValid() {
        Brackets brackets = new Brackets();

        boolean result = brackets.isValid("");

        assertTrue(result);
    }

    @Test
    void unevenNumberOfBracketsShouldNotBeValid() {
        Brackets brackets = new Brackets();

        boolean result = brackets.isValid("(()");

        assertFalse(result);
    }

    @Test
    void startingWithClosingBracketShouldBeInvalid() {
        Brackets brackets = new Brackets();

        boolean result = brackets.isValid(")(");

        assertFalse(result);
    }
}
