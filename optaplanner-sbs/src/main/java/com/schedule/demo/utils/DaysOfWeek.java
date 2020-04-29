package com.schedule.demo.utils;

import java.util.stream.Stream;

public enum DaysOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public static Stream<DaysOfWeek> stream() {
        return Stream.of(DaysOfWeek.values());
    }
}
