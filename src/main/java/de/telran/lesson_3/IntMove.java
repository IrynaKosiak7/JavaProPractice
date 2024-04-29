package de.telran.lesson_3;

public interface IntMove {
    boolean isWings = false;
    default void move() {

        System.out.println(" With foot " + calcSpeed());
    }

    private int calcSpeed() {
        return 20;
    }


}
