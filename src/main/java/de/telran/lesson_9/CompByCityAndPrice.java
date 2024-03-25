package de.telran.lesson_9;

import java.util.Comparator;

public class CompByCityAndPrice implements Comparator<House> {

    public CompByCityAndPrice() {
    }

    @Override
    public int compare(House o1, House o2) {
        int result = o1.getCity().compareTo(o2.getCity());
        if (result == 0) Integer.compare(o1.getPrice(), o2.getPrice());
        return result;
    }
}
