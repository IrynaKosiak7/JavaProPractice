package de.telran.lesson_2;

public class SimplePegas {
    public static void main(String[] args) {
        Horse horse1 = new Horse();
        System.out.println(horse1);

        Horse horse2 = new Horse("Vasya", 5000, 50);
        System.out.println(horse2);

        Pegasus pegasus1 = new Pegasus("Peter", 2000, 70, 50 );
        pegasus1.run();
        System.out.println(pegasus1);
        pegasus1.fly();

        Unicorn unicorn1 = new Unicorn("Alex", 3000, 60, true);
        unicorn1.run();
        unicorn1.fight();
        System.out.println(unicorn1.toString());

        SwimmingUnicorn swimmUnicorn1 = new SwimmingUnicorn("Gloria", 10000, 40, true, 70 );
        swimmUnicorn1.run();
        swimmUnicorn1.fight();
        swimmUnicorn1.swim();
        System.out.println(swimmUnicorn1.toString());

    }
}
