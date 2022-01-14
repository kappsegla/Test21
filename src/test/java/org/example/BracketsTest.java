package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BracketsTest {

    @Test
    void emptyStringShouldBeValid() {
        Brackets brackets = new Brackets();

        boolean result = brackets.isValid("");

        assertTrue(result);
    }
    
}
