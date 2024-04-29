package de.telran.lesson_2;

public class Unicorn extends Horse{
    private boolean isHorn;
    public void fight(){
        System.out.println(name + " figs, when it has a horn  " + isHorn);
    }
    public Unicorn(String name, int weight, int speed, boolean isHorn) {
        super(name, weight, speed);
        this.isHorn = isHorn;
    }

    @Override
    public String toString() {
        return "Unicorn{" +
                "isHorn=" + isHorn +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", speed=" + speed +
                '}';
    }

    public boolean isHorn() {
        return isHorn;
    }
}
