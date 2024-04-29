package de.telran.lesson_11;

public class Transport implements Comparable<Transport>{
    private String name;
    private  int priorityLevel;
    private TransportTypes types;

    public Transport(String name, int priorityLevel, TransportTypes types) {
        this.name = name;
        this.priorityLevel = priorityLevel;
        this.types = types;
    }

    public String getName() {
        return name;
    }

    public int getPriorityLevel() {
        return priorityLevel;
    }

    public TransportTypes getTypes() {
        return types;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPriorityLevel(int priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public void setTypes(TransportTypes types) {
        this.types = types;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "name='" + name + '\'' +
                ", priorityLevel=" + priorityLevel +
                ", types=" + types +
                '}';
    }

    @Override
    public int compareTo(Transport o) {
        return Integer.compare(priorityLevel,o.priorityLevel);
    }
}
