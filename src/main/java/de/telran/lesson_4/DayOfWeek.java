package de.telran.lesson_4;

public class DayOfWeek {
    private String title;

    private DayOfWeek(String title) {
        this.title = title;
    }

//    public static DayOfWeek MONDAY = new DayOfWeek("MONDAY");
//    public static DayOfWeek TUESDAY = new DayOfWeek("TUESDAY");
//    public static DayOfWeek WEDNESDAY = new DayOfWeek("WEDNESDAY");
//    public static DayOfWeek THURSDAY = new DayOfWeek("THURSDAY");
//    public static DayOfWeek FRIDAY = new DayOfWeek("FRIDAY");
//    public static DayOfWeek SATURDAY = new DayOfWeek("SATURDAY");
//    public static DayOfWeek SUNDAY = new DayOfWeek("SUNDAY");


    @Override
    public String toString() {
        return "DayOfWeek{" +
                "title='" + title + '\'' +
                '}';
    }
}
