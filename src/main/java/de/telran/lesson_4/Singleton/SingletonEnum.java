package de.telran.lesson_4.Singleton;

public enum SingletonEnum {
    INSTANCE ("Inital class info");
    private String info;

    SingletonEnum(String info) {
        this.info = info;
    }

    public SingletonEnum getInstance() {
        return INSTANCE;
    }
}
