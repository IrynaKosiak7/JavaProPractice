package de.telran.lesson_14;

import java.util.Objects;

public class Manager{
    private   String name;
    private   String position;
    private String departmen;
    private double salary;

    public Manager(String name, String position, String departmen, double salary) {
        this.name = name;
        this.position = position;
        this.departmen = departmen;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartmen() {
        return departmen;
    }

    public void setDepartmen(String departmen) {
        this.departmen = departmen;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", departmen='" + departmen + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manager manager = (Manager) o;
        return Double.compare(salary, manager.salary) == 0 && Objects.equals(name, manager.name) && Objects.equals(position, manager.position) && Objects.equals(departmen, manager.departmen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position, departmen, salary);
    }
}
