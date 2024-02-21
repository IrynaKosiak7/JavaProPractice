package de.telran.lesson_1;

public class SimpleCoffee {
    public static void main(String[] args) {
        CoffeAutomat aut1 = new CoffeAutomat();
        aut1.setName("Ferrari");
        aut1.setCountTypeCoffee(10);
        aut1.setCountWater(10);

        aut1.putCoin(50);
        aut1.getCoffee();
        CoffeAutomat aut2 = new CoffeAutomat("Ferrari", 10, 10, true);

    }
}
