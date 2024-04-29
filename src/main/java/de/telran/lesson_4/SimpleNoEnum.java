package de.telran.lesson_4;

public class SimpleNoEnum {
    public static void main(String[] args) {
    // DayOfWeekEnum dayOfWeek = new DayOfWeekEnum ("Monday");
        DayOfWeekEnum dayOfWeek1 = DayOfWeekEnum.MONDAY;
        System.out.println(dayOfWeek1);
        DayOfWeekEnum dayOfWeek2 = DayOfWeekEnum.THURSDAY;
        System.out.println(dayOfWeek2);

        for (DayOfWeekEnum day: DayOfWeekEnum.values()) {
            System.out.println(day);
            System.out.println(day.getCalories());
        }
    }
}
