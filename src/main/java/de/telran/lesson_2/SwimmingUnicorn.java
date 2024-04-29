package de.telran.lesson_2;

public class SwimmingUnicorn extends Unicorn{
private int speedSwim;
    public SwimmingUnicorn(String name, int weight, int speed, boolean isHorn, int speedSwim) {
        super(name, weight, speed, isHorn);
        this.speedSwim = speedSwim;
    }
    public void swim(){
        System.out.println(name + " swims with speed " + speedSwim);
    }

    @Override
    public String toString() {
        return "SwimmingUnicorn{" +
                "speedSwim=" + speedSwim +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", speed=" + speed +
                ", isHorn= " + super.isHorn() +
                '}';
    }


}
