package org.example;

import java.time.LocalTime;

public class CalcDemo {

    public int add(int a, int b) {
        return a + b;
    }

    public boolean isEven(int value) {
        return value % 2 == 0;
    }

    public int positiveNumbersOnly(int value) {
        if (value < 0)
            throw new IllegalArgumentException();
        return value;
    }

    private TimeProvider timeProvider;

    public CalcDemo() {

    }

    public CalcDemo(TimeProvider timeProvider) {
        this.timeProvider = timeProvider;
    }

    public String greeting() {
        if (timeProvider.getHourOfTheDay() < 10)
            return "God morgon";
        else
            return "God dag";
    }

    public static void main(String[] args) {
        CalcDemo calcDemo = new CalcDemo(new CurrentTimeProvider());

        System.out.println(calcDemo.greeting());
    }
}

interface TimeProvider {
    int getHourOfTheDay();
}

class CurrentTimeProvider implements TimeProvider {
    @Override
    public int getHourOfTheDay() {
        return LocalTime.now().getHour();
    }
}

