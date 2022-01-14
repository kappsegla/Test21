package org.example;

public class Brackets {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1)
            return false;

        if (bracketCount(s)) return false;
        return true;
    }

    private boolean bracketCount(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[')
                count++;
            else
                count--;

            if (count < 0)
                return true;
        }
        return false;
    }
}
