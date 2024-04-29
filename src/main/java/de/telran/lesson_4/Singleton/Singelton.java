package de.telran.lesson_4.Singleton;

public class Singelton {
    private static Singelton INSTANCE;
    private String info = "Inital info class";

    private Singelton() {

    }

    public static Singelton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singelton();
        }
        return INSTANCE;
    }

}
