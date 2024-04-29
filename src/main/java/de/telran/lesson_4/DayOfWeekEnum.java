package de.telran.lesson_4;

public enum DayOfWeekEnum {
    MONDAY("MONDAY",3000),
    TUESDAY("TUESDAY",2000),
    WEDNESDAY("WEDNESDAY",1500),
    THURSDAY("THURSDAY",2000),
    FRIDAY("FRIDAY",15000),
    SATURDAY("SATURDAY",1000),
    SUNDAY("SUNDAY",1500);
    private String title;
    private int calories;

    DayOfWeekEnum(String title,int calories) {
        this.title = title;
        this.calories = calories;
    }

    public String getTitle() {
        return title;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "DayOfWeekEnum{" +
                "title='" + title + '\'' +
                ", calories=" + calories +
                '}';
    }
}
