package org.example;

import java.util.ArrayDeque;
import java.util.Deque;

public class Brackets {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (isOpeningBracket(c))
                stack.push(c);
            else if (stack.isEmpty() || isNotMatchingBrackets(c, stack.pop()))
                return false;
        }
        return stack.isEmpty();
    }

    private boolean isOpeningBracket(char c) {
        return c == '(' || c == '[' || c == '{';
    }

    private boolean isNotMatchingBrackets(char closingBracket, char openingBracket) {
        if (closingBracket == ')' && openingBracket == '(')
            return false;
        if (closingBracket == ']' && openingBracket == '[')
            return false;
        return closingBracket != '}' || openingBracket != '{';
    }
}
